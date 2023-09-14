/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Entidades.Alquiler;
import Entidades.Barcos.BarcoAMotor;
import Entidades.Barcos.Velero;
import Entidades.Barcos.Yate;
import Servicios.AlquilerService;
import Servicios.Barcos.BarcoAMotorService;
import Servicios.Barcos.VeleroService;
import Servicios.Barcos.YateService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

        BarcoAMotorService barcoAMotorService = new BarcoAMotorService();
        VeleroService veleroService = new VeleroService();
        YateService yateService = new YateService();
        AlquilerService alquilerService = new AlquilerService();

        List<Alquiler> alquileres = new ArrayList<>();

        // BarcoAMotor barcoAMotor1 = barcoAMotorService.crear(scanner);
        Velero velero1 = veleroService.crear(scanner);
        // Yate yate1 = yateService.crear(scanner);

        alquileres.add(alquilerService.crearAlquiler(scanner, velero1));

        for (Alquiler alquiler : alquileres) {
            System.out.println(alquiler);
        }
    }
}
