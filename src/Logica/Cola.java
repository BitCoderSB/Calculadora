/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author Carlos
 */
class Node1 {
    
    String data;
    Node1 next;

    public Node1(String dato){
        this.data = dato;
        this.next = null;
        
    }
    
    public Node1(){
        this("0");
    }
    
}

public class Cola {

    private Node1 Frente;
    private Node1 Fondo;

    public Cola(){
        Frente = null;
        Fondo = null;
    }

    public boolean isEmpty(){
        return Frente == null;
    }

    public void queue(String data){
        Node1 P = new Node1(data);

        if(isEmpty()){
            Frente = P;
            Fondo = P;
            return;
        }

        Fondo.next = P;
        Fondo = P;

    }

    public String dequeue(){

        if(isEmpty()){
            return "";
        }

        Node1 P = Frente;
        Frente = Frente.next;
        
        return P.data;

    }

    public String peek(){
        if(isEmpty()){
            return "";
        }

        return Frente.data;
    }

    
}
