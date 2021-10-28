/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

/**
 *
 * @author Jadson Nobre
 */
public class Conteudo {
    private String nome;
    private String assunto;
    private float size;
    private Localizacao pos;
    private String link;

    public Conteudo(String nome, String assunto, float size, Localizacao pos, String link) {
        this.nome = nome;
        this.assunto = assunto;
        this.size = size;
        this.pos = pos;
        this.link = link;
    }

    public Conteudo(String nome, String assunto, float size, Localizacao pos) {
        this.nome = nome;
        this.assunto = assunto;
        this.size = size;
        this.pos = pos;
    }
    
    //Para acessos no banco, sem que seja
    //necessario preencher o objeto previamente
    public Conteudo(){
        
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public Localizacao getPos() {
        return pos;
    }

    public void setPos(Localizacao pos) {
        this.pos = pos;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
    
    public Double calcValor(){
        return 0.0;
    }
}
