package vistoria.dominio.ddd;

import java.util.ArrayList;
import java.util.List;


public class Chatbot {
    private String nome;
    private List<String> listaDuvidas;
    private List<String> listaRespostas;
    private String funcao;

    // Construtor padrão (sem argumentos)
    
    public Chatbot() {
       
        this.nome = "";
        this.listaDuvidas = new ArrayList<>();
        this.listaRespostas = new ArrayList<>();
        this.funcao = "";
    }

    // Construtor que aceita argumentos
    public Chatbot(String nome, List<String> listaDuvidas, List<String> listaRespostas, String funcao) {
        this.nome = nome;
        this.listaDuvidas = listaDuvidas;
        this.listaRespostas = listaRespostas;
        this.funcao = funcao;
    }

    // Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<String> getListaDuvidas() {
        return listaDuvidas;
    }

    public void setListaDuvidas(List<String> listaDuvidas) {
        this.listaDuvidas = listaDuvidas;
    }

    public List<String> getListaRespostas() {
        return listaRespostas;
    }

    public void setListaRespostas(List<String> listaRespostas) {
        this.listaRespostas = listaRespostas;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
}