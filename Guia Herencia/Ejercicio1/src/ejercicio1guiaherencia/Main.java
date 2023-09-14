/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1guiaherencia;

import Entidades.Animal;
import Entidades.Caballo;
import Entidades.Gato;
import Entidades.Perro;

/**
 *
 * @author Niko
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Perro perro = new Perro("Firulais", "Croquetas", 5, "Labrador");
        perro.alimentarse();
        Gato gato = new Gato("Michi", "Atun", 3, "Siames");
        gato.alimentarse();
        Caballo caballo = new Caballo("Spark", "pasto", 10, "Fino");
        caballo.alimentarse();

    }

}
