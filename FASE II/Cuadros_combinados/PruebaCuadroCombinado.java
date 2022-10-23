package Cuadros_combinados;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author CAMILA
 */

import javax.swing.JFrame;

public class PruebaCuadroCombinado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MarcoCuadroCombinado marcoCuadroCombinado = new MarcoCuadroCombinado();  
        marcoCuadroCombinado.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marcoCuadroCombinado.setSize(350, 150);
        marcoCuadroCombinado.setVisible(true);
    }
    
}
