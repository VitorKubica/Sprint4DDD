package vistoria.aplicacao.ddd;

import java.util.Date;

import vistoria.dominio.ddd.Bike;
import vistoria.dominio.ddd.Cliente;
import vistoria.dominio.repositorios.ddd.RepositorioRelatoriosVistoria;

public class GerarRelatorio {
    private RepositorioRelatoriosVistoria repoVistorias;
    private boolean bikeExiste;

    public GerarRelatorio(Cliente cliente, Bike bike, int idRelatorioVistoria, Date dtVistoria, String observacoes,
            boolean stVistoria, int idVistoria) {

        boolean status = Aprovar(stVistoria);

        GerarRelatorio relatoriovistoria = new GerarRelatorio(cliente, bike, idRelatorioVistoria, dtVistoria,
                observacoes, status, idVistoria);

        this.repoVistorias.salvar(relatoriovistoria);
    }

    // Método para aprovar/reprovar a vistoria
    public boolean Aprovar(boolean stVistoria) {
        if (!bikeExiste) {
            return false;
        }
        return stVistoria;
    }
}
