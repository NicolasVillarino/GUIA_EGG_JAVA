/*
 * Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera
de rango).
 */

import java.util.ArrayList;

/**
 *
 * @author Niko
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

         try {

        int[] arreglo = new int[5];

        for (int i = 0; i < 10; i++) {
            arreglo[i] = i;
        }

         } catch (ArrayIndexOutOfBoundsException e) {
         System.out.println("El indice esta fuera de rango " + e.getMessage());
         }

    }

}
