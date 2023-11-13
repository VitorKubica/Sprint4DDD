package vistoria.fiap.apivistoria.api;

import java.net.URI;
import java.net.URISyntaxException;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Response;
import vistoria.aplicacao.ddd.CadastrarCliente;
import vistoria.dominio.ddd.Cliente;
import vistoria.dominio.repositorios.ddd.RepositorioDeCliente;
import vistoria.infraestrutura.ddd.ConexaoJDBC;
import vistoria.infraestrutura.ddd.RepositorioDeClientesEmJDBC;

@Path("clientes")
@Produces("application/json")
public class ClientesApi {
	private RepositorioDeCliente repositorioDeCliente;
	private CadastrarCliente cadastrarCliente;

	public ClientesApi() {
		ConexaoJDBC conexao = new ConexaoJDBC("oracle.jdbc.OracleDriver",
				"jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "rm551154", "210105");
		repositorioDeCliente = new RepositorioDeClientesEmJDBC(conexao);
		cadastrarCliente = new CadastrarCliente(repositorioDeCliente);
	}

	@POST
	public Response cadastrarNovoCliente(ClienteDAO cliente) throws URISyntaxException {

		try {
			this.cadastrarCliente.cadastrar( cliente.getNome(), cliente.getEmail(),cliente.getIdCliente(), cliente.getSenha());
			return Response.created(new URI("clientes/" + cliente.getIdCliente())).build();
		} catch (Exception ex) {
			return Response.serverError().entity(ex.getMessage()).build();
		}
	}

	@Path("lista")
	@GET
	public Response listarTodosClientes() {
		return Response.ok(this.repositorioDeCliente.listarTodos()).build();
	}

	@GET
	@Path("{idCliente}")
	public Response buscarPorID(@PathParam("idCliente") int idCliente) {
		Cliente retorno = this.repositorioDeCliente.buscarPorID(idCliente);

		if (retorno == null) {
			return Response.noContent().build();
		} else {
			return Response.ok(retorno).build();
		}
	}
}
