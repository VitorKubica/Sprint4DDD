package vistoria.dominio.repositorios.ddd;

import java.util.List;

import vistoria.dominio.ddd.VistoriaOnline;

public interface RepositorioDeVistoria {
	
    public void salvar(VistoriaOnline vistoriaonline);
 
    public List<VistoriaOnline> listarTodos();
}
