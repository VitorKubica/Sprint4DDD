package vistoria.aplicacao.ddd;

import vistoria.dominio.ddd.Cliente;
import vistoria.dominio.repositorios.ddd.RepositorioDeCliente;

public class CadastrarCliente {
	private RepositorioDeCliente repositorio;
	 
    public CadastrarCliente(RepositorioDeCliente repositorio) {
        this.repositorio = repositorio;
    }
 
    public void cadastrar( String nome, String email, int idCliente, String senha) {
        Cliente clienteExistente = repositorio.buscarPorID(idCliente);
 
        if (clienteExistente != null) {
            throw new IllegalArgumentException("Já existe um cliente com o ID informado");
        }
 
        Cliente novoCliente = new Cliente( nome,email, idCliente, senha);
        this.repositorio.salvar(novoCliente);
    }
}


