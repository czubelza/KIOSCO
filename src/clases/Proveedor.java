package clases;

import java.time.LocalDate;

public class Proveedor {
    private String codProveedor;
    private String nombreProveedor;
    private LocalDate fechaBajaProveedor;

    public Proveedor(String codProveedor, String nombreProveedor) {
        this.codProveedor = codProveedor;
        this.nombreProveedor = nombreProveedor;
        this.fechaBajaProveedor = null;
    }

   

    public void setCodProveedor(String codProveedor) {
        this.codProveedor = codProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public void setFechaBajaProveedor(LocalDate fechaBajaProveedor) {
        this.fechaBajaProveedor = fechaBajaProveedor;
    }

    public String getCodProveedor() {
        return codProveedor;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public LocalDate getFechaBajaProveedor() {
        return fechaBajaProveedor;
    }
    
    
}
