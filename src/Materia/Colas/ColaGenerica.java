package Materia.Colas;

import java.util.NoSuchElementException;

import Materia.Model.NodoGenerico;

public class ColaGenerica<T> {
    private NodoGenerico<T> first;
    private NodoGenerico<T> last;
    private int size;
    public ColaGenerica() {
        first = null;
        last = null;
        size=0;
    }

    public void addNode(T value) {
        NodoGenerico<T> nuevoNode = new NodoGenerico<T>(value);
        if (isEmpty()) {
            first = nuevoNode;
            last = nuevoNode;
        } else {
            last.next = nuevoNode;
            last = nuevoNode;
        }
        size+=1;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public T peek(){
        if(isEmpty())throw new NoSuchElementException("La cola esta vacia");
        return first.t;

    }

    public T remove(){
        if(isEmpty())throw new NoSuchElementException("La cola esta vacia");
        T value = first.t;
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
