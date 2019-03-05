package pong.UNOvsIA;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Alba
 */
public class Jugador {

    public int x;
    public int y;
    public int tamanhoX;
    public int tamanhoY;
    public int vY;
    private Color colorRaqueta;

    //constructor con parametros
    public Jugador(int x, int y, int tamanhoX, int tamanhoY, Color colorRaqueta) {
        this.x = x;
        this.y = y;

        this.tamanhoX = tamanhoX;
        this.tamanhoY = tamanhoY;
        this.colorRaqueta = colorRaqueta;
    }

    //metodo para mover la raqueta del jugador
    public void Mover(int dy) {
        y += dy;
    }
    
    //metodo para mover la raqueta con el raton
    public void MoverPorRaton(int nuevoY) {
        y = nuevoY;
    }
    
    //metodo para dibujar raqueta
        public void dibujarRaqueta(Graphics g) {
        g.setColor(colorRaqueta);
        g.fillRect(x, y, tamanhoX, tamanhoY);
    }
    
}
