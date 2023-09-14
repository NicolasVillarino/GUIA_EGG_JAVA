/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej5cuenta;

import java.util.Scanner;

/**
 *
 * @author 57311
 */
public class Ej5Cuenta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        Cuenta cta1 = new Cuenta();

        cta1=cta1.crearCuenta();

        int opcion;

        do {
            System.out.println("Escoja una opción\n1. Deposito.\n2. Retiro.\n3.Retiro rápido\n4. Consultar Saldo\n5. Consultar Datos\n6.Salir");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    cta1.ingresar();
                    break;
                case 2:
                    cta1.retiro();
                    break;
                case 3:
                    cta1.extraccionRapida();
                    break;
                case 4:
                    cta1.consultarSaldo(cta1);
                    break;
                case 5:
                    cta1.consultarDatosCta(cta1);
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        } while (opcion != 6);

    }
}
