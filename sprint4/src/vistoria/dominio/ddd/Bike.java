package vistoria.dominio.ddd;

public class Bike {
    public int idBicicleta;
    private int idCliente;
    private String tipo;
    private String modelo;
    private String componentes;
    private int ano;

    public Bike(int idBicicleta, int idCliente, String tipo, String modelo, String componentes, int ano) {
        if (tipo == null || tipo.isBlank()) {
            throw new IllegalArgumentException("Tipo não pode estar vazio");
        } else if (modelo == null || modelo.isBlank()) {
            throw new IllegalArgumentException("Modelo não pode estar vazio");
        } else if (componentes == null || componentes.isBlank()) {
            throw new IllegalArgumentException("Componentes não podem estar vazios");
        } else if (ano == 0) {
            throw new IllegalArgumentException("Informe um ano válido");
        }

        this.idBicicleta = idBicicleta;
        this.idCliente = idCliente;
        this.tipo = tipo;
        this.modelo = modelo;
        this.componentes = componentes;
        this.ano = ano;
    }

    public int getIdBicicleta() {
        return this.idBicicleta;
    }

    public int getIdCliente() {
        return this.idCliente;
    }

    public String getTipo() {
        return this.tipo;
    }

    public String getModelo() {
        return this.modelo;
    }

    public String getComponentes() {
        return this.componentes;
    }

    public int getAno() {
        return this.ano;
    }
}
