/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javax.swing.JOptionPane;

/**   =
 * FXML Controller class
 *
 * @author Raul
 */
public class ByRaulController implements Initializable {

    @FXML
    private Label txtUs;
    @FXML
    private Label txtClave;
    @FXML
    private Button btnEntrar;
    
    Conexion conexion = null;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        //conexion = new Conexion();
    }    


    @FXML
    private void onClick(ActionEvent event) {
        
        String usuario = txtUs.getText();
        String password = txtClave.getText();
        
        boolean verificar = conexion.consultaUsuario(usuario, password);
        
        if(verificar){
            JOptionPane.showMessageDialog(null, "Usuario existete");
            
        }else JOptionPane.showMessageDialog(null, "NO EXISTE");
 
    }
    
}
