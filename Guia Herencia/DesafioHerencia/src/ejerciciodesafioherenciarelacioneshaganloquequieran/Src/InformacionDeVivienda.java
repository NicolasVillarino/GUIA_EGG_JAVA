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
public class InformacionDeVivienda {
    private int numeroDeDormitorios;
    private String tipoDeParedes;
    private String tipoDePiso;
    private boolean iluminacion; // SI TIENE LUZ EN SU CORAZON

    public InformacionDeVivienda() {
    }

    public int getNumeroDeDormitorios() {
        return numeroDeDormitorios;
    }

    public void setNumeroDeDormitorios(int numeroDeDormitorios) {
        this.numeroDeDormitorios = numeroDeDormitorios;
    }

    public String getTipoDeParedes() {
        return tipoDeParedes;
    }

    public void setTipoDeParedes(String tipoDeParedes) {
        this.tipoDeParedes = tipoDeParedes;
    }

    public String getTipoDePiso() {
        return tipoDePiso;
    }

    public void setTipoDePiso(String tipoDePiso) {
        this.tipoDePiso = tipoDePiso;
    }

    public boolean isIluminacion() {
        return iluminacion;
    }

    public void setIluminacion(boolean iluminacion) {
        this.iluminacion = iluminacion;
    }

    public InformacionDeVivienda(int numeroDeDormitorios, String tipoDeParedes, String tipoDePiso, boolean iluminacion) {
        this.numeroDeDormitorios = numeroDeDormitorios;
        this.tipoDeParedes = tipoDeParedes;
        this.tipoDePiso = tipoDePiso;
        this.iluminacion = iluminacion;
    }

    @Override
    public String toString() {
        return "InformacionDeVivienda{" + "numeroDeDormitorios=" + numeroDeDormitorios + ", tipoDeParedes=" + tipoDeParedes + ", tipoDePiso=" + tipoDePiso + ", iluminacion=" + iluminacion + '}';
    }
    
    
}
