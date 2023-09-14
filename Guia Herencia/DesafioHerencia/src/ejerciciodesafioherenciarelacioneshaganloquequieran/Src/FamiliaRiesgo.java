/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodesafioherenciarelacioneshaganloquequieran.Src;

import java.util.ArrayList;

/**
 *
 * @author max72
 */
public class FamiliaRiesgo extends Familia {

    private ArrayList<Integer> factoresDeRiesgo;

    public FamiliaRiesgo(ArrayList<Integer> factoresDeRiesgo, String direccion, String IDE, int numeroDeLote, String barrio, String localidad) {
        super(direccion, IDE, numeroDeLote, barrio, localidad);
        this.factoresDeRiesgo = factoresDeRiesgo;
    }

    public FamiliaRiesgo(ArrayList<Integer> factoresDeRiesgo) {
        this.factoresDeRiesgo = factoresDeRiesgo;
    }

    public ArrayList<Integer> getFactoresDeRiesgo() {
        return factoresDeRiesgo;
    }

    public void setFactoresDeRiesgo(ArrayList<Integer> factoresDeRiesgo) {
        this.factoresDeRiesgo = factoresDeRiesgo;
    }

    public void addFactoresDeRiesgo(Integer e) {
        this.factoresDeRiesgo.add(e);
    }

    @Override
    public String toString() {
        return super.toString() + "FamiliaRiesgo{" + "factoresDeRiesgo=" + factoresDeRiesgo + '}';
    }

}
