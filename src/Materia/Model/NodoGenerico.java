package Materia.Model;

public class NodoGenerico<T> {
    public T t;
    public NodoGenerico<T> next;

    public NodoGenerico(T t){
        this.t = t;
    }
}
