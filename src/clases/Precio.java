
package clases;

import java.time.LocalDate;


public class Precio {
    private int numeroPrecio;
    private LocalDate fechaBajaPrecio;
    private double precioventa;

    public Precio(int numeroPrecio, double precioActual) {
        this.numeroPrecio = numeroPrecio;
        this.fechaBajaPrecio = null;
        this.precioventa = precioActual;
    }

    public void setNumeroPrecio(int numeroPrecio) {
        this.numeroPrecio = numeroPrecio;
    }

    public void setFechaBajaPrecio() {
        this.fechaBajaPrecio = LocalDate.now();
    }

    public void setPrecioActual(double precioActual) {
        this.precioventa = precioActual;
    }

    public int getNumeroPrecio() {
        return numeroPrecio;
    }

    public LocalDate getFechaBajaPrecio() {
        return fechaBajaPrecio;
    }

    public double getPrecioActual() {
        return precioventa;
    }
    
}
