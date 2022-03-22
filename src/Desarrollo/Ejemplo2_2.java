
package Desarrollo;

import java.util.Scanner;

public class Ejemplo2_2 {
    public static void main(String[] args) {
        Ejemplo2 cuenta = new Ejemplo2();
       Scanner leer = new Scanner(System.in);
       
       double abono,retiro;
       
        System.out.println("Ingresar la cantidad a abonar: ");
        cuenta.abonar(abono = leer.nextDouble());
        
        System.out.println("Ingresar la cantidad a retirar. ");
        cuenta.retirar(retiro = leer.nextDouble());
       
    }
}
