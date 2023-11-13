package vistoria.infraestrutura.ddd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import vistoria.dominio.ddd.Cliente;
import vistoria.dominio.repositorios.ddd.RepositorioDeCliente;

public class RepositorioDeClientesEmJDBC extends AbstractDao implements RepositorioDeCliente {
	
	public RepositorioDeClientesEmJDBC(ConexaoJDBC conexao) {
		super(conexao);
	}
	
	
	@Override
	public Cliente buscarPorID(int idCliente) {
		try {
			try(Connection conn = criarConexao()) {
				try (PreparedStatement comando = conn.prepareStatement(
						"select * from T_CLIENTES where idCliente = ?")) {
					comando.setInt(1, idCliente);
					
					try (ResultSet registros = comando.executeQuery()) {						
						while(registros.next()) {
							String nome = registros.getString("nome");
							String email = registros.getString("email");
							int idcliente = registros.getInt("idCliente");
							String senha = registros.getString("senha");
							return new Cliente(nome, email, idcliente, senha);
						}
						
						return null;
					}
					
				}
			}
		} catch(Exception ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	public void salvar(Cliente novoCliente) {
		try {			
			try(Connection conn = criarConexao();
				PreparedStatement comando = 
					conn.prepareStatement(
						"insert into T_CLIENTES(nome, email, idCliente, senha) values(?, ?, ?, 	?)")) {
				comando.setString(1, novoCliente.getNome());
				comando.setString(2, novoCliente.getEmail().toString());
				comando.setInt(3, novoCliente.getIdCliente());
				comando.setString(4, novoCliente.getSenha());
				comando.executeUpdate();
			}
			
		} catch(Exception ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	public List<Cliente> listarTodos() {
		try {			
			try(Connection conn = criarConexao()) {
				try (Statement comando = conn.createStatement()) {					
					List<Cliente> retorno = new ArrayList<>();
					
					try (ResultSet registros = comando.executeQuery("select * from T_CLIENTES")) {						
					    while (registros.next()) {
					        String nome = registros.getString("nome");
					        String email = registros.getString("email");
					        int idCliente = registros.getInt("idCliente");
					        String senha = registros.getString("senha");
					        retorno.add(new Cliente(nome, email, idCliente, senha));
					    }
					}
						return retorno;
					}
				}
		} catch(Exception ex) {
			throw new RuntimeException(ex);
		}
	}

}