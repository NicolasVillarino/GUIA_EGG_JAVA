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
public class Familia {

    private String direccion;
    private String IDE;
    private int numeroDeLote;
    private String barrio;
    private String localidad;
    private ArrayList<Integrante> integrantes;
    private InformacionDeVivienda casita;

    public Familia(String direccion, String IDE, int numeroDeLote, String barrio, String localidad) {
        this.direccion = direccion;
        this.IDE = IDE;
        this.numeroDeLote = numeroDeLote;
        this.barrio = barrio;
        this.localidad = localidad;
    }

    public Familia() {

    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getIDE() {
        return IDE;
    }

    public void setIDE(String IDE) {
        this.IDE = IDE;
    }

    public int getNumeroDeLote() {
        return numeroDeLote;
    }

    public void setNumeroDeLote(int numeroDeLote) {
        this.numeroDeLote = numeroDeLote;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public ArrayList<Integrante> getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(ArrayList<Integrante> integrantes) {
        this.integrantes = integrantes;
    }

    @Override
    public String toString() {
        return "Familia{" + "direccion=" + direccion + ", IDE=" + IDE + ", numeroDeLote=" + numeroDeLote + ", barrio=" + barrio + ", localidad=" + localidad + ", integrantes=" + integrantes + '}';
    }

    public int cantidadPersonas() {
        return integrantes.size();
    }

    public int cantidadHombres() {
        int aux = 0;

        for (Integrante integrante : integrantes) {
            if (integrante.getSexo().equalsIgnoreCase("h")) {
                aux++;
            }
        }
        return aux;
    }

    public int cantidadMujeres() {
        int aux = 0;

        for (Integrante integrante : integrantes) {
            if (integrante.getSexo().equalsIgnoreCase("m")) {
                aux++;
            }
        }
        return aux;
    }

    public int[] contarEdades() {
        int[] edades = {0, 0, 0, 0, 0, 0, 0};
        int edad;
        for (Integrante integrante : integrantes) {
            edad = 2023 - integrante.getFechaDeNac().getYear();
            if (edad < 1) {
                edades[0]++;
            } else if (edad < 2) {
                edades[1]++;
            } else if (edad < 6) {
                edades[2]++;
            } else if (edad < 7) {
                edades[3]++;
            } else if (edad < 11) {
                edades[4]++;
            } else if (edad < 21) {
                edades[5]++;
            } else if (edad < 61) {
                edades[6]++;
            } else {
                edades[7]++;
            }
        }

        return edades;
    }

    public int[] resumenProbSalud() {
        int[] problemitas = {0, 0, 0, 0, 0};
        for (Integrante integrante : integrantes) {
            if (integrante.getProblemaMental() != null) {
                if (integrante.getProblemaMental().isHTA()) {
                    problemitas[0]++;
                }
                if (integrante.getProblemaMental().isDBT()) {
                    problemitas[1]++;
                }
            }
            if (integrante.getToiGordito() != null) {
                if (integrante.getToiGordito().isEutrofico()) {
                    problemitas[2]++;
                }
                if (integrante.getToiGordito().isBajoPeso()) {
                    problemitas[3]++;
                }
                if (integrante.getToiGordito().isSobrePeso()) {
                    problemitas[4]++;
                }
            }
        }
        return problemitas;
    }
}
