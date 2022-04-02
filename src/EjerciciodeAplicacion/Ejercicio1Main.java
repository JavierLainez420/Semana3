/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciodeAplicacion;

import java.util.Scanner;

public class Ejercicio1Main {
    public static void main(String[] args) {
        Ejercicio1 dato = new Ejercicio1();
         Scanner leer = new Scanner(System.in);
         
        System.out.println("Escriba el numero de la casa");
        int numeroCasa= Integer.parseInt(leer.nextLine());
         
        System.out.println("El numero de la casa es :" + numeroCasa);
        
        dato.setNumeroPasaje(2);
        System.out.println("El numero del pasaje es: " + dato.getNumeroPasaje());
        
        dato.setNombreCalle("Calle el salamo ");
        System.out.println("El nombre de la calle es: " + dato.getNombreCalle());
    }
    
}
