/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;
import java.sql.SQLException;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.scene.input.KeyEvent;
import database.DatabaseConnection;
import database.DatabaseQuery;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
/**
 * FXML Controller class
 *
 * @author cristian
 */
public class ViewLoginController implements Initializable {

    
    @FXML
    private TextField txtUser;
    
    @FXML
    private PasswordField txtPassword;
    
    @FXML
    private Button btnLogin;
   
    @FXML
    private void eventKey(KeyEvent event){
        
         Object evt = event.getSource();
        if (evt.equals(txtUser) || evt.equals(txtPassword)) {
            if (event.getCharacter().equals(" ")) {
                event.consume();
            }
        }
        
    }
    
    
    @FXML
    private void eventAction(ActionEvent event){
        String username = txtUser.getText();
        String password = txtPassword.getText();

        try {
            if (DatabaseQuery.validateLogin(username, password)) {
                // Login exitoso: cargar la ventana principal
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ViewPrincipal.fxml"));
                Parent root = loader.load();

                
                
                // Obtener el controlador de la ventana principal
                ViewPrincipalController principalController = loader.getController();

                // Pasar el nombre de usuario al controlador principal
                principalController.initData(username);
                
                
                // Obtener el Stage actual
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

                // Configurar la nueva escena
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
                
                
            } else {
                // Login fallido: mostrar error
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error");
                alert.setHeaderText(null);
                alert.setContentText("Usuario o contraseña incorrectos.");
                alert.showAndWait();
            }
        } catch (SQLException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Error al conectar a la base de datos: " + e.getMessage());
            alert.showAndWait();
        } catch (IOException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Error al cargar la ventana principal: " + e.getMessage());
            alert.showAndWait();
        }
    }
        
        
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
          // Bloquear espacios en txtUser
        txtUser.setTextFormatter(new TextFormatter<>(change -> {
            if (change.getControlNewText().contains(" ")) {
                return null;
            }
            return change;
        }));

        // Bloquear espacios en txtPassword
        txtPassword.setTextFormatter(new TextFormatter<>(change -> {
            if (change.getControlNewText().contains(" ")) {
                return null;
            }
            return change;
        }));
    }    
    
}



