/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Niko
 */

import Entidades.Persona;

public class Main {
    public static void main(String[] args) {
        try {
            Persona p1 = null;
            p1.esMayorDeEdad();
        } catch (Exception e) {
            System.out.println("Error: La persona no puede ser null");
        }
    }
}