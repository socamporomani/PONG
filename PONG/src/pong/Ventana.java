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
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        zona =new ZonaJugable();
        add(zona);              // asi lo añadimos la zona de juego al jframe
        desplazamiento=new DesplazamientoPelota(zona);
        desplazamiento.start();
   }
}
