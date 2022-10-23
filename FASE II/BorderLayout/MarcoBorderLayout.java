/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BorderLayout;

/**
 *
 * @author CAMILA
 * 
 */

import java.awt.BorderLayout; 
import java.awt.event.ActionListener; 
import java.awt.event.ActionEvent; 
import javax.swing.JFrame; 
import javax.swing.JButton;


public class MarcoBorderLayout extends JFrame implements ActionListener  {
    
    private final JButton botones[]; // arreglo de botones para ocultar porciones
    private static final String nombres[] = {
                                              "Ocultar Norte", "Ocultar Sur", 
                                              "Ocultar Este", "Ocultar Oeste", "Ocultar Centro"
                                            };
    private final BorderLayout esquema;
    
    public MarcoBorderLayout()
    {
        super("Integrantes: Camila Rodriguez Brown | Elmer Hanccoccallo");
        esquema = new BorderLayout(5, 5); // espacios de 5 píxeles
        
        setLayout(esquema);
        botones = new JButton[nombres.length];
        
        // crea objetos JButton y registra componentes de escucha para ellos
        for (int cuenta = 0; cuenta < nombres.length; cuenta++) 
        {
            botones[cuenta] = new JButton(nombres[cuenta]);
            botones[cuenta].addActionListener(this);
        }
        add(botones[0], BorderLayout.NORTH);
        add(botones[1], BorderLayout.SOUTH);
        add(botones[2], BorderLayout.EAST);
        add(botones[3], BorderLayout.WEST);
        add(botones[4], BorderLayout.CENTER);
    }
        
        @Override
        public void actionPerformed(ActionEvent evento)
        {
            for (JButton boton : botones)
            {
                if (evento.getSource() == boton)
                {
                    boton.setVisible(false); // oculta el botón oprimido
                }
                else 
                {
                    boton.setVisible(true); // muestra los demás botones
                }
                esquema.layoutContainer(getContentPane()); // distribuye el panel de contenido
            }
        }
                
}
