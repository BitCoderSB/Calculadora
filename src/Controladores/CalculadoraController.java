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
    private void c7(ActionEvent event) {
        if(t1.getText() != "0"){
            String n = t1.getText();
            n = n + "7";
            t1.setText(n);
        }else{
            t1.setText("7");
        }
       
    }

    @FXML
    private void c8(ActionEvent event) {
        if(t1.getText() != "0"){
            String n = t1.getText();
            n = n + "8";
            t1.setText(n);
        }else{
            t1.setText("8");
        }
    }

    @FXML
    private void c9(ActionEvent event) {
        if(t1.getText() != "0"){
            String n = t1.getText();
            n = n + "9";
            t1.setText(n);
        }else{
            t1.setText("9");
        }
    }

    @FXML
    private void c4(ActionEvent event) {
        if(t1.getText() != "0"){
            String n = t1.getText();
            n = n + "4";
            t1.setText(n);
        }else{
            t1.setText("4");
        }
    }

    @FXML
    private void c5(ActionEvent event) {
        if(t1.getText() != "0"){
            String n = t1.getText();
            n = n + "5";
            t1.setText(n);
        }else{
            t1.setText("5");
        }
    }

    @FXML
    private void c6(ActionEvent event) {
        if(t1.getText() != "0"){
            String n = t1.getText();
            n = n + "6";
            t1.setText(n);
        }else{
            t1.setText("6");
        }
    }

    @FXML
    private void c1(ActionEvent event) {
        if(t1.getText() != "0"){
            String n = t1.getText();
            n = n + "1";
            t1.setText(n);
        }else{
            t1.setText("1");
        }
    }

    @FXML
    private void c2(ActionEvent event) {
        if(t1.getText() != "0"){
            String n = t1.getText();
            n = n + "2";
            t1.setText(n);
        }else{
            t1.setText("2");
        }
        
    }

    @FXML
    private void c3(ActionEvent event) {
        if(t1.getText() != "0"){
            String n = t1.getText();
            n = n + "3";
            t1.setText(n);
        }else{
            t1.setText("3");
        }
    }

    @FXML
    private void c(ActionEvent event) {
        t1.setText("0");
    }

    @FXML
    private void c0(ActionEvent event) {
        if(t1.getText() != "0"){
            String n = t1.getText();
            n = n + "0";
            t1.setText(n);
        }else{
            t1.setText("0");
        }
    }

    @FXML
    private void c_igual(ActionEvent event) {
        
    }

    @FXML
    private void mas(ActionEvent event) {
        String n = t1.getText();
        n = n + "+";
        t1.setText(n);
    }

    @FXML
    private void menos(ActionEvent event) {
        String n = t1.getText();
        n = n + "-";
        t1.setText(n);
    }

    @FXML
    private void por(ActionEvent event) {
        String n = t1.getText();
        n = n + "*";
        t1.setText(n);
    }

    @FXML
    private void entre(ActionEvent event) {
        String n = t1.getText();
        n = n + "/";
        t1.setText(n);
    }
    
    
    
}
