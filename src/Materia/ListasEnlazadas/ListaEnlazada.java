package Materia.ListasEnlazadas;

import Materia.Model.Node;

public class ListaEnlazada {
    public Node head;

    public ListaEnlazada() {

    }

    //Metodo para agg un nodo
    public void addNode(int value) {
        if (head == null) {
            head = new Node(value);
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(value);
    }

    //Metdod para eliminar un nodo
    public void deleteNode(int value) {
        if (head == null)
            return;

        if (head.value == value) {
            head = head.next;
            return;
        }
        //Metodo para poder evaluar y eliminar uno o varios nodos
        Node current = head;
        while (current.next != null) {
            if (current.next.value == value) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }

    }
    public void print (){
        if (head==null) {
            System.out.println("LISTA VACIA");
        }
        Node current = head;
        while (current.next != null) {
            System.out.println(("Node >>>") + current.value);
            current=current.next;
        }
        System.out.println(current.value);
        System.out.println("FN DE LA LISTA");
    }
}
