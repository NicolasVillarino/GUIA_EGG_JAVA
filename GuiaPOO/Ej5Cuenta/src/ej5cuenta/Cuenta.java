 /*
Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
Las operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package ej5cuenta;

import java.util.Scanner;

/**
 *
 * @author 57311
 */
public class Cuenta {
 Scanner leer = new Scanner(System.in);
    
   private int numeroCuenta, DNI;
   private double saldoActual;

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public Cuenta(int numeroCuenta, int DNI, double saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.DNI = DNI;
        this.saldoActual = saldoActual;
    }

    public Cuenta() {
    }

    @Override
    public String toString() {
        return "Cuenta{" + ", numeroCuenta=" + numeroCuenta + ", DNI=" + DNI + ", saldoActual=" + saldoActual + '}';
    }
    
    
    //private static class crearCuenta {  
    public Cuenta crearCuenta() {
        
      //  Scanner leer = new Scanner(System.in);
        Cuenta C1 = new Cuenta();

        System.out.println("Escriba el DNI");
        C1.setDNI(leer.nextInt());
        System.out.println("Escriba el número de cuenta");
        C1.setNumeroCuenta(leer.nextInt());
        System.out.println("Escriba el saldo inicial");
        C1.setSaldoActual(leer.nextDouble());
        
        return C1;

    }
    //    public crearCuenta() {
       // }
    
    
    /*d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
*/
   
    public void ingresar  () {
        

        System.out.println("Ingrese el valor del depósito");
        double valorDeposito = leer.nextDouble();
        saldoActual += valorDeposito;
       
        
    }
    
    /*e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
    */
    
    public void retiro (){
        System.out.println("Ingrese el valor del retiro");
        double valorRetiro = leer.nextDouble();
        if (saldoActual - valorRetiro <=0 ) {
            System.out.println("No cuenta con el saldo suficiente para el retiro");
            //conviene usar función máximo para mostrar el valor a retirar
            System.out.println("Su retiro será por valor de: " + saldoActual);
            
        } else
            saldoActual -= valorRetiro;
        
            
        }
       
  /*  f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.*/

    public void extraccionRapida(){
        System.out.println("Ingrese el valor del retiro - recuerde que no puede ser más del 20% de su saldo actual");
        double valorRetiro = leer.nextDouble();
        //Aquí es mejor usar un do, por si el usuario se equivoca varias veces
        if (saldoActual * 0.2 < valorRetiro) {
            System.out.println("Recuerde que no puede exceder el 20% de su saldo");
            //conviene usar función máximo para mostrar el valor a retirar
            System.out.println("El valor máximo que puede retirar es: " + saldoActual*0.2 + ", el retiro no se realizó");

            
        } else
            saldoActual -= valorRetiro;
        
    }

/*g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.*/
    
    public void consultarSaldo (Cuenta C1) {
       
        System.out.println("El saldo de su cuenta es de: " + C1.getSaldoActual());
    }
    
 /*h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta*/
    
    public void consultarDatosCta (Cuenta C1) {
        System.out.println(C1.toString());
    }
    
}


