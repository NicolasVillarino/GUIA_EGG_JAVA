/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.book;
import java.util.Scanner;

/**
 *
 * @author nvillarino
 */
public class libroServicio {
  
    Scanner leer= new Scanner (System.in);
    //Instancia objeto con el nombre del constructor de la entidad
    
   public book altaBook(){
    book libro1 = new book();
    
       System.out.println("Ingrese el nombre del libro");
       libro1.setTitulo(leer.nextLine());
       
       System.out.println("Ingrese el ISBN del libro");    
       libro1.setISBN(leer.nextLine());
       
       System.out.println("Ingrese el autor");
       libro1.setAutor(leer.nextLine());
       
       System.out.println("Ingrese cantidad de paginas");
       libro1.setPaginas(leer.nextInt());
       
       return libro1;
} 
    
    
}
