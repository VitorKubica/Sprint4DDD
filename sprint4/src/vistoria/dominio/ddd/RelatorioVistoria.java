package vistoria.dominio.ddd;

import java.util.Date;

public class RelatorioVistoria {
	 	public int idRelatorioVistoria;
	    private Date dtVistoria;
	    private String observacoes;
	    private String stVistoria;
	    private int idVistoria;

	    public RelatorioVistoria() {
	        
	    }

	    public RelatorioVistoria(int idRelatorioVistoria, Date dtVistoria, String observacoes, String stVistoria, int idVistoria) {
	        this.idRelatorioVistoria = idRelatorioVistoria;
	        this.dtVistoria = dtVistoria;
	        this.observacoes = observacoes;
	        this.stVistoria = stVistoria;
	        this.idVistoria = idVistoria;
	    }

	    public int getIdRelatorioVistoria() {
	        return idRelatorioVistoria;
	    }

	    public void setIdRelatorioVistoria(int idRelatorioVistoria) {
	        this.idRelatorioVistoria = idRelatorioVistoria;
	    }

	    public Date getDtVistoria() {
	        return dtVistoria;
	    }

	    public void setDtVistoria(Date dtVistoria) {
	        this.dtVistoria = dtVistoria;
	    }

	    public String getObservacoes() {
	        return observacoes;
	    }

	    public void setObservacoes(String observacoes) {
	        this.observacoes = observacoes;
	    }

	    public String getStVistoria() {
	        return stVistoria;
	    }

	    public void setStVistoria(String stVistoria) {
	        this.stVistoria = stVistoria;
	    }

	    public int getIdVistoria() {
	        return idVistoria;
	    }

	    public void setIdVistoria(int idVistoria) {
	        this.idVistoria = idVistoria;
	    }
	}
