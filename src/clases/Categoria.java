
package clases;
import java.time.LocalDate;

public class Categoria {
    private String Codcategoria;
    private String nombreCategoria;
    private LocalDate fechaBajaCategoria;
   

    public Categoria(String Ccodategoria, String nombreCategoria) {
        this.Codcategoria = Ccodategoria;
        this.nombreCategoria = nombreCategoria;
        this.fechaBajaCategoria = null;
    }
        
}
