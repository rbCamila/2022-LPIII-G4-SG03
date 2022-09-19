/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lpiii_G04_4_3;

/**
 *
 * @author CAMILA
 */
public class Rectangulo {
    private Coordenada esquina1;
    private Coordenada esquina2;
    
    static String color;
    
    static int cont;
    
    public Rectangulo(Coordenada c1, Coordenada c2){
        this.esquina1 = c1;
        this.esquina2 = c2;
        
        Rectangulo.setColor();
        cont++;
    }
    
    public Coordenada getEsquina1(){
        return esquina1;
    }
    
    public void setEsquina1(Coordenada esquina1) {
        this.esquina1 = esquina1;
    }
    
    public Coordenada getEsquina2(){
        return esquina2;
    }
    
    public void setEsquina2(Coordenada esquina2) {
        this.esquina2 = esquina2;
    }
    
    
    
    public static void setColor(){
        if (Rectangulo.cont == 3){
            Rectangulo.cont = 0;
        }
        switch(Rectangulo.cont){
            case 0:
                Rectangulo.color = "verde";
                break;
            case 1:
                Rectangulo.color = "amarillo";
                break;
            case 2:
                Rectangulo.color = "rojo";
                break;
        }
    }
    
    public String color(){
        return Rectangulo.color;
    }
    
    
    
    public Rectangulo(int alt , int bs) {
        
        this.esquina1 = new Coordenada(0,0);
        this.esquina2 = new Coordenada(bs,alt);
        Rectangulo.setColor();
        cont++;
        
    }
    
    
    @Override
    public String toString() {
        return "Rectangulo " + " Esquina1 = " + esquina1 + ", Esquina2 = " + esquina2 + '}';
    }
    
            
}
