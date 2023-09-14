/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;

import Entidades.Electrodomestico;
import Entidades.Lavadora;
import Entidades.Televisor;

/**
 *
 * @author Niko
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Electrodomestico e1 = new Electrodomestico();
        // e1.crearElectrodomestico();
        /*
         * e1.comprobarColor(e1.getColor());
         * e1.comprobarConsumoEnergetico(e1.getConsumo());
         * e1.precioFinal();
         */

        Lavadora lava1 = new Lavadora(1000.00, "blanco", "C", 40, 60);
        Lavadora lava2 = new Lavadora(1000.00, "rojo", "D", 10, 25);
        Lavadora lava3 = new Lavadora(1000.00, "negro", "A", 20, 10);

        // lava1.crearLavadora();
        lava1.comprobarColor(lava1.getColor());
        lava1.comprobarConsumoEnergetico(lava1.getConsumo());

        lava1.PrecioFinalLava();
        lava2.PrecioFinalLava();
        lava3.PrecioFinalLava();

        Televisor tele1 = new Televisor(1000.00, "negro", "C", 20, 60, true);
        Televisor tele2 = new Televisor(1000.00, "blanco", "A", 10, 32, false);
        Televisor tele3 = new Televisor(1000.00, "rojo", "F", 35, 40, true);

        // tele1.crearTelevisor();
        tele1.comprobarColor(tele1.getColor());
        tele1.comprobarConsumoEnergetico(tele1.getConsumo());
        tele1.PrecioFinalTele();
        tele2.PrecioFinalTele();
        tele3.PrecioFinalTele();

        ArrayList<Electrodomestico> listaElectrodomesticos = new ArrayList<Electrodomestico>();
        listaElectrodomesticos.add(tele1);
        listaElectrodomesticos.add(lava1);
        listaElectrodomesticos.add(lava2);
        listaElectrodomesticos.add(lava3);
        listaElectrodomesticos.add(tele2);
        listaElectrodomesticos.add(tele3);

        Double sumaElectrodomesticos = 0.0;
        Double sumaTelevisores = 0.0;
        Double sumaLavadoras = 0.0;

        for (Electrodomestico electrodomestico : listaElectrodomesticos) {
            sumaElectrodomesticos = sumaElectrodomesticos + electrodomestico.getPrecio();

            if (electrodomestico instanceof Televisor) {
                sumaTelevisores += electrodomestico.getPrecio();
            }
            if (electrodomestico instanceof Lavadora) {
                sumaLavadoras += electrodomestico.getPrecio();
            }
        }

        System.out.println("La suma del precio de los electrodomesticos es de: " + sumaElectrodomesticos);
        System.out.println("La suma del precio de los televisores es de: " + sumaTelevisores);
        System.out.println("La suma del precio de las lavadoras es de: " + sumaLavadoras);

    }

}
