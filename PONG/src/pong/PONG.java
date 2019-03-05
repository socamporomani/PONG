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
public class PONG extends JFrame {
    private int estado = 0; //0=jugando 1=fin 2=win
    private int toques = 0;


    public void crearTablero(Graphics g) {
//inicializar
        estado = 0;
        toques = 0;
        }
    /**
     * @param args the command line arguments
     */
 public static void main(String[] args) {
      Ventana frame = new Ventana();
      frame.Window();

}
}
