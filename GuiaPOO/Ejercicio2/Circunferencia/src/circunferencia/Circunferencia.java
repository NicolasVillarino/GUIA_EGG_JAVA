/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package circunferencia;

import Entidades.circulo;
import Servicios.circunferenciaServicio;

/**
 *
 * @author nvillarino
 */
public class Circunferencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         circunferenciaServicio cir1 = new circunferenciaServicio();
        
        circulo crearCircunferencia = cir1.crearCircunferencia();
        cir1.area(crearCircunferencia);
        cir1.perimetro(crearCircunferencia);
        System.out.println("El area del circulo es de: " + crearCircunferencia.getArea() + " cm, el perimetro es de: " + crearCircunferencia.getPerimetro() + " cm, y el radio introducido es de: " + crearCircunferencia.getRadio() + " cm");//System.out.println(crearCircunferencia);
        
       
        
        
    }
    
}
