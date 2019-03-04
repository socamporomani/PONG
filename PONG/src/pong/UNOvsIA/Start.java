/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pong.UNOvsIA;

import java.awt.*;

import java.awt.event.*;
import javax.swing.JFrame;
/**
 *
 * @author socamporomani
 */
public class Start extends JFrame{

    private int estado=0; //0=jugando 1=fin 2=win
private int toques=0;

public Start(){
 
}

public void crearTablero(){
//inicializar
 
  
     
  estado=0;
  toques=0;
  
 }
   
 
  
   


public void update(Graphics g){

    paint(g);

}

public void paint(Graphics g){
  
  g.setFont(new Font("ARIAL",Font.BOLD,14));
 
   g.clearRect(0, 0, getWidth(), 40);

}
}




