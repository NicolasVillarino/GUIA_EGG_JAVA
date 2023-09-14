/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodesafioherenciarelacioneshaganloquequieran;

import ejerciciodesafioherenciarelacioneshaganloquequieran.Src.*;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author max72
 */
public class EjercicioDesafioHerenciaRelacionesHaganLoQueQuieran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ninio n1 = new Ninio(1, "Santi", "Peralta", LocalDate.of(2020, 05, 20), "11111112", "h", "Hijo");
        Joven j1 = new Joven(true,false, true,1, "Luis", "Peralta", LocalDate.of(2010, 1, 05), "11111113", "h", "Hijo");
        
        Adulto a1 = new Adulto(true,false, true,true,1, "Mica", "Peralta", LocalDate.of(1970, 05, 12), "11111111", "m", "Madre");
        AdultoMayor am1 = new AdultoMayor(true,1, "Santi", "Peralta", LocalDate.of(1980, 8, 20), "11111112", "h", "Hijo");
        
        Familia f1 = new Familia();
        
        ArrayList<Integrante> integ = new ArrayList();
        integ.add(n1);
        integ.add(j1);
        integ.add(a1);
        integ.add(am1);
        
        f1.setIntegrantes(integ);
        
    }
    
}
