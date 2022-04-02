/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosEncapsulamientoHerencia;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Eje3FormatoFechaMain {
    public static void main(String[] args) {
        
        SimpleDateFormat fech1 = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat fech2 = new SimpleDateFormat("yyyy/MM/dd");
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduzca la fecha:");
        String fecha = leer.nextLine();
        
        Date fecha1 = fech1.parse(fecha);
        System.out.println("--------------------------------------");
        System.out.println(fech1.format(fecha1));
        System.out.println("-------------------------------------- ");
        
        System.out.println("Introdusca la fecha:");
        String fech = leer.nextLine();
        
        Date fecha2 = fech1.parse(fecha1);
        System.out.println("--------------------------------------");
        System.out.println(fech2.format(fech));
        System.out.println("-------------------------------------- ");
        
    }
    
}
