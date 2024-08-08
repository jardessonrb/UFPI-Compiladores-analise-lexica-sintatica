package ufpi.compiladores.backend;

public class Variavel {

    private String nome;
    private String tipo;

    private String valor;
    public Variavel(String nome){
        this.nome = nome;
    }
    public Variavel(String nome, String tipo){
        this.nome = nome;
        this.tipo = tipo;
    }
    public Variavel(String nome, String tipo, String valor){
        this.nome = nome;
        this.tipo = tipo;
        this.valor = valor;
    }

    public void atualizarTipo(String tipo){
        this.tipo = tipo;
    }
    public void atualizarValor(String valor){
        this.valor = valor;
    }

    public String toString(){
        return this.nome + " " +this.tipo;
    }
}
