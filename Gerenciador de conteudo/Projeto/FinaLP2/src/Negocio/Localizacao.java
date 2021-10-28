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
public class Localizacao {
    private int coordX;
    private int coordY;

    public Localizacao(int coordX, int coordY) {
        this.coordX = coordX;
        this.coordY = coordY;
    }
    
    public int getCoordX() {
        return coordX;
    }

    public void setCoordX(int coordX) {
        this.coordX = coordX;
    }

    public int getCoordY() {
        return coordY;
    }

    public void setCoordY(int coordY) {
        this.coordY = coordY;
    }
    
    
}
