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
public class Imagem extends Conteudo{
    private String filename;
    
    public Imagem(){
        
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }
    
    @Override
    public Double calcValor(){
        return 6.0 * this.getSize();
    }
}
