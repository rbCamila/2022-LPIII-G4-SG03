/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArchivosEjercicio1;

/**
 *
 * @author ACER
 */
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class Empleado extends JFrame{
    
    private final JLabel Titulo;
    private final JLabel numero;
    private final JLabel nombre;
    private final JLabel sueldo;
    
    private final JTextField intNumero;
    private final JTextField texNombre;
    private final JTextField doubleSueldo;
    
    private final JButton AgregarEmpleado;
    

public Empleado() {  
    
    super("Empleados");
    
    setLayout(new FlowLayout()); 
    Titulo = new JLabel("Datos del empleado                      ");
    Titulo.setFont(new Font("Serif", Font.BOLD, 20));
    Titulo.setHorizontalTextPosition(SwingConstants.LEFT);
    add(Titulo);
    
    numero = new JLabel("       Número                 ");
    add(numero);    
    intNumero = new JTextField("  ",20);
    add(intNumero);
    
    nombre = new JLabel("      Nombre                   ");
    add(nombre);    
    texNombre = new JTextField("",20);
    add(texNombre);
    
    sueldo = new JLabel("      Sueldo                   ");
    add(sueldo);    
    doubleSueldo = new JTextField("",20);
    add(doubleSueldo);
    
    AgregarEmpleado = new JButton("Agregar empleado");
    add(AgregarEmpleado);
    
    
    

}
}


