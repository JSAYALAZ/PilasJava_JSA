package Ejercicio_03_linkedLists;

import Materia.ListasEnlazadas.ListaEnlazada;

public class LinkedListEjr {
    private ListaEnlazada lista;
    public LinkedListEjr(ListaEnlazada lista){
        this.lista = lista;
    }
    public int getByPos(int position){
        
        for (int i = lista.size-1; i > position; i--) {
            lista.head = lista.head.next;
        }

        return lista.head.value;
    }
}
