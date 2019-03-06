/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pong;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author r618b
 */
public class DesplazamientoPelota extends Thread {
     ZonaJugable zona;
        
    public DesplazamientoPelota(ZonaJugable zona){
        this.zona=zona;
    }
        @Override
    public void run(){
         while(true){ 
            
             try {
              
                 Thread.sleep(5); /// cada 1 milisegundos se repite."controla la velocidad"
                 
                     
             } catch (InterruptedException ex) {
                 
             }
             zona.repaint();
         }
    }
}

