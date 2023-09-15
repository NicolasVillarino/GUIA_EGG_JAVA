/*
 Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora
debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para
ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el
número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando
consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario
ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe
controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el
carácter fallido como un intento.
 */

import java.util.InputMismatchException;
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
        int numeroAleatorio = (int) (Math.random() * 500 + 1);
        int num, numintentos;

        numintentos = 0;

        System.out.println(numeroAleatorio);

        try {

            System.out.println("Ingrese un numero, a ver si tiene suerte. El mismo es entre 1 y 500");
            num = leer.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("No ingresaste un numero, intenta de nuevo " + e.getMessage() );
            leer.nextLine();
            num = leer.nextInt();
            
        }

        while (num != numeroAleatorio) {

            numintentos++;

            if (num > numeroAleatorio) {
                System.out.println("El numero a adivinar es menor.");
            } else if (num < numeroAleatorio) {
                System.out.println("El numero a adivinar es mayor.");
            }

            try {

                System.out.println("Prueba de nuevo, ingresa un numero");
                num = leer.nextInt();
                numintentos++;

            } catch (InputMismatchException e) {
                System.out.println("No ingresaste un numero, intenta de nuevo " + e.getMessage() );
                leer.nextLine();
                num = leer.nextInt();
                numintentos++;
            }

        }

        System.out.println("Adivinaste el numero, felicitaciones!!");
        numintentos++;

        System.out.println("La cantidad de intentos fue de: " + numintentos);

    }

}
