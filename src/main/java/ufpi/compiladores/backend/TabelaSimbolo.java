package ufpi.compiladores.backend;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TabelaSimbolo {
    private int cont = 0;
    private Map<String, Variavel> tabela = new HashMap<String, Variavel>();
    private List<String> variaveisEmDeclaracao = new ArrayList<String>();

    public String newTemp() {
        cont++;
        return "_t" + Integer.toString(cont);
    }

    public String newLabel() {
        System.out.println();
        cont++;
        return ".l" + Integer.toString(cont);
    }

    public Boolean isVariavelDeclarada(String nome){
        return tabela.containsKey(nome);
    }

    public void declararVariavel(String nome, Variavel variavel){
        variaveisEmDeclaracao.add(nome);
        if(tabela.containsKey(nome)){
            System.out.println("Erro: Variavel já declarada: "+nome);
        }
        tabela.put(nome, variavel);
    }

    public void printVariaveis(){
        tabela.values().stream().forEach( v -> System.out.println(v.toString()));
    }

    public void teste(){
        ArrayList<String> variaveis = new ArrayList();
    }

    public void atualizarTipo(String tipo){
        variaveisEmDeclaracao.forEach(variavel -> {
            tabela.get(variavel).atualizarTipo(tipo);
        });

        variaveisEmDeclaracao.clear();
    }

}
