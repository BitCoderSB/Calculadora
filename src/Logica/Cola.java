/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author Carlos
 */
class Node {
    
    String data;
    Node next;

    public Node(String dato){
        this.data = dato;
        this.next = null;
        
    }
    
    public Node(){
        this("0");
    }
    
}

public class Cola {

    private Node Frente;
    private Node Fondo;

    public Cola(){
        Frente = null;
        Fondo = null;
    }

    public boolean isEmpty(){
        return Frente == null;
    }

    public void queue(String data){
        Node P = new Node(data);

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

        Node P = Frente;
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
