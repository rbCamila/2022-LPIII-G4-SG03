/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cuadros_combinados;

/**
 *
 * @author CAMILA
 *
 */
import java.awt.FlowLayout;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class MarcoCuadroCombinado extends JFrame {

    private final JComboBox<String> imagenesJComboBox; //  contiene los nombres de los iconos

    private final JLabel etiqueta; // muestra el icono seleccionado

    private static final String nombres[] = {"bob1.gif", "bob2.gif", "bob3.gif", "bob4.gif"};
    private final Icon[] iconos = {
        new ImageIcon(getClass().getResource(nombres[0])),
        new ImageIcon(getClass().getResource(nombres[1])),
        new ImageIcon(getClass().getResource(nombres[2])),
        new ImageIcon(getClass().getResource(nombres[3]))
    };

    // El constructor de MarcoCuadroCombinado agrega un objeto JComboBox a JFrame
    public MarcoCuadroCombinado() {
        super("INTEGRANTES: Camila Rodriguez Brown | Elmer Hanccoccallo");
        setLayout(new FlowLayout()); // establece el esquema del marco
        imagenesJComboBox = new JComboBox<String>(nombres); // establece JComboBox
        imagenesJComboBox.setMaximumRowCount(5); // muestra tres filas

        imagenesJComboBox.addItemListener(
        new ItemListener() // clase interna anónima       
        {
            // maneja evento de JComboBox38              
            @Override
            public void itemStateChanged(ItemEvent event)
            {// determina si está seleccionado el elemento
                if (event.getStateChange() == ItemEvent.SELECTED) {
                       etiqueta.setIcon(iconos[imagenesJComboBox.getSelectedIndex()]);
                }
            }
        }
        );
        add(imagenesJComboBox); // agrega cuadro combinado a JFrame
        etiqueta = new JLabel(iconos[0]); // muestra el primer icono
        add(etiqueta); // agrega etiqueta a JFrame
    }  
 
}
