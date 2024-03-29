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
class Node2 {
    
    char data;
    Node2 next;

    public Node2(char dato){
        this.data = dato;
        this.next = null;
        
    }
    
    public Node2(){
        this('0');
    }
    
}



public class Pila {

    private Node2 Tope;

    public Pila(){
        Tope = null; 
    }

    public void push(char data){
        Node2 P = new Node2(data);
        if(isEmpty()){
            Tope = P;
            return;
        }

        P.next = Tope;
        Tope = P;

    }

    public char pop(){
        
        if(isEmpty()){
            return '\0';
        }

        Node2 P = Tope;
        Tope = Tope.next;
        
        return P.data;
    }

    public char peek(){
        if(isEmpty()){
            return '\0';
        }
        return Tope.data;
    }

    public boolean isEmpty(){
        return Tope == null;
    }

    public void mostrar(){

        ArrayList<Node2> list = new ArrayList<>();
        Node2 P;

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
