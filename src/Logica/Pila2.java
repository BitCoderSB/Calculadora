/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.util.ArrayList;

/**
 *
 * @author Carlos
 */

class Node {
    
    int data;
    Node next;

    public Node(int dato){
        this.data = dato;
        this.next = null;
        
    }
    
    public Node(){
        this(0);
    }

}


public class Pila2 {

    private Node Tope;

    public Pila2(){
        Tope = null; 
    }

    public void push(int data){
        Node P = new Node(data);
        if(isEmpty()){
            Tope = P;
            return;
        }

        P.next = Tope;
        Tope = P;

    }

    public int pop(){
        
        if(isEmpty()){
            return -1;
        }

        Node P = Tope;
        Tope = Tope.next;
        
        return P.data;
    }

    public int peek(){
        if(isEmpty()){
            return -1;
        }
        return Tope.data;
    }

    public boolean isEmpty(){
        return Tope == null;
    }
    
    public void mostrar(){

        ArrayList<Node> list = new ArrayList<>();
        Node P;

        for(P = Tope; P != null; P = P.next){
            list.add(P);
        }

        System.out.print("Pila:");
        if(isEmpty()){
            System.out.print(" []\n");
            return;
        }
        System.out.print("[");
        for(int i = list.size() - 1; i >= 0; i--){
            P = list.get(i);
            System.out.print(" " + P.data);
        }
        System.out.print(" ]\n");


    }
}
