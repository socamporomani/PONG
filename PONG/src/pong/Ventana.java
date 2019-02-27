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
   public void window(){
       //crea la ventana
        setVisible(true);
        setSize(800,600);
        setTitle("PonG");
        setResizable(true);
   }
}
