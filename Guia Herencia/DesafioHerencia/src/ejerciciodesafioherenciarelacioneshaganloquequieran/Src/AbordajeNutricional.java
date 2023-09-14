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
public class AbordajeNutricional {
    private int numeroDeOrden;
    private int edad;
    private float peso;
    private boolean eutrofico;
    private boolean bajoPeso;
    private boolean sobrePeso;

    public AbordajeNutricional(int numeroDeOrden, int edad, float peso, boolean eutrofico, boolean bajoPeso, boolean sobrePeso) {
        this.numeroDeOrden = numeroDeOrden;
        this.edad = edad;
        this.peso = peso;
        this.eutrofico = eutrofico;
        this.bajoPeso = bajoPeso;
        this.sobrePeso = sobrePeso;
    }

    public AbordajeNutricional() {
    }

    @Override
    public String toString() {
        return "AbordajeNutricional{" + "numeroDeOrden=" + numeroDeOrden + ", edad=" + edad + ", peso=" + peso + ", eutrofico=" + eutrofico + ", bajoPeso=" + bajoPeso + ", sobrePeso=" + sobrePeso + '}';
    }

    
    public int getNumeroDeOrden() {
        return numeroDeOrden;
    }

    public void setNumeroDeOrden(int numeroDeOrden) {
        this.numeroDeOrden = numeroDeOrden;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public boolean isEutrofico() {
        return eutrofico;
    }

    public void setEutrofico(boolean eutrofico) {
        this.eutrofico = eutrofico;
    }

    public boolean isBajoPeso() {
        return bajoPeso;
    }

    public void setBajoPeso(boolean bajoPeso) {
        this.bajoPeso = bajoPeso;
    }

    public boolean isSobrePeso() {
        return sobrePeso;
    }

    public void setSobrePeso(boolean sobrePeso) {
        this.sobrePeso = sobrePeso;
    }
    
    
}
