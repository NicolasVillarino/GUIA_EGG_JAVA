/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodesafioherenciarelacioneshaganloquequieran.Src;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 *
 * @author max72
 */
public class comparadorDeFechas {

    comparadorDeFechas(LocalDate fecha1, LocalDate fecha2) {
        String fechaEscrita = "12 09 2023";

        // Convertir la cadena a un objeto LocalDate
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM yyyy", Locale.ENGLISH);
        LocalDate fechaIngresada = LocalDate.parse(fechaEscrita, formatter);

        // Obtener la fecha actual
        LocalDate fechaActual = LocalDate.now();

        // Comparar las fechas
        if (fechaIngresada.isAfter(fechaActual)) {
            System.out.println("La fecha ingresada es posterior a la fecha actual.");
        } else if (fechaIngresada.isBefore(fechaActual)) {
            System.out.println("La fecha ingresada es anterior a la fecha actual.");
        } else {
            System.out.println("La fecha ingresada es igual a la fecha actual.");
        }
    }
}
