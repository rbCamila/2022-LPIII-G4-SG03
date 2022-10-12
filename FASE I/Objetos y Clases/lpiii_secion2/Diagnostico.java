/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lpiii_secion2;

public class Diagnostico  {
    public static String aptoVacunaA(Perro P){
        int e;
        double t,p;
        t = P.getTemp();
        p = P.peso;
        e = P.getEdad();
        if (t >=37 && t<=40 && p >5 && e >1)
            return "El perro esta SANO";
        else
            return "El perro esta ENFERMO";
    }
    public static String aptoVacunaB(double p, int e, double t){
        if (t >=37 && t<=40 && p >5 && e >1)
            return "El perro esta SANO";
        else
            return "El perro esta ENFERMO";
    }
}
