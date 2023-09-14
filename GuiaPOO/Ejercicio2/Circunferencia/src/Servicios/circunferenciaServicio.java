/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.circulo;
import java.util.Scanner;

/**
 *
 * @author nvillarino
 */
public class circunferenciaServicio {
    Scanner leer= new Scanner (System.in);
    //Instancia objeto con el nombre del constructor de la entidad
    
   public circulo crearCircunferencia(){
    circulo crearCircunferencia = new circulo();
    
       System.out.println("Ingrese el radio de la circunferencia");
       crearCircunferencia.setRadio(leer.nextDouble()); //libro1.setTitulo(leer.nextLine());
       return crearCircunferencia;
   }
                
    public void area(circulo crearCircunferencia){
                   
       Double radio=crearCircunferencia.getRadio();
    
       Double areavalor = Math.PI * (radio * radio);
             
       crearCircunferencia.setArea(areavalor);
   
       
    }
    
        public void perimetro(circulo crearCircunferencia){
                   
       Double radio=crearCircunferencia.getRadio();
    
       Double perimetrovalor = 2 * Math.PI * radio ;
       
              
       crearCircunferencia.setPerimetro(perimetrovalor);
     }
       
}
