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
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Raul
 */
public class ByRaulController implements Initializable {

    @FXML
    private Button btnHola;
    @FXML
    private TextField txtUno;
    @FXML
    private TextField txtDos;
    @FXML
    private TextField txtResultado;
    @FXML
    private Button btnSumar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void clickRaton(ActionEvent event) {
        
        System.out.println("Hola by Raul");
    }

    @FXML
    private void click(ActionEvent event) {
        
        int opeUno = Integer.parseInt(txtUno.getText());
        int opeDos = Integer.parseInt(txtDos.getText());
        
        txtResultado.setText(String.valueOf(opeUno + opeDos));
    }
    
}
