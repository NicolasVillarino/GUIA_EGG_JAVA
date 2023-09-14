/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author Niko
 */
public class Rectanguloo {
    private int base;
    private int altura;

    public Rectanguloo() {
    }

    public Rectanguloo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public Rectanguloo crearRectangulo() {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la base");
        this.base = leer.nextInt();
        System.out.println("Ingrese la altura");
        this.altura = leer.nextInt();

        return new Rectanguloo(this.base, this.altura);
    }

    public int superficie(Rectanguloo r1) {
        return r1.getBase() * r1.getAltura();
    }

    public int perimetro(Rectanguloo r1) {
        return (r1.getBase() + r1.getAltura()) * 2;
    }

    public void dibujarRectangulo(Rectanguloo r1) {
        for (int i = 0; i < r1.getAltura(); i++) {
            for (int j = 0; j < r1.getBase(); j++) {
                if (i == 0 || i == r1.getAltura() - 1) {
                    if (j != r1.getBase() - 1)
                        System.out.print("*");
                    else
                        System.out.println("*");
                } else if (j == 0) {
                    System.out.print("*");
                } else if (j == r1.getBase() - 1) {
                    System.out.println("*");
                } else
                    System.out.print(" ");

            }
        }
    }

}