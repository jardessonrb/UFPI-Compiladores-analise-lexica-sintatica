package ufpi.compiladores.backend;

import java.util.ArrayList;
import java.util.List;

public class ListaAtribuicao {
    private List<String> expressoes = new ArrayList<>();
    private String nomeVariavel = "";

    public void addExpressao(String expressao){
        expressoes.add(expressao);
    }

    public int qntExpressoes(){
        return this.expressoes.size();
    }

    public void print(){
        expressoes.forEach(exp -> System.out.println(exp));
    }

    public String concat(){
        String express = "";
        String ultima = this.nomeVariavel+" = _t"+(expressoes.size() - 1);
        expressoes.add(ultima);
        for (int i = 0; i < expressoes.size(); i++) {
            express += expressoes.get(i) + "\n";
        }



        expressoes.clear();
        return express;
    }

    public void nomeVariavel(String nome){
        this.nomeVariavel = nome;
    }
}
