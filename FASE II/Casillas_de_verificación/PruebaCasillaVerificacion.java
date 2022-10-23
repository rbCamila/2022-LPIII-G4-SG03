/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Casillas_de_verificación;

/**
 *
 * @author CAMILA
 * 
 */

import javax.swing.JFrame;

public class PruebaCasillaVerificacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MarcoCasillaVerificacion marcoCasillaVerificacion =  new MarcoCasillaVerificacion(); 
        
        marcoCasillaVerificacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marcoCasillaVerificacion.setSize(275, 100);
        marcoCasillaVerificacion.setVisible(true);
    }
    
}
