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
public class Ninio extends Integrante {

    public Ninio() {

    }

    public Ninio(int numeroDeOrden, String nombre, String apellido, LocalDate FechaDeNac, String DNI, String sexo, String vinculo) {
        super(numeroDeOrden, nombre, apellido, FechaDeNac, DNI, sexo, vinculo);

    }

}
