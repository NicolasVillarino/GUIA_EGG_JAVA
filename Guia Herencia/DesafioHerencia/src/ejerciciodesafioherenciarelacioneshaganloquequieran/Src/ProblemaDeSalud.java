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
public class ProblemaDeSalud {
    private int numeroDeOrden;
    private String IDEFamilia;
    private boolean HTA;
    private boolean DBT;

    public ProblemaDeSalud(int numeroDeOrden, String IDEFamilia, boolean HTA, boolean DBT) {
        this.numeroDeOrden = numeroDeOrden;
        this.IDEFamilia = IDEFamilia;
        this.HTA = HTA;
        this.DBT = DBT;
    }

    public int getNumeroDeOrden() {
        return numeroDeOrden;
    }

    public void setNumeroDeOrden(int numeroDeOrden) {
        this.numeroDeOrden = numeroDeOrden;
    }

    public String getIDEFamilia() {
        return IDEFamilia;
    }

    public void setIDEFamilia(String IDEFamilia) {
        this.IDEFamilia = IDEFamilia;
    }

    public boolean isHTA() {
        return HTA;
    }

    public void setHTA(boolean HTA) {
        this.HTA = HTA;
    }

    public boolean isDBT() {
        return DBT;
    }

    public void setDBT(boolean DBT) {
        this.DBT = DBT;
    }

    public ProblemaDeSalud() {
    }

    @Override
    public String toString() {
        return "ProblemaDeSalud{" + "numeroDeOrden=" + numeroDeOrden + ", IDEFamilia=" + IDEFamilia + ", HTA=" + HTA + ", DBT=" + DBT + '}';
    }
    
    
}
