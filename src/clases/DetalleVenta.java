
package clases;

public class DetalleVenta {
    private int cantidad;
    private double subtotal;
    private Producto producto;

    public DetalleVenta(int cantidad, Producto producto) {
        this.cantidad = cantidad;
        this.producto = producto;
        this.subtotal = producto.obtenerPrecioActual() * cantidad;
        
    }
}
