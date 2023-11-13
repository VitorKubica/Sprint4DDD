package vistoria.dominio.ddd;

import java.util.List;

public class VistoriaOnline {
	public int idVistoria;
	private List<String> imagens;
	private String nrSerie;
	private int idBicicleta;

	public VistoriaOnline(int idVistoria, List<String> imagens, String nrSerie, int idBicicleta) {
		this.idVistoria = idVistoria;
		this.imagens = imagens;
		this.nrSerie = nrSerie;
		this.idBicicleta = idBicicleta;
	}

	public List<String> getImagens() {
		return imagens;
	}

	public void setImagens(List<String> imagens) {
		this.imagens = imagens;
	}

	public int getIdVistoria() {
		return idVistoria;
	}

	public void setIdVistoria(int idVistoria) {
		this.idVistoria = idVistoria;
	}

	public String getNrSerie() {
		return nrSerie;
	}

	public void setNrSerie(String nrSerie) {
		this.nrSerie = nrSerie;
	}

	public int getIdBicicleta() {
		return idBicicleta;
	}

	public void setIdBicicleta(int idBicicleta) {
		this.idBicicleta = idBicicleta;
	}
}
