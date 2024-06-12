package Materia.ListasEnlazadas;

import Materia.Model.Node;

public class ListaEnlazada {
    public Node head;
    public Node tail;
    public int size = 0;

    public ListaEnlazada() {
        this.head = null;
        this.tail = null;
    }

    // Método para agregar un nodo al final de la lista
    public void add(int value) {
        Node newNode = new Node(value);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    // Método para eliminar un nodo con el valor especificado
    public void deleteNode(int value) {
        if (head == null) {
            return;
        }

        // Si el nodo a eliminar es el head
        if (head.value == value) {
            head = head.next;
            if (head == null) { // Si la lista se quedó vacía
                tail = null;
            }
            return;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.value == value) {
                current.next = current.next.next;
                size--;
                if (current.next == null) { // Si el nodo eliminado era el tail
                    tail = current;
                }
                return;
            }
            current = current.next;
        }
    }

    // Método para imprimir todos los nodos de la lista
    public void print() {
        if (head == null) {
            System.out.println("LISTA VACIA");
            return;
        }

        Node current = head;
        while (current != null) {
            System.out.println("Node >>> " + current.value);
            current = current.next;
        }
        System.out.println("FIN DE LA LISTA");
    }
}
