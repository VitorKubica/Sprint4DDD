package vistoria.dominio.repositorios.ddd;

import java.util.List;
import vistoria.dominio.ddd.Bike;

public interface RepositorioDeBike {
 
    List<Bike> buscarPorCodigo(List<String> codigosBikes);
 
    Bike buscarPorId(int idBicicleta);
 
    void salvar(Bike bike);
 
    List<Bike> pesquisarPorMarcaOuModelo(String pesquisa);
 
    List<Bike> listarTodos();
 
    List<Bike> pesquisarPorMarcaOuModelo1(List<String> marcaBike);
}