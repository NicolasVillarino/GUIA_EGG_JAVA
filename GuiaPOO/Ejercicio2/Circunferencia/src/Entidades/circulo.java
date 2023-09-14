/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author nvillarino
 */
public class circulo {
    
    Double area;
    Double perimetro;
    Double radio;

    public circulo() {
    }

    public circulo(Double area, Double perimetro, Double radio) {
        this.area = area;
        this.perimetro = perimetro;
        this.radio = radio;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(Double perimetro) {
        this.perimetro = perimetro;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "circulo{" + "area=" + area + ", perimetro=" + perimetro + ", radio=" + radio + '}';
    }
    
    
    
    
}


