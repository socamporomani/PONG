/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pong;

import java.awt.Color;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.geom.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author r618b
 */
public class ZonaJugable extends JPanel{
    MoviminetoPelota pelota= new MoviminetoPelota(0, 0);
    public ZonaJugable(){
        setBackground(Color.DARK_GRAY);
}
    @Override
    public void paintComponent(Graphics g){ //creamos pelota
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        g2.setColor(Color.yellow);
        dibujar(g2); 
        desplazarBola();
    }
    public void dibujar(Graphics2D g){
        g.fill(pelota.getMovimietnoPelota());
    }
    public void desplazarBola(){
        pelota.mover(getBounds());
    }
    public void iterarJego(){
        while(true){
            repaint();
            try {
                Thread.sleep(10); // se actualiza cada 6 Milisegundos
            } catch (InterruptedException ex) {
            }
        }
    }
}
