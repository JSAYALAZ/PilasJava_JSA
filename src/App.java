import Materia.Colas.Cola;
import Materia.Colas.ColaGenerica;
import Materia.Model.Pantalla;
import Materia.Pilas.Pila;
import Materia.Pilas.PilaGenerica;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Pila pila = new Pila();
        pila.push(1);
        pila.push(43);
        pila.push(23);
        pila.push(14);
        pila.push(12);
        pila.push(71);
        pila.push(85);
        pila.push(-6);

        System.out.println("Elemento en la cima de la pila "+pila.peek());
        System.out.println("Eliminado el ultimo objeto"+pila.pop());
        System.out.println("Elemento en la cima de la pila "+pila.peek());

        PilaGenerica<Pantalla> pantallas = new PilaGenerica<>();
        pantallas.push(new Pantalla("Home page", "/home"));
        pantallas.push(new Pantalla("Sale page", "/sale"));
        pantallas.push(new Pantalla("Settings page", "/admin/settings"));

        System.out.println("En la cima de la pila "+pantallas.peek().getNombre());
        System.out.println("En la cima de la pila "+pantallas.pop().getNombre());
        System.out.println("En la cima de la pila "+pantallas.peek().getNombre());
        pantallas.push(new Pantalla("Admin page", "/admin"));
        System.out.println("En la cima de la pila "+pantallas.peek().getNombre());


        Cola colaInt = new Cola();
        colaInt.addNode(5);
        colaInt.addNode(2);
        colaInt.addNode(1);
        colaInt.addNode(54);
        colaInt.addNode(3);
        colaInt.addNode(8);
        colaInt.addNode(347);
        System.out.println("Elemento al inicio de la colaInt "+colaInt.peek());
        System.out.println("Eliminado el primer objeto"+colaInt.remove());
        System.out.println("Elemento al inicio de la colaInt "+colaInt.peek());

        ColaGenerica<String> colaString = new ColaGenerica<>();
        colaString.addNode("hola");
        colaString.addNode("hola2");
        colaString.addNode("hola3");
        colaString.addNode("hola4");
        System.out.println("Tamaño de la cola  "+colaString.getSize());
        System.out.println("Elemento al inicio de la colaInt "+colaString.peek());
        System.out.println("Eliminado el primer objeto"+colaString.remove());
        System.out.println("Elemento al inicio de la colaInt "+colaString.peek());
        System.out.println("Tamaño de la cola  "+colaString.getSize());
        ColaGenerica<Double> colaDouble = new ColaGenerica<>();
        System.out.println("");
        colaDouble.addNode(1.5);
        colaDouble.addNode(43.0);
        colaDouble.addNode(5.42);
        colaDouble.addNode(5.0);
        System.out.println("Tamaño de la cola  "+colaDouble.getSize());
        System.out.println("Elemento al inicio de la colaInt "+colaDouble.peek());
        System.out.println("Eliminado el primer objeto"+colaDouble.remove());
        System.out.println("Elemento al inicio de la colaInt "+colaDouble.peek());
        System.out.println("Tamaño de la cola  "+colaDouble.getSize());
    }
}
