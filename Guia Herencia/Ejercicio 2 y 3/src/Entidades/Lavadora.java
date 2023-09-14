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
public class Lavadora extends Electrodomestico {

    private Integer carga;

    public Lavadora() {
    }

    public Lavadora(Integer carga) {
        this.carga = carga;
    }

    public Lavadora(Double precio, String color, String consumo, Integer peso, Integer carga) {
        super(precio, color, consumo, peso);
        this.carga = carga;
    }

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        if (this.carga > 30) {
            this.precio += 50;
        }
    }

    @Override
    public String toString() {
        return "Lavadora{" + "carga=" + carga + '}';
    }

    public void crearLavadora() {
        crearElectrodomestico();
        System.out.println("Ingrese la carga de la lavadora");
        this.carga = leer.nextInt();
    }

    public void PrecioFinalLava() {
        super.precioFinal();
        if (this.carga > 30) {
            this.precio += 500;

            System.out.println("El electrodomestico creado tiene un precio de: " + precio + "$. El mismo es de color: "
                    + color + ", tiene un consumo energetico de: " + consumo + " y pesa: " + peso
                    + "kg. Gracias por usar JavaDomesticos.");
        }
    }

}
