
package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
/**
 * FXML Controller class
 *
 * @author cristian
 */
public class ViewPrincipalController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    private Label lblUsuario; // Etiqueta donde mostrarás el nombre de usuario

    // Método para recibir el nombre de usuario desde el login
    public void initData(String username) {
        lblUsuario.setText("Bienvenido, " + username);
        // Aquí puedes hacer lo que necesites con el username
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Inicialización básica
    }
}