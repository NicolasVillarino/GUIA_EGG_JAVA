/*Todas estas operaciones puede tirar excepciones a manejar, el ingreso por teclado puede
causar una excepción de tipo InputMismatchException, el método Integer.parseInt() si la cadena
no puede convertirse a entero, arroja una NumberFormatException y además, al dividir un
número por cero surge una ArithmeticException. Manipule todas las posibles excepciones
utilizando bloques try/catch para las distintas excepciones */

package Entidades;

import java.util.InputMismatchException;

public class DivisionNumero {

    String num1;
    String num2;

    public DivisionNumero(String num1, String num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int dividir() {
        try {
            int num1 = Integer.parseInt(this.num1);
            int num2 = Integer.parseInt(this.num2);
            return num1 / num2;
        } catch (NumberFormatException e) {
            System.out.println("No se puede convertir a entero");
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por cero");
        } catch (InputMismatchException e) {
            System.out.println("Ingreso no valido, debe ingresar un numero");
        }

        return 0;
    }

}
