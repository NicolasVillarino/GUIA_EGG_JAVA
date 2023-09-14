package Ejercicio3.Operacion.Entidades;

import java.util.Scanner;

public class Operacion {

    private int num1;
    private int num2;

    public Operacion() {
    }

    public Operacion(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // Getters and Setters

    public int getNum1() {
        return this.num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return this.num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    // Metodos

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearOperacion() {
        System.out.println("Ingrese el primer numero: ");
        num1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        num2 = leer.nextInt();
    }

    public int sumar() {
        return num1 + num2;
    }

    public int restar() {
        return num1 - num2;
    }

    public int multiplicar() {
        return num1 * num2;
    }

    public int dividir() {
        if (num2 == 0) {
            System.out.println("No se puede dividir por 0");
            return 0;
        } else {
            return num1 / num2;
        }
    }

}
