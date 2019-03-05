
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
    public int vy;
    private int realY;
    private Color colorRaqueta;
    
    //constructor con parametros
    public IA(int x,int y,int tamanhoX,int tamanhoY,Color colorRaqueta) {
        this.x=x;
        this.y=y;
        this.tamanhoX=tamanhoX;
        this.tamanhoY=tamanhoY;
        this.colorRaqueta=colorRaqueta;
        vy = 3;
    }
    
            public void ComputerMove(Bola b) {
        realY = y + (tamanhoY / 2);
 
        if (b.vx < 0) {
       
            if (realY < 150) {
                y += vy;
            }
           
            else if (realY > 150) {
                y -= vy;
            }
        } else if (b.vx > 0) {
        
            if ( realY != b.y) {
       
                if (b.y < realY) {
                    y -= vy;
                }
      
                else if (b.y > realY) {
                    y += vy;
                }
            }
        }
    }
    
     
    public void DrawStrick(Graphics g) {
        g.setColor(colorRaqueta);
        g.fillRect(x, y, tamanhoX, tamanhoY);
    }
}
