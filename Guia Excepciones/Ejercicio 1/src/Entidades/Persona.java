package Entidades;

public class Persona {
    String nombre;
    Integer edad;
    Boolean mayorDeEdad;

    public Persona() {
    }

    public Persona(String nombre, Integer edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void esMayorDeEdad() {
        if (edad >= 18) {
            mayorDeEdad = true;
        } else {
            mayorDeEdad = false;
        }
    }

}
