/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package FlowLayout;

/**
 *
 * @author CAMILA
 */

import javax.swing.JFrame;

public class DemoFlowLayout {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MarcoFlowLayout marcoFlowLayout = new MarcoFlowLayout(); 
        marcoFlowLayout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marcoFlowLayout.setSize(300, 75); 
        marcoFlowLayout.setVisible(true);
        
    }
    
}
