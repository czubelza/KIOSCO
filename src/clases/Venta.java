
package clases;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Venta {
    
    private String codVenta;   
    private LocalDate fechaVenta;
    private double totalVenta;
    private List<DetalleVenta> detallesVenta = new ArrayList<DetalleVenta>();
    private Cliente cliente;

    public Venta(LocalDate fechaVenta, Cliente cliente) {
        this.fechaVenta = fechaVenta;
        this.cliente = cliente;
    }

    public void agregarProductoparaVenta(int cantidad,Producto producto ){
        detallesVenta.add(new DetalleVenta(cantidad,producto));
    }

   
    public void setCodVenta(String codVenta) {
        this.codVenta = codVenta;
    }

    public void setTotalVenta(double totalVenta) {
        this.totalVenta = totalVenta;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
   
    public String getCodVenta() {
        return codVenta;
    }

    public double getTotalVenta() {
        return totalVenta;
    }

    public Cliente getCliente() {
        return cliente;
    }
 
    
  
}
