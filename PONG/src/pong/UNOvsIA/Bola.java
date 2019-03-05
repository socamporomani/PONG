package pong.UNOvsIA;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 *
 * @author Alba
 */
//SE PUEDE IMPLEMENTAR EN LAS CLASES DEL PAQUETE PRINCIPAL
public class Bola {

    private int margen;
    public int x;
    public int y;
    public int vX;
    public int vY;

    //direcciones que puede tomar la bola
    private int BOLA_ARR;
    private int BOLA_IZQ;
    private int BOLA_DER;
    private int BOLA_ABAJ;

    //direcciones que puede utilizar el jugador
    private int JUG_ARR;
    private int JUG_ABAJ;

    //direcciones que puede tomar la IA
    private int IA_ARR;
    private int IA_ABAJ;

    private int maxVx = 5;
    private int maxVy = 5;

    private Color colorBola;

    public Bola(int m, int x, int y, int vx, int vy, Color colorBola) {
        margen = m;
        this.x = x;
        this.y = y;
        this.vX = vX;
        this.vY = vY;
        this.colorBola = colorBola;
    }

        public void mover() {
        
        if (vX > maxVx) vX = maxVx;
        else if (vX < -maxVx) vX = -maxVx;
        else if (vY > maxVy) vY = maxVy;
        else if (vY < -maxVy) vY = -maxVy;
        
        x += vX;
        y += vY;
    }
        
       public int ubicacionBola() {
        if (vY > 0) {
            if (y > 280) {
                vY = -vY;
                return 0;
            }
        } else if (vY < 0) {
            if (y < 40) {
                vY = -vY;
                return 0;
            }
        }
        if(x<20)
            return 1;
        else if(x>375)
            return 2;
        
        
        
        return 0;
}
      public void JColision(Jugador RaquetaJug) {
        
        BOLA_ARR = y - margen;
        BOLA_ABAJ = y + margen;
        BOLA_IZQ = x - margen;
        BOLA_DER = x + margen;
        
        
        JUG_ARR = RaquetaJug.y;
        JUG_ABAJ = RaquetaJug.y + RaquetaJug.tamanhoY;
        
        
        if ((BOLA_ARR >= JUG_ARR  - 10) && (BOLA_ABAJ <= JUG_ABAJ + 10)) {
            
            if (BOLA_IZQ <= 30 ) {
                vX = - vX;
                
                
                if (RaquetaJug.vY < 0) {
                    vY --;
                    
                } else if (RaquetaJug.vY > 0) {
                    vY += RaquetaJug.vY;
                    
                }
            }
        }
    }
     public void DrawBall(Graphics2D g) {
        g.setColor(colorBola);
        g.fillOval(5+x,30+y,20,20);
     }
}