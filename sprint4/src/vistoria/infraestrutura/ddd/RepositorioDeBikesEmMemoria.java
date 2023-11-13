package vistoria.infraestrutura.ddd;

import java.util.ArrayList;
import java.util.List;

import vistoria.dominio.ddd.Bike;
import vistoria.dominio.repositorios.ddd.RepositorioDeBike;


public class RepositorioDeBikesEmMemoria implements RepositorioDeBike {

	private List<Bike> bikes = new ArrayList<>();

	@Override
	public List<Bike> pesquisarPorMarcaOuModelo1(List<String> marcaBike) {
		return null;
	}

	@Override
	public Bike buscarPorId(int idBicicleta) {

		for (Bike bikeExistente : bikes) {
			if (bikeExistente.getIdBicicleta() == idBicicleta ) {
				return bikeExistente;
			}
		}

		return null;
	}

	@Override
	public void salvar(Bike bike) {
		this.bikes.add(bike);
	}

	@Override
	public List<Bike> listarTodos() {
		return this.bikes;
	}

	@Override
	public List<Bike> buscarPorCodigo(List<String> codigosBikes) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Bike> pesquisarPorMarcaOuModelo(String pesquisa) {
		// TODO Auto-generated method stub
		return null;
	}

}
