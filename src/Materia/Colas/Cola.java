package Materia.Colas;

import java.util.NoSuchElementException;

import Materia.Model.Node;

public class Cola {
    private Node first;
    private Node last;
    private int size;
    public Cola(){
        this.first = null;
        this.last = null;
        size=0;
    }    

    public void addNode(int value){
        Node nuevoNode = new Node(value);
        if(isEmpty()){
            first = nuevoNode;
            last=nuevoNode;
        }
        else{
            last.next=nuevoNode;
            last=nuevoNode;
        }
        size+=1;
    }

    public boolean isEmpty(){
        return first ==null;
    }

    public int peek(){
        if(isEmpty())throw new NoSuchElementException("La cola esta vacia");
        return first.value;
    }

    public int remove(){
        if(isEmpty())throw new NoSuchElementException("La cola esta vacia");
        int value = first.value;
        first = first.next;
        if(first==null){
            last=null;
        }
        size-=1;
        return value;
    }

    public int getSize() {
        return size;
    }

    
}

