/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pong;

import java.awt.geom.Ellipse2D;
import java.awt.*;

/**
 *
 * @author r618b
 */
public class MoviminetoPelota {

    private int x;
    private int y;
    private int nx = 1, ny = 1; //varia para mover la posicion de la pelota
    private final int ancho = 19;
    private final int alto = 19;

    public MoviminetoPelota(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Ellipse2D getMovimietnoPelota() {
        return new Ellipse2D.Double(x, y, ancho, alto);
    }

    public void mover(Rectangle limite) {
        x += nx;
        y += ny;
        if (x+19 > limite.getMaxX()) {     //si la pelota alcanza el maximo de la zona jugable se cambia la direccion
            nx = -nx;
        }
        if (y+19 > limite.getMaxY()) {  ///pongo 19porque es el tamaño de la pelota, si fuese +0 la pelota atraviesa el limite
            ny = -ny;
        }
        if (x < 0) {
            nx = -nx;
        }
        if (y < 0) {
            ny = -ny;
        }      
    }

       
}
