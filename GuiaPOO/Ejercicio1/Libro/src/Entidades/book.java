/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author nvillarino
 */
public class book {
    
    String Titulo;
    String ISBN;
    String Autor;
    Integer paginas;

    public book() {
    }

    public book(String Titulo, String ISBN, String Autor, Integer paginas) {
        this.Titulo = Titulo;
        this.ISBN = ISBN;
        this.Autor = Autor;
        this.paginas = paginas;
    }



    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public Integer getPaginas() {
        return paginas;
    }

    public void setPaginas(Integer paginas) {
        this.paginas = paginas;
    }

    @Override
    public String toString() {
        return "libroServicio{" + "Titulo=" + Titulo + ", ISBN=" + ISBN + ", Autor=" + Autor + ", paginas=" + paginas + '}';
    }
}
