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
    @FXML
    private TextField t3;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        System.out.println("HEllo");
    }    

   @FXML
    private void c7(ActionEvent event) {
        String n = t1.getText();
        
        if(n.equals("0")){
            t1.setText("7");
        }else{
            n = n + "7";
            t1.setText(n);
        }
       
    }

    @FXML
    private void c8(ActionEvent event) {
        String n = t1.getText();
        
        if(n.equals("0")){
            t1.setText("8");
        }else{
            n = n + "8";
            t1.setText(n);
        }
    }

    @FXML
    private void c9(ActionEvent event) {
        String n = t1.getText();
        
        if(n.equals("0")){
            t1.setText("9");
        }else{
            n = n + "9";
            t1.setText(n);
        }
    }

    @FXML
    private void c4(ActionEvent event) {
        String n = t1.getText();
        
        if(n.equals("0")){
            t1.setText("4");
        }else{
            n = n + "4";
            t1.setText(n);
        }
    }

    @FXML
    private void c5(ActionEvent event) {
        String n = t1.getText();
        
        if(n.equals("0")){
            t1.setText("5");
        }else{
            n = n + "5";
            t1.setText(n);
        }
    }

    @FXML
    private void c6(ActionEvent event) {
        String n = t1.getText();
        
        if(n.equals("0")){
            t1.setText("6");
        }else{
            n = n + "6";
            t1.setText(n);
        }
    }

    @FXML
    private void c1(ActionEvent event) {
        String n = t1.getText();
        
        if(n.equals("0")){
            t1.setText("1");
        }else{
            n = n + "1";
            t1.setText(n);
        }
    }

    @FXML
    private void c2(ActionEvent event) {
        String n = t1.getText();
        
        if(n.equals("0")){
            t1.setText("2");
        }else{
            n = n + "2";
            t1.setText(n);
        }
        
    }

    @FXML
    private void c3(ActionEvent event) {
        String n = t1.getText();
        
        if(n.equals("0")){
            t1.setText("3");
        }else{
            n = n + "3";
            t1.setText(n);
        }
    }

    @FXML
    private void c(ActionEvent event) {
        t1.setText("0");
    }

    @FXML
    private void c0(ActionEvent event) {
        String n = t1.getText();
        
        if(n.equals("0")){
            t1.setText("0");
        }else{
            n = n + "0";
            t1.setText(n);
        }
    }

    @FXML
    private void c_igual(ActionEvent event) {
        logica l = new logica();
        
        
        String n = t1.getText();
        
        t2.setText(l.filtrar(l.convert(n)));
        
        int resultado = l.value(l.convert(n));
        
        t3.setText(String.valueOf(resultado));
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
