/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package libro;

import Entidades.book;
import Servicios.libroServicio;

/**
 *
 * @author nvillarino
 */
public class Libro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        libroServicio librosv = new libroServicio();
        
        book libro1 = librosv.altaBook();
            System.out.println("El nombre del libro es: " + libro1.getTitulo() + ", su ISBN es: " + libro1.getISBN()+ ", su autor es: " + libro1.getAutor() + " y el libro cuenta con " + libro1.getPaginas()+ " paginas ");

    }
    
}
