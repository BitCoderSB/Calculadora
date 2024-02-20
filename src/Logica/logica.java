/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author Carlos
 */
public class logica {
    private Pila p;
    private Cola Q;

    public logica(){
        p = new Pila();
        Q = new Cola();
    }

    private boolean esOperador(char c){
        return c == '+' || c == '-' || c == '*' || c == '/';
    }

    private int precedencia(char c){

        switch (c) {
            case '+': 
            case '-':
            return 1;
            case '*':
            case '/':
            return 2;
        }

        return -1;

    }

    public String convert(String c){

        String resultado = "";
        
        for(int i = 0; i < c.length(); i++){
            if(Character.isDigit(c.charAt(i))){
                resultado = resultado + c.charAt(i);
            }else{
                resultado = resultado + '|';
                if(precedencia(c.charAt(i)) == precedencia(p.peek())){
                    resultado = resultado + p.pop() + '|';
                    p.push(c.charAt(i));
                }else if(precedencia(p.peek()) > precedencia(c.charAt(i))){
                    while (!p.isEmpty()) {
                        resultado = resultado + p.pop() + '|';
                    }

                    p.push(c.charAt(i));
                }else if(precedencia(c.charAt(i)) > precedencia(p.peek())){
                    p.push(c.charAt(i));
                }
            }
            
        }
        
        resultado = resultado + '|';
        while (!p.isEmpty()) {
            resultado = resultado + p.pop() + '|';
        }
        System.out.println(resultado);
        return resultado;

    }
    
    public String filtrar(String c){
        
        
        String resultado = "";
        
        for(int i = 0; i < c.length(); i++){
            if(c.charAt(i) != '|'){
                resultado = resultado + c.charAt(i);
            }
        }
        
        return resultado;
    }

}
