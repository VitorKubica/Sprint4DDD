package vistoria.aplicacao.ddd;

import java.util.List;

import vistoria.dominio.ddd.Bike;
import vistoria.dominio.ddd.Cliente;
import vistoria.dominio.ddd.VistoriaOnline;
import vistoria.dominio.repositorios.ddd.RepositorioDeBike;
import vistoria.dominio.repositorios.ddd.RepositorioDeCliente;
import vistoria.dominio.repositorios.ddd.RepositorioDeVistoria;

public class RealizarVistoria {
		private RepositorioDeCliente repoCliente;
		private RepositorioDeVistoria repoVistorias;
		private RepositorioDeBike repoBikes;

		public RealizarVistoria(Cliente cliente, Bike bike, int idVistoria, List<String> imagens, String nrSerie, int idBicicleta) {
			cliente = this.repoCliente.buscarPorID(cliente.idCliente);

			if (cliente == null) {
				throw new IllegalArgumentException("Não existe cliente com o cpf informado");
			}

			bike = this.repoBikes.buscarPorId(idBicicleta);

			VistoriaOnline vistoriaonline = new VistoriaOnline(idVistoria, imagens, nrSerie, bike.idBicicleta);
			this.repoVistorias.salvar(vistoriaonline);
	}

}
