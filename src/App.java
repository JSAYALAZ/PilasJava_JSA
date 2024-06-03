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


    }
}
