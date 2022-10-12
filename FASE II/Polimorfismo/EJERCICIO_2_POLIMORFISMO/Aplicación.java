
package EJERCICIO_2_POLIMORFISMO;

public class Aplicación {

    public static void main(String[] args) {
        ImpactoEcologico[] objetosImpactoEcologico= new ImpactoEcologico[6];
        objetosImpactoEcologico[0]=new Edificio(35,1);
        objetosImpactoEcologico[1]=new Edificio(28.5,6);
        objetosImpactoEcologico[2]=new Auto(5,80);
        objetosImpactoEcologico[3]=new Auto(6,100);
        objetosImpactoEcologico[4]=new Bicicleta(229,52);
        objetosImpactoEcologico[5]=new Bicicleta(33,50);
                
        
        System.out.println("Gases de efectos invernaderos(gei)");
         System.out.println("procesados en forma polimorfica por autos edificios y bicicletas\n\n");
                 
        for(ImpactoEcologico ImpactoEcologicoActual : objetosImpactoEcologico)
        {
            System.out.printf("%s,\n%s%,.2f%s\n\n",
                    ImpactoEcologicoActual.toString(),
                    "Impacto Ecologico: ", ImpactoEcologicoActual.obtenerImpactoEcologico()," Kg de CO2 eq");
        }  
    }
    
}
