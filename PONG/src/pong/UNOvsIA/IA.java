
package pong.UNOvsIA;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Alba
 */
public class IA {
    public int x;
    public int y;
    public int tamanhoX;
    public int tamanhoY;
    public int vY;
    private int realY;
    private Color colorRaqueta;
    
    //constructor con parametros
    public IA(int x,int y,int tamanhoX,int tamanhoY,Color colorRaqueta) {
        this.x=x;
        this.y=y;
        this.tamanhoX=tamanhoX;
        this.tamanhoY=tamanhoY;
        this.colorRaqueta=colorRaqueta;
        vY = 3;
    }
    
            public void ComputerMove(Bola b) {
        realY = y + (tamanhoY / 2);
 
        if (b.vX < 0) {
       
            if (realY < 150) {
                y += vY;
            }
           
            else if (realY > 150) {
                y -= vY;
            }
        } else if (b.vX > 0) {
        
            if ( realY != b.y) {
       
                if (b.y < realY) {
                    y -= vY;
                }
      
                else if (b.y > realY) {
                    y += vY;
                }
            }
        }
    }
    
     
    public void dibujarRaqueta(Graphics g) {
        g.setColor(colorRaqueta);
        g.fillRect(x, y, tamanhoX, tamanhoY);
    }
}
