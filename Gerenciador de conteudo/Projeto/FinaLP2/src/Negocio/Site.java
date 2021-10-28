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
public class Site {
    private String nome;
    private String URL;
    private ArrayList<Pagina> paginas;

    public Site(String nome, String URL) {
        this.nome = nome;
        this.URL = URL;
        paginas = new ArrayList<>();
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public ArrayList<Pagina> getPaginas() {
        return paginas;
    }
    
    public void AddPagina(Pagina pagina){
        paginas.add(pagina);
    }

    public void setPaginas(ArrayList<Pagina> paginas) {
        this.paginas = paginas;
    }
    
    
}
