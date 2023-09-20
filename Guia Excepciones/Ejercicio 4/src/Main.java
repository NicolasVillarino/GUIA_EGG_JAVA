/*
 Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
una división con los dos numeros y mostrar el resultado.
 */

import java.util.Scanner;

import Entidades.DivisionNumero;

/**
 *
 * @author Niko
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el primer numero");
        String num1 = leer.next();
        System.out.println("Ingrese el segundo numero");
        String num2 = leer.next();

        DivisionNumero div = new DivisionNumero(num1, num2);
        System.out.println("El resultado de la division es: " + div.dividir());

    }

}
