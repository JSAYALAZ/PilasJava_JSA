package Materia.Pilas;

import java.util.EmptyStackException;

import Materia.Model.NodoGenerico;

public class PilaGenerica<T> {
    private NodoGenerico<T> top;
    public PilaGenerica(){
        top = null;
    }

    public void push (T dato){
        NodoGenerico<T> nuevoNodo = new NodoGenerico<T>(dato);
        nuevoNodo.next  = top;
        top = nuevoNodo;
    }
    public boolean isEmpty(){
        return top == null;
    }

    public T peek(){
        if (isEmpty()) throw new EmptyStackException();
        return top.t;
    }

    public T pop(){
        if (isEmpty()) throw new EmptyStackException();

        T value = top.t;
        top = top.next;
        return value;

    }

}
