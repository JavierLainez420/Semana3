package Desarrollo;

public class Ejemplo2 {
    long numeroCuenta;
    String propietarioCuenta;
    double saldoCuenta;
    
    public void abonar(double cantidad){
        saldoCuenta += cantidad;        
    }
    
    
    public void retirar(double cantidad){
        if (cantidad > saldoCuenta){
        System.out.println("¡saldo insuficiente!");
    }
    saldoCuenta -= cantidad;
    
    }
}
