/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Niko
 */
public class Televisor extends Electrodomestico {

    private Integer resolucion;
    private Boolean sintonizadorTDT;

    public Televisor() {
    }

    public Televisor(Integer resolucion, Boolean sintonizadorTDT) {
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Televisor(Double precio, String color, String consumo, Integer peso, Integer resolucion,
            Boolean sintonizadorTDT) {
        super(precio, color, consumo, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Integer getResolucion() {
        return resolucion;
    }

    public Boolean getSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setResolucion(Integer resolucion) {
        this.resolucion = resolucion;
    }

    public void setSintonizadorTDT(Boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        if (this.resolucion > 40) {
            this.precio += (this.precio * 0.3);
        }
        if (this.sintonizadorTDT) {
            this.precio += 50;
        }
    }

    @Override
    public String toString() {
        return "Televisor{" + "resolucion=" + resolucion + ", sintonizadorTDT=" + sintonizadorTDT + '}';
    }

    public void crearTelevisor() {
        crearElectrodomestico();
        System.out.println("Ingrese la resolucion del televisor");
        this.resolucion = leer.nextInt();
        System.out.println("Ingrese si el televisor tiene sintonizador TDT (true/false)");
        this.sintonizadorTDT = leer.nextBoolean();
    }

    public void PrecioFinalTele() {
        super.precioFinal();
        if (this.resolucion > 40) {
            this.precio += (this.precio * 0.3);
        }
        if (this.sintonizadorTDT) {
            this.precio += 500;
        }

        System.out.println("El electrodomestico creado tiene un precio de: " + precio + "$. El mismo es de color: "
                + color + ", tiene un consumo energetico de: " + consumo + " y pesa: " + peso
                + "kg. Gracias por usar JavaDomesticos.");

    }

}