/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJERCICIO_REFUERZO;

/**
 *
 * @author ACER
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionEnteros {
    public static void main(String[] ar) {
        Scanner teclado = new Scanner(System.in);
        try {
            int num1, num2;
            System.out.print("Ingrese primer valor entero (dividendo):");
            num1 = teclado.nextInt();
            System.out.print("Ingrese segundo valor entero (divisor):");
            num2 = teclado.nextInt();
            int resu = num1 / num2;
            System.out.print("La división de " + num1 + " / " + num2 + " es " + resu);
        } catch (InputMismatchException ex) {
            System.out.println("Debe ingresar obligatoriamente números enteros");
        } catch (ArithmeticException ex) {
            System.out.println("No se puede dividir por cero");
        }
    }
}