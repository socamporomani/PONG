/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pong;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
/**
 *
 * @author socamporomani
 */
public class Ventana extends JFrame{
    private ZonaJugable zona;
private DesplazamientoPelota desplazamiento;
    public void Window(){
       //crea la ventana
        setVisible(true);
        setSize(800,600);
        setTitle("PonG");
        setResizable(true);
       zona =new ZonaJugable();  
       add(zona);              // asi lo añadimos la zona de juego al jframe 
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       desplazamiento=new DesplazamientoPelota(zona);
       desplazamiento.start();
        zona.iterarJego(); //  se encarga de llamar a la actualizacion de la pelota
   }
}
