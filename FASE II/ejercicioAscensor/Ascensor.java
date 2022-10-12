package ejercicioAscensor;

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