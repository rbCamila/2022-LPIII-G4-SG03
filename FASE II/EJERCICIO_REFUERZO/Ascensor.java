/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIO_REFUERZO;

/**
 *
 * @author ACER
 */
public class Ascensor {
    
    private final int maxWeight = 750; //no se puede modificar el peso.
    private int finalFloor;
    private int actualFloor;

    public Ascensor(int finalFloor) {
        this.finalFloor = finalFloor;
        this.actualFloor = 1;
    }

    public void subir(int cantPerson, int destinationFloor){
        if (cantPerson * 50 > this.maxWeight) {
            System.out.println("Peso máximo superado");
        }
        else {
        	if (destinationFloor > this.finalFloor)
        		System.out.println("No existen pisos por encima del piso " + this.finalFloor);
        	
        	else {
        		this.actualFloor = destinationFloor;
        		System.out.println("Actualmente se encuentra en el piso: " + this.actualFloor);
        	}
        }
    }
    
    public void bajar(int cantPerson, int destinationFloor){
        if (cantPerson * 50 > this.maxWeight) {
            System.out.println("Peso máximo superado");
        }          //piso al que hará su desplazamiento el ascensor 
        else {
        	if (destinationFloor < 1) {
        		System.out.println("No existen pisos por debajo del piso 1");
        	} 
        	else {
        		this.actualFloor = destinationFloor;
        		System.out.println("Actualmente se encuentra en el piso: " + this.actualFloor);
        	}
        }
    }
    
    public int getActualFloor() 
    {//información del piso en el que se encuentra
        return this.actualFloor;
    }

    public void setActualFloor(int actualFloor) {
        this.actualFloor = actualFloor;
    }

    public int getFinalFloor() {
        return this.finalFloor;
    }

    public void setFinalFloor(int finalFloor) {
        this.finalFloor = finalFloor;
    }
    
    @Override
    public String toString() {
    	String s = String.format("Carga maxima del ascensor: %d kg", this.maxWeight);
    	return s;
    }
}
    
    /*
    private final int maxWeight = 750; //no se puede modificar el peso.
    private int finalFloor;
    private int actualFloor;

    public Ascensor(int finalFloor) {
        this.finalFloor = finalFloor;
        this.actualFloor = 1;
    }

    
    public void Subir(int Person, int destinationFloor){
        if (Person * 50 > this.maxWeight) {
            System.out.println("Peso máximo superado");
        }          //piso al que hará su desplazamiento el ascensor 
        else if (destinationFloor > this.finalFloor) {
            System.out.println("No existen pisos por encima del piso " + this.finalFloor);
        }
        else{
            this.actualFloor = destinationFloor;
        }
    }
    
    public void Bajar(int Person, int destinationFloor){
        if (Person * 50 > this.maxWeight) {
            System.out.println("Peso máximo superado");
        }          //piso al que hará su desplazamiento el ascensor 
        else if (destinationFloor < 1) {
            System.out.println("No existen pisos por debajo del piso 1");
        } 
        else{
            this.actualFloor = destinationFloor;
        }
        
    }
    
    public int getActualFloor() 
    {//información del piso en el que se encuentra
        return this.actualFloor;
    }

    public void setActualFloor(int actualFloor) {
        this.actualFloor = actualFloor;
    }

    public int getFinalFloor() {
        return this.finalFloor;
    }

    public void setFinalFloor(int finalFloor) {
        this.finalFloor = finalFloor;
    }
    */
    
    
    
   /* private final int maxWeight = 750; //no se puede modificar el peso.
    private int finalFloor;
    private int actualFloor;

    public Ascensor(int finalFloor) {
        this.finalFloor = finalFloor;
        actualFloor = 1;
    }

    //public void Desplazamiento(int Person, int destinationFloor)
    {//Desplazará el ascensor con la cantidad de personas que se indique y al piso que se escoja
            //cantidad de personas que entrarán al ascensor
        if (Person * 50 > maxWeight) {
            System.out.println("Peso máximo superado");
        }          //piso al que hará su desplazamiento el ascensor 
        else if (destinationFloor < 1) {
            System.out.println("No existen pisos por debajo del piso 1");
        }   
        else if (destinationFloor > finalFloor) {
            System.out.println("No existen pisos por encima del piso " + finalFloor);
        }
        else if (actualFloor == destinationFloor) {
            System.out.println("Ascensor ya se encuentra en el piso " + destinationFloor);
        }
        else{
            actualFloor = destinationFloor;
        }//
    
    
    public void Subir(int Person, int destinationFloor){
        if (Person * 50 > maxWeight) {
            System.out.println("Peso máximo superado");
        }          //piso al que hará su desplazamiento el ascensor 
        else if (destinationFloor > finalFloor) {
            System.out.println("No existen pisos por encima del piso " + finalFloor);
        }
        else{
            actualFloor = destinationFloor;
        }
    }
    
    public  void Bajar(int Person, int destinationFloor){
        if (Person * 50 > maxWeight) {
            System.out.println("Peso máximo superado");
        }          //piso al que hará su desplazamiento el ascensor 
        else if (destinationFloor < 1) {
            System.out.println("No existen pisos por debajo del piso 1");
        } 
        else{
            actualFloor = destinationFloor;
        }
        
    }
    
    public int getActualFloor() 
    {//información del piso en el que se encuentra
        return actualFloor;
    }

    public void setActualFloor(int actualFloor) {
        this.actualFloor = actualFloor;
    }

    public int getFinalFloor() {
        return finalFloor;
    }

    public void setFinalFloor(int finalFloor) {
        this.finalFloor = finalFloor;
    }
}
*/  
