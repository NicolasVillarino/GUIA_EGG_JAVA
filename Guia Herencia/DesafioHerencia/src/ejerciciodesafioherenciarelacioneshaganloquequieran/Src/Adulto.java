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
public class Adulto extends Integrante{
    private boolean esEstudiante;
    private boolean esDeportista;
    private boolean tieneTrabajo;
    private boolean obraSocial;

    public Adulto() {
    }

    public Adulto(boolean esEstudiante, boolean esDeportista, boolean tieneTrabajo, boolean obraSocial, int numeroDeOrden, String nombre, String apellido, LocalDate FechaDeNac, String DNI, String sexo, String vinculo) {
        super(numeroDeOrden, nombre, apellido, FechaDeNac, DNI, sexo, vinculo);
        this.esEstudiante = esEstudiante;
        this.esDeportista = esDeportista;
        this.tieneTrabajo = tieneTrabajo;
        this.obraSocial = obraSocial;
    }
    
}
