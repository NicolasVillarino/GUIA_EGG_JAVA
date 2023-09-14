/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author Niko
 */
public class Electrodomestico {

    Scanner leer = new Scanner(System.in);

    Double precio;
    String color;
    String consumo;
    Integer peso;

    public Electrodomestico() {
    }

    public Electrodomestico(Double precio, String color, String consumo, Integer peso) {
        this.precio = (double) 1000;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

    public Double getPrecio() {
        return precio;
    }

    public String getColor() {
        return color;
    }

    public String getConsumo() {
        return consumo;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setConsumo(String consumo) {
        this.consumo = consumo;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumo=" + consumo + ", peso=" + peso
                + '}';
    }

    public void comprobarConsumoEnergetico(String consumo) {
        if (consumo.equalsIgnoreCase("A") || consumo.equalsIgnoreCase("B") || consumo.equalsIgnoreCase("C")
                || consumo.equalsIgnoreCase("D") || consumo.equalsIgnoreCase("E") || consumo.equalsIgnoreCase("F")) {
            this.consumo = consumo;
        } else {
            this.consumo = "F";
        }
    }

    public String comprobarColor(String color) {

        color.toLowerCase(); // Pasa color a minusculas

        System.out.println(color);

        if (!color.equals("blanco") && !color.equals("negro") && !color.equals("rojo") && !color.equals("azul")
                && !color.equals("gris")) {

            System.out.println("Eligio un color no valido, el color por defecto será BLANCO");

            return color = "blanco";
        }

        return color;

    }

    public void crearElectrodomestico() {

        // this.precio = (double) 1000;

        System.out.println("Bienvenidos a JavaDomesticos");
        System.out.println("Ingrese el color del electrodomestico que quiere");
        this.color = leer.nextLine();

        System.out.println("Ingrese consumo energetico del mismo - De la A a la F");
        this.consumo = leer.nextLine();

        System.out.println("Ingrese el peso del electrodomestico");
        this.peso = leer.nextInt();
    }

    public void precioFinal() {

        Double aumentoDePrecio = 0.0;
        String consumoMayus = consumo.toUpperCase();

        // Switch dependiendo la letra de consumo el aumento.

        switch (consumoMayus) {

            case "A":
                aumentoDePrecio += 1000;
                break;
            case "B":
                aumentoDePrecio += 800;
                break;
            case "C":
                aumentoDePrecio += 600;
                break;
            case "D":
                aumentoDePrecio += 500;
                break;
            case "E":
                aumentoDePrecio += 300;
                break;
            case "F":
                aumentoDePrecio += 100;
                break;
            default:
                System.out.println("Consumo energético no válido. Se aplicará aumento y multa por imbecil.");
                aumentoDePrecio += 10000;
                break;
        }

        // Dependiendo el peso del electrodomestico se le suma un precio.

        if (peso >= 0 && peso <= 19) {
            aumentoDePrecio += 100;
        } else if (peso >= 20 && peso <= 49) {
            aumentoDePrecio += 500;
        } else if (peso >= 50 && peso <= 79) {
            aumentoDePrecio += 800;
        } else if (peso >= 80) {
            aumentoDePrecio += 1000;
        }

        // Sumar el aumento al precio actual
        precio += aumentoDePrecio;

    }

}
