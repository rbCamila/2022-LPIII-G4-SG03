/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Archivos;

/**
 *
 * @author ACER
 */


public class Alumno extends Persona2{
    private Fecha fechaMatricula;
    
    public Alumno(String nif,String nombre,int edad,Fecha fechaMatricula){
        super(nif,nombre,edad);
        this.fechaMatricula = new Fecha();
        setFechaMatricula(fechaMatricula);
    }
    public Alumno(){
        
    }
    public Fecha getFechaMatricula(){
        return fechaMatricula;
    }
    
    public void setFechaMatricula(Fecha fechaMatricula){
        this.fechaMatricula.setDia(fechaMatricula.getDia());
        this.fechaMatricula.setMes(fechaMatricula.getMes());
        this.fechaMatricula.setAnio(fechaMatricula.getAnio());
    }

}
