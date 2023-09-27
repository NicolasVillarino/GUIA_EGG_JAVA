/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author Niko
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        Calculator calc = new Calculator();

        System.out.println("Ingrese el primer numero: ");
        calc.setNum1(leer.nextInt());
        System.out.println("Ingrese el segundo numero: ");
        calc.setNum2(leer.nextInt());

        System.out.println("La suma es: " + calc.add());
        System.out.println("La resta es: " + calc.substract());
        System.out.println("La multiplicacion es: " + calc.multiply());
        System.out.println("La division es: " + calc.divide());

    }

}
