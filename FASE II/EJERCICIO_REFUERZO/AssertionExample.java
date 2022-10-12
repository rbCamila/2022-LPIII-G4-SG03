/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIO_REFUERZO;

/**
 *
 * @author ACER
 */
public class AssertionExample {

    static int val = 3;

    static int getnum() {
        return val--;
    }

    public static void main(String args[]) {
        int n;
        for (int i = 0; i < 10; i++) {
            n = getnum();
            assert n > 0; 
            System.out.println("n es " + n);
        }
    }
}
