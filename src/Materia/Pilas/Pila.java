package Materia.Pilas;

import java.util.EmptyStackException;

import Materia.Model.Node;

public class Pila {
    private Node top;    
    public Pila(){
        top = null;
    }


    //PUSH
    public void push(int value){
        Node newNode = new Node(value);
        newNode.next=top;
        top = newNode;
    }

    public int pop(){
        if(top==null) {
            System.out.println("La fila esta vacia");
            throw new EmptyStackException();
        }
        else{
            int value = top.value;
            top = top.next;
            return value;
        }
    }
    
    public int peek(){
        if(top==null) {
            System.out.println("La fila esta vacia");
            throw new EmptyStackException();
        }
        
            return top.value;
    }

    public boolean isEmpty(){
        return top == null;
    }
}
