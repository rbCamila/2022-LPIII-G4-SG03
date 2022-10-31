/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Archivos;

/**
 *
 * @author ACER
 */
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javax.swing.JFrame;

public class FileInputStreamm {
    public static void main(String[] args)throws IOException {
        FileInputStream file;
        byte b[] = new byte[1024];
        try{
            file = new FileInputStream("src/Archivos/FileInputStreamm.java");
            file.read(b);
            String s = new String(b);
            ViewFile view = new ViewFile(s);
            view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            view.setSize(400,150);
            view.setVisible(true);
        }
        catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        } 
        catch (IOException e){
            System.out.println(e.getMessage());
        }        
    }    
}
