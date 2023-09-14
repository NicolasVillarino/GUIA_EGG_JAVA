/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Niko
 */
public class Animal {

    private String nombre;
    private String alimento;
    private int edad;
    private String raza;

    public Animal() {
    }

    public Animal(String nombre, String alimento, int edad, String raza) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.raza = raza;
    }

    public void alimentarse() {
        System.out.println(nombre + " se alimenta de " + alimento);
    }

}
