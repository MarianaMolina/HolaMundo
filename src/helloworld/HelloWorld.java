/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import javax.swing.JOptionPane;

/**
 *
 * @author marym
 */

 public class HelloWorld {
        public static void main(String[] args) {
            //MENSAJE EN VENTANA
            //JOptionPane.showMessageDialog(null, "Hello World");
        
            //INPUT EN VENTANA
            String name = JOptionPane.showInputDialog("Type your name please");
            JOptionPane.showMessageDialog(null, "Hello " + name);
            
            
        }
    }
