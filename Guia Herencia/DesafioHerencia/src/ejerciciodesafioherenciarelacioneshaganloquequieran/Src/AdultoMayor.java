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
public final class AdultoMayor extends Integrante{
    private boolean jubilacion;

    public AdultoMayor() {
    }

    public AdultoMayor(boolean jubilacion, int numeroDeOrden, String nombre, String apellido, LocalDate FechaDeNac, String DNI, String sexo, String vinculo) {
        super(numeroDeOrden, nombre, apellido, FechaDeNac, DNI, sexo, vinculo);
        this.jubilacion = jubilacion;
    }
    
}
