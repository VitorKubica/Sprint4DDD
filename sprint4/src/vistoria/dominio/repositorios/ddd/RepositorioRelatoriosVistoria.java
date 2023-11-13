package vistoria.dominio.repositorios.ddd;

import java.util.List;

import vistoria.aplicacao.ddd.GerarRelatorio;
import vistoria.dominio.ddd.VistoriaOnline;

public interface RepositorioRelatoriosVistoria {
	
	public void salvar(GerarRelatorio gerarrelatorio);
	 
    public List<VistoriaOnline> listarTodos();
}
