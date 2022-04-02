/*
3-. Crear la clase FormatoFecha para probar el POLIMORFISMO. La clase deberá de tener definidos dos métodos que 
reciban una fecha sin guiones ni plecas en formato String. Ejemplo 10062012. 
a) El primer método deberá de imprimir la fecha con guiones. Ejemplo: 10-06-2012.
b) El segundo método deberá de imprimir la fecha con plecas. Ejemplo: 10/06/2012
 */
package EjerciciosEncapsulamientoHerencia;


public class Eje3FormatoFecha {
      String dias;
    String mes;
    String año;

    
    public Eje3FormatoFecha() {
    }

    public Eje3FormatoFecha(String dias, String mes, String año) {
        this.dias = dias;
        this.mes = mes;
        this.año = año;
    }

    public String getDias() {
        return dias;
    }

    public void setDias(String dias) {
        this.dias = dias;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }
    

    
}
