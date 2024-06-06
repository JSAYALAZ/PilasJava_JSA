package Ejercicio_02_sorting;

import Materia.Pilas.Pila;

public class Ejercicio_02_sorting {

    public Ejercicio_02_sorting(){

    }
    public void sortStack(Pila pila) {
        Pila aux = new Pila();

        while (!pila.isEmpty()) {
            int temp = pila.pop();
            
            while (!aux.isEmpty() && aux.peek() > temp) {
                pila.push(aux.pop());
            }
            aux.push(temp);
        }
        while (!aux.isEmpty()) {
            pila.push(aux.pop());
        }
        for (int i = 0; i < pila.size(); i++) {
            System.out.println(pila.pop());
        }
    }
}
