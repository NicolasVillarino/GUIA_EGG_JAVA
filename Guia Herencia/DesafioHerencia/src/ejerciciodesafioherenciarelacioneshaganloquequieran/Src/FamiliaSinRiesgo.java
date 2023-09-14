/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodesafioherenciarelacioneshaganloquequieran.Src;

/**
 *
 * @author max72
 */
public class FamiliaSinRiesgo extends Familia {
    private boolean mejora = false;

    public FamiliaSinRiesgo(boolean mejora, String direccion, String IDE, int numeroDeLote, String barrio, String localidad) {
        super(direccion, IDE, numeroDeLote, barrio, localidad);
        this.mejora = mejora;
    }

    public FamiliaSinRiesgo(boolean mejora) {
        this.mejora = mejora;
    }

    public boolean isMejora() {
        return mejora;
    }

    public void cambiarMejora() {
        this.mejora = !mejora;
    }

    @Override
    public String toString() {
        return "FamiliaSinRiesgo{" + "mejora=" + mejora + '}';
    }
    
    
    
}
