/**
3-. Modelar una clase Estudiante que nos permita almacenar los datos de 5 estudiantes. Los datos que nos interesan
son el número de carnet, el nombre y el código de la carrera. Se debe de utilizar la clase HashTable para almacenar los
datos de los estudiantes. La clase deberá de permitir almacenar los cinco estudiantes y almacenarlos en la clase
Estudiante por medio de su constructor. Cuando los datos sean almacenados por medio del constructor, la clase deberá de
tener un método para imprimir los datos de cada uno de los estudiantes.
 */
package EjerciciodeAplicacion;


public class Ejercicio3 {
      int carnet;
  String nombre;
   int codigoCarrera;

    public Ejercicio3() {
    }

    public Ejercicio3(int carnet, String nombre, int codigoCarrera) {
        this.carnet = carnet;
        this.nombre = nombre;
        this.codigoCarrera = codigoCarrera;
    }

    public int getCarnet() {
        return carnet;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigoCarrera() {
        return codigoCarrera;
    }

    public void setCodigoCarrera(int codigoCarrera) {
        this.codigoCarrera = codigoCarrera;
    }
   
    
    
}
