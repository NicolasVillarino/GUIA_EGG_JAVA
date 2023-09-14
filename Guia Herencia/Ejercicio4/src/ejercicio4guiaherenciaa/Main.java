/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4guiaherenciaa;

/**
 *
 * @author Niko
 */
import Entidad.Circulo;
import Entidad.Rectangulo;

/**
 *Se plantea desarrollar un programa que nos permita calcular el área y el perímetro de formas
geométricas, en este caso un círculo y un rectángulo. Ya que este cálculo se va a repetir en las
dos formas geométricas, vamos a crear una Interfaz, llamada calculosFormas que tendrá, los
dos métodos para calcular el área, el perímetro y el valor de PI como constante.
Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz y se
calcule el área y el perímetro de los dos. En el main se crearán las formas y se mostrará el
resultado final. 
 * @author Niko
 */
public class Main {
    public static void main(String[] args) {

        Circulo circulo = new Circulo(Math.random()*20 + 1);
        Rectangulo rectangulo = new Rectangulo(Math.random()*20 + 1, Math.random()*20 + 1);

        System.out.println("El área del círculo es: " + circulo.area() + ", su perímetro es: " + circulo.perimetro());
        System.out.println("El área del Rectángulo es: " + rectangulo.area() + ", su perímetro es: " + rectangulo.perimetro());

    }
}