/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Botones_de_comando;

/**
 *
 * @author CAMILA
 *
 */



import javax.swing.JFrame;

public class PruebaBoton {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MarcoBoton marcoBoton = new MarcoBoton(); 
        
        marcoBoton.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        marcoBoton.setSize(275, 110);
        
        marcoBoton.setVisible(true);
        
        
    }
    
}
