package vistoria.aplicacao.ddd;

import vistoria.dominio.ddd.Bike;
import vistoria.dominio.repositorios.ddd.RepositorioDeBike;

public class CadastrarBike {
	private RepositorioDeBike repositorio;
	 
    public CadastrarBike(RepositorioDeBike repositorio) {
        this.repositorio = repositorio;
    }
 
    public void cadastrar(int idBicicleta, int idCliente, String tipo, String modelo, String componentes, int ano) {
 
        // Verificar se já existe uma bike com o mesmo ID_BICICLETA
        Bike bikeExistente = this.repositorio.buscarPorId(idBicicleta);
 
        if (bikeExistente != null) {
            throw new IllegalArgumentException("Já existe uma bike cadastrada com o ID_BICICLETA informado");
        }
 
        // Criar uma nova instância de Bike com os atributos informados
        Bike novaBike = new Bike(idBicicleta, idCliente, tipo, modelo, componentes, ano);
        this.repositorio.salvar(novaBike);
    }
}


