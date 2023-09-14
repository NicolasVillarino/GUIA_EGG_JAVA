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
public class Joven extends Integrante {

    /*
    Se termino mi presencia, los quiero mucho bai
    
    */
    
    private boolean esEstudiante;
    private boolean esDeportista;
    private boolean tieneTrabajo;

    public Joven() {
    }

    public Joven(boolean esDeportista, boolean tieneTrabajo) {
        // this.esEstudiante = super.FechaDeNac. > 0;  //CAMBIAR ACA POR UN COMPARADOR
        this.esDeportista = esDeportista;
        this.tieneTrabajo = tieneTrabajo;
    }

    public Joven(boolean esEstudiante, boolean esDeportista, boolean tieneTrabajo, int numeroDeOrden, String nombre, String apellido, LocalDate FechaDeNac, String DNI, String sexo, String vinculo) {
        super(numeroDeOrden, nombre, apellido, FechaDeNac, DNI, sexo, vinculo);
        // this.esEstudiante = super.FechaDeNac. > 0;  //CAMBIAR ACA POR UN COMPARADOR
        this.esDeportista = esDeportista;
        this.tieneTrabajo = tieneTrabajo;
    }

}
