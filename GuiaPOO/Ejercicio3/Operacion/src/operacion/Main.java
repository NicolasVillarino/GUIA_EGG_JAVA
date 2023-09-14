/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operacion;

import Ejercicio3.Operacion.Entidades.Operacion;

/**
 *
 * @author Niko
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Operacion op1 = new Operacion();
        op1.crearOperacion();
        System.out.println("La suma de los numeros es: " + op1.sumar());
        System.out.println("La resta de los numeros es: " + op1.restar());
        System.out.println("La multiplicacion de los numeros es: " + op1.multiplicar());
        System.out.println("La division de los numeros es: " + op1.dividir());

    }

}
