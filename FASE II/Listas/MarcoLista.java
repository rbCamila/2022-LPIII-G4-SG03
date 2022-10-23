/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listas;

/**
 *
 * @author CAMILA
 * 
 */

import java.awt.FlowLayout; 
import java.awt.Color; 
import javax.swing.JFrame; 
import javax.swing.JList;
import javax.swing.JScrollPane; 
import javax.swing.event.ListSelectionListener; 
import javax.swing.event.ListSelectionEvent;
import javax.swing.ListSelectionModel;


public class MarcoLista extends JFrame {
    private final JList<String> listaJListColores; // lista para mostrar colores
    private static final String[] nombresColores = {
                                                    "Negro", "Azul", "Cyan", 
                                                    "Gris oscuro", "Gris", "Verde", "Gris claro", "Magenta",
                                                    "Naranja", "Rosa", "Rojo", "Blanco", "Amarillo"
                                                  };
    private static final Color[] colores = {
                                                Color.BLACK, Color.BLUE, Color.CYAN, Color.DARK_GRAY, Color.GRAY, 
                                                Color.GREEN, Color.LIGHT_GRAY, Color.MAGENTA, Color.ORANGE, Color.PINK,  
                                                Color.RED, Color.WHITE, Color.YELLOW
                                           };
    //  El constructor de MarcoLista agrega a JFrame el JScrollPane que contiene a JList
    public MarcoLista()
    {
        super("INTEGRANTES: Camila Rodriguez Brown | Elmer Hanccoccallo");
        setLayout(new FlowLayout());
    
        listaJListColores = new JList<String>(nombresColores); //  lista de nombresColores
        listaJListColores.setVisibleRowCount(6); // muestra cinco filas a la vez
        listaJListColores.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        add(new JScrollPane(listaJListColores));
        
        listaJListColores.addListSelectionListener(
                new ListSelectionListener() // clase interna anónima
                {
                    // maneja los eventos de selección de la lista          
                    @Override
                    public void valueChanged(ListSelectionEvent evento)
                    {
                        getContentPane().setBackground(colores[listaJListColores.getSelectedIndex()]);
                    }
                }
        );
              
    } 
    
}
