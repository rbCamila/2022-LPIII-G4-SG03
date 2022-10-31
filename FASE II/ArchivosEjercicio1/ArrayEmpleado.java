/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArchivosEjercicio1;

/**
 *
 * @author Camila
 */
import java.util.ArrayList;
public class ArrayEmpleado {
    
    private ArrayList<Object> i = new ArrayList<Object>();
    

    
    public ArrayEmpleado(ArrayList<Object> i){
        this.i = i;
    }
    
    public void agregarRegistro(Empleado emp){
        this.i.add(emp);
    }
    
    public Empleado obtenerRegistro(int c){
        return (Empleado)i.get(c);
    }
    
    public int cantidadRegistro(){
        return this.i.size();
    }
}
