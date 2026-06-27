
package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import java.io.IOException;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.Node;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
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
    private BorderPane borderPane; // Contenedor principal

    @FXML
    private Label lblUsuario; // Etiqueta donde mostrarás el nombre de usuario

    @FXML
    private Button btn1;
   
    @FXML
    private Button btn2;
   
    @FXML
    private Button btn3;
   
    @FXML
    private Button btn4;
   
    @FXML
    private Button btn5;
   
    
    @FXML
    private void handleProductos() {
       
        cargarVista("/view/Productos.fxml");
    }

    @FXML
    private void handleClientes() {
        cargarVista("/view/Clientes.fxml");
    }

    @FXML
    private void handleVentas() {
        cargarVista("/view/Ventas.fxml");
    }

    @FXML
    private void handleReportes() {
        cargarVista("/view/Reportes.fxml");
    }

    @FXML
    private void handleCerrarSesion() {
        // Volver al login
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ViewLogin.fxml"));
            Node root = loader.load();
            borderPane.getScene().setRoot((Parent) root); // me pide castear a parent
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método para cargar vistas en el centro
    private void cargarVista(String fxmlPath) {
     /*   try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlPath));
            Node vista = loader.load();
            borderPane.setCenter(vista);
        } catch (IOException e) {
            e.printStackTrace();
              // Muestra un mensaje de error para depurar
            System.err.println("No se pudo cargar el FXML: " + fxmlPath);
        }*/
     
            try {
               FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlPath));
               Node vista = loader.load();
               System.out.println("Vista cargada: " + fxmlPath); // Depuración
               borderPane.setCenter(vista);
               System.out.println("Vista asignada al centro"); // Depuración
           } catch (IOException e) {
               e.printStackTrace();
           }
    }
    
    
   
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