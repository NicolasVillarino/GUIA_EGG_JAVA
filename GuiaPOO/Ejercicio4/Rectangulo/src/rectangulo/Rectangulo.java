/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rectangulo;

import Entidades.Rectanguloo;

/**
 *
 * @author Niko
 */
public class Rectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Rectanguloo r1 = new Rectanguloo();
        r1.crearRectangulo();

        System.out.println("Superficie=" + r1.superficie(r1) + "\nPerimetro=" + r1.perimetro(r1));

        r1.dibujarRectangulo(r1);

    }

}
