
package clases;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Producto {
    private String codProducto;    
    private String nombreProducto;
    private int stock;
    private LocalDate fechaBajaProducto;
    private List<Precio> precios = new ArrayList<Precio>();
    private Categoria categoria;
    private Proveedor proveedorActual;

    public Producto(String codProducto, String nombreProducto, int stock, Categoria categoria, Proveedor proveedorActual, double precioProducto ) {
        this.codProducto = codProducto;
        this.nombreProducto = nombreProducto;
        this.stock = stock;
        this.fechaBajaProducto = null;
        this.categoria = categoria;
        this.proveedorActual = proveedorActual;
        this.precios.add(new Precio(32, precioProducto));
    }
   

    public void setCodProducto(String codProducto) {
        this.codProducto = codProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setFechaBajaProducto(LocalDate fechaBajaProducto) {
        this.fechaBajaProducto = fechaBajaProducto;
    }

    public void setPrecios( Precio precios) {
        //this.precios.add(precios);
        if(this.precios.isEmpty()){
            this.precios.add(precios);
        }        
        else{
            this.precios.get((this.precios.size()-1)).setFechaBajaPrecio();
            this.precios.add(precios);
        }
  
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getCodProducto() {
        return codProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public int getStock() {
        return stock;
    }

    public LocalDate getFechaBajaProducto() {
        return fechaBajaProducto;
    }

    public List<Precio> getPrecios() {
        return precios;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public Proveedor getProveedorActual() {
        return proveedorActual;
    }
    
    public void ObtenerHistoricoPrecios(){
        System.out.println("Historico :");
        for(Precio indice : precios){
           
            System.out.println("precio : " + indice.getPrecioActual());
            System.out.println("fecha : " + indice.getFechaBajaPrecio());
            if(indice.getFechaBajaPrecio() ==  null){
             
            System.out.println("Precio Actual : " + indice.getPrecioActual() );
               
            }
        }
        
    }
    public double obtenerPrecioActual(){
          for(Precio indice : precios){
           
          
            if(indice.getFechaBajaPrecio() ==  null){
             
            return indice.getPrecioActual();
               
            }
        }
          return 0;
    }
    
}
