/**
2-. Modelar una clase CalculoIva para realizar el cálculo del IVA. La clase deberá de tener dos métodos, el primero que
calcule el IVA al precio de un artículo el cual deberá de recibir como parámetros el precio sin IVA y el porcentaje del IVA
a aplicar y el segundo que reciba como parámetro el precio del articulo con IVA y el porcentaje del IVA y que devuelva el
precio del artículo sin IVA.
 */
package EjerciciodeAplicacion;

public class Ejercicio2 {
    double precioArticulo;
    double precioArticuloconIva;
    double precioArticuloSinIva;
    double porcentIva;
    double valorIva;

    public Ejercicio2(double precioArticulo, double precioArticuloconIva, double precioArticuloSinIva, double porcentIva, double valorIva) {
        this.precioArticulo = precioArticulo;
        this.precioArticuloconIva = precioArticuloconIva;
        this.precioArticuloSinIva = precioArticuloSinIva;
        this.porcentIva = porcentIva;
        this.valorIva = valorIva;
    }

    public Ejercicio2() {
    }

    public double getPorcentIva() {
        return porcentIva;
    }

    public void setPorcentIva(double porcentIva) {
        this.porcentIva = 0.13;
    }

    public double getPrecioArticuloconIva() {
        return precioArticuloconIva;
    }

    public void setPrecioArticuloconIva(double precioArticuloSinIva) {
        this.precioArticuloconIva = precioArticuloSinIva;
    }

    public double getPrecioArticuloSinIva() {
        return precioArticuloSinIva;
    }

    public void setPrecioArticuloSinIva() {
        this.precioArticuloSinIva = this.precioArticuloconIva - this.precioArticulo;
    }
    
    public double getValorIva() {
        return precioArticulo;
    }
    public void setValorIva() {
        this.precioArticulo = precioArticuloconIva * 0.13;
    }
   
    
    
}
