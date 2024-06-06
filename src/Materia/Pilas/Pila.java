package Materia.Pilas;

import java.util.EmptyStackException;

import Materia.Model.Node;

public class Pila {
    private Node top;   
    private int size; 
    public Pila(){
        top = null;
        size=0;
    }


    //PUSH
    public void push(int value){
        Node newNode = new Node(value);
        newNode.next=top;
        top = newNode;
        size++;
    }

    public int pop(){
        if(top==null) {
            System.out.println("La fila esta vacia");
            throw new EmptyStackException();
        }
        else{
            int value = top.value;
            top = top.next;
            size--;
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
    public int size(){
        return size;
    }
}
