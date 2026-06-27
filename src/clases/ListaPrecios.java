
package clases;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ListaPrecios {
        private String codListaPrecios;
	private LocalDate fechaInicioLP;
	private LocalDate fechaFinLP;
	private Proveedor proveedor;
	private List<LPP> Listaprecioproducto = new ArrayList<LPP>();
}
