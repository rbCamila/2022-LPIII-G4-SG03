/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Botones_de_comando;

/**
 *
 * @author CAMILA
 */


import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class MarcoBoton extends JFrame {
    private final JButton botonJButtonSimple; //botón con texto solamente
    private final JButton botonJButtonElegante; // botón con iconos16
    
    
    //MarcoBoton agrega objetos de JButton a JFRame
    public MarcoBoton(){
        super("Integrantes de grupo: Camila Rodriguez Brown | Elmer Hanccoccallo");
        setLayout(new FlowLayout());
        
        botonJButtonSimple = new JButton("Boton simple");
        add(botonJButtonSimple); // agrega botonJButtonSimple a JFrame25
        
        
        Icon bob1 = new ImageIcon(getClass().getResource("bob1.gif"));
        Icon bob2 = new ImageIcon(getClass().getResource("bob2.gif"));
        
        botonJButtonElegante = new JButton("Boton elegante", bob1); //  establecela imagen
        
        botonJButtonElegante.setRolloverIcon(bob2); //  establece la imagen de sustitución
        
        add(botonJButtonElegante); // agrega botonJButtonElegante a JFrame
      
         
         // crea nuevo ManejadorBoton para manejar los eventos de botón 
        ManejadorBoton manejador = new ManejadorBoton();
        botonJButtonElegante.addActionListener(manejador);
        botonJButtonSimple.addActionListener(manejador);
    }
    
    
    private class ManejadorBoton implements ActionListener {
        // maneja evento de botón
        @Override
        public void actionPerformed(ActionEvent evento){
            JOptionPane.showMessageDialog(MarcoBoton.this, String.format("Usted oprimio: %s", evento.getActionCommand()));
        }
    }
}
