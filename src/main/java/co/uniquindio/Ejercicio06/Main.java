package co.uniquindio.Ejercicio6;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        // Se crea una PriorityQueue para almacenar tareas
        Queue<Tarea> colaDeTareas = new PriorityQueue<>();

        // Se agregam algunas tareas a la cola con diferentes prioridades
        colaDeTareas.add(new Tarea("Ir al supermercado a comprar", 3));
        colaDeTareas.add(new Tarea("Estudiar para el examen de programacion", 1));
        colaDeTareas.add(new Tarea("limpiar mi habitacion", 2));
        colaDeTareas.add(new Tarea("Hacer la tarea", 4));

        // Con este while se imprimen las tareas en orden de prioridad
        while (!colaDeTareas.isEmpty()) {

            // Este extrae la tarea con mayor prioridad
            Tarea tarea = colaDeTareas.poll();

            System.out.println(tarea);
        }
    }
}