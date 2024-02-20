/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controladores;

import Logica.logica;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Carlos
 */
public class CalculadoraController implements Initializable {

    @FXML
    private TextField t1;
    @FXML
    private TextField t2;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void click(ActionEvent event) {
        System.out.println("Pendejo");
        logica l = new logica();
        
        String n = l.convert(t1.getText());
        
        t2.setText(n);
        
        l.separar(n);
    }
    
    
    
}
