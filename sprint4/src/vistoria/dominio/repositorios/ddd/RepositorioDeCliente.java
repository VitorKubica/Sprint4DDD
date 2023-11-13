package vistoria.dominio.repositorios.ddd;

import java.util.List;

import vistoria.dominio.ddd.Cliente;

public interface RepositorioDeCliente {
 
    public Cliente buscarPorID(int idCliente);
 
    public void salvar(Cliente novoCliente);
 
    public List<Cliente> listarTodos();
}
