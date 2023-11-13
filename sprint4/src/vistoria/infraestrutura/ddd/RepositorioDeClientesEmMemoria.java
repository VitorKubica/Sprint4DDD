package vistoria.infraestrutura.ddd;

import java.util.ArrayList;
import java.util.List;

import vistoria.dominio.ddd.Cliente;
import vistoria.dominio.repositorios.ddd.RepositorioDeCliente;

public class RepositorioDeClientesEmMemoria implements RepositorioDeCliente {

	private List<Cliente> clientes = new ArrayList<>();
	
	@Override
	public Cliente buscarPorID(int idCliente) {
		
		for (Cliente cliente : clientes) {
			if (cliente.getIdCliente() == idCliente) {
				return cliente;
			}	
		}
		
		return null;
	}

	@Override
	public void salvar(Cliente novoCliente) {
		this.clientes.add(novoCliente);
	}

	@Override
	public List<Cliente> listarTodos() {
		return clientes;
	}
}
