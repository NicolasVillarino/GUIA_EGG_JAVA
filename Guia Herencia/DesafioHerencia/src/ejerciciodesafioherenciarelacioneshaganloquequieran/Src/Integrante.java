/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodesafioherenciarelacioneshaganloquequieran.Src;

import java.time.LocalDate;

/**
 *
 * @author max72
 */
public abstract class Integrante {
    protected int numeroDeOrden;
    protected String nombre;
    protected String apellido;
    protected LocalDate FechaDeNac;
    protected String DNI;
    protected String sexo;
    protected String vinculo;
    protected ProblemaDeSalud problemaMental;
    protected AbordajeNutricional toiGordito;

    public ProblemaDeSalud getProblemaMental() {
        return problemaMental;
    }

    public AbordajeNutricional getToiGordito() {
        return toiGordito;
    }
    

    public Integrante() {
    }

    public Integrante(int numeroDeOrden, String nombre, String apellido, LocalDate FechaDeNac, String DNI, String sexo, String vinculo) {
        this.numeroDeOrden = numeroDeOrden;
        this.nombre = nombre;
        this.apellido = apellido;
        this.FechaDeNac = FechaDeNac;
        this.DNI = DNI;
        this.sexo = sexo;
        this.vinculo = vinculo;
    }

    public int getNumeroDeOrden() {
        return numeroDeOrden;
    }

    public void setNumeroDeOrden(int numeroDeOrden) {
        this.numeroDeOrden = numeroDeOrden;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaDeNac() {
        return FechaDeNac;
    }

    public void setFechaDeNac(LocalDate FechaDeNac) {
        this.FechaDeNac = FechaDeNac;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getVinculo() {
        return vinculo;
    }

    public void setVinculo(String vinculo) {
        this.vinculo = vinculo;
    }

    @Override
    public String toString() {
        return "Integrante{" + "numeroDeOrden=" + numeroDeOrden + ", nombre=" + nombre + ", apellido=" + apellido + ", FechaDeNac=" + FechaDeNac + ", DNI=" + DNI + ", sexo=" + sexo + ", vinculo=" + vinculo + '}';
    }
    
    
}
