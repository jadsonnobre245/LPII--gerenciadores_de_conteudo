/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import java.util.ArrayList;

/**
 *
 * @author Jadson Nobre
 */
public class Pagina {
    private String nome;
    private boolean ehinicial;
    private ArrayList<Conteudo> conteudos;

    public Pagina(String nome, boolean ehinicial) {
        this.nome = nome;
        this.ehinicial = ehinicial;
        conteudos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isEhinicial() {
        return ehinicial;
    }

    public void setEhinicial(boolean ehinicial) {
        this.ehinicial = ehinicial;
    }

    public ArrayList<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(ArrayList<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }
    
    public void addConteudo(Conteudo conteudo){
        conteudos.add(conteudo);
    }
    
    public Double calcValor(){
        Double valor = 0.0;
        for(Conteudo conteudo : conteudos){
            valor+=conteudo.calcValor();
        }
        return valor;
    }
}
