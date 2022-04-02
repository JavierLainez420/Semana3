/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosEncapsulamientoHerencia;

import java.util.Scanner;
public class Eje1EmpleadoMain {
        public static void main(String[] args) {
        String nombre, apellido, direccion;
        double noNit, salarioDevengado, salarioDescuento;
        String bandera = "";
        String info = "";
        double descu = 0.0;
        Eje1Empleado empleado = new Eje1Empleado();
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el numero de NIT :");
        empleado.setNit(Double.parseDouble(leer.nextLine()));
        System.out.println("Ingresa el nombre :");
        empleado.setNombre(leer.nextLine());
        System.out.println("Ingrese el Apellido :");
        empleado.setApellido(leer.nextLine());
        System.out.println("Direccion del Empleado :");
        empleado.setDireccion(leer.nextLine());
        System.out.println("Salario devengado : ");
        empleado.setSalario(Double.parseDouble(leer.nextLine()));
        System.out.println("Ingrese el numero segun 1.Activo o 2.Inactivo :");
        empleado.setBandera(Integer.parseInt(leer.nextLine()));
        //empleado.setBandera(Boolean.toString(leer.hasNextBoolean())); 
        info = empleado.informacion(empleado);
        descu = empleado.descuentoRenta();
        
        
        System.out.println("------------------------------------");
        System.out.println(""+info);
        System.out.println("El salario con descuento de renta es : $"+ descu);
        empleado.bandera();
       
    }
    
}
