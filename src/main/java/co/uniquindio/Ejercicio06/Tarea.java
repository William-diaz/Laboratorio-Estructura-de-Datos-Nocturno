package co.uniquindio.Ejercicio6;

// Definición de la clase Tarea
public class Tarea implements Comparable<Tarea> {

    private String nombre;
    private int prioridad;

    // Constructor de la clase
    public Tarea(String nombre, int prioridad) {
        this.nombre = nombre;
        this.prioridad = prioridad;
    }

    // metodo util que obtiene el nombre de la tarea
    public String getNombre() {
        return nombre;
    }

    // Este obtiene la prioridad de la tarea
    public int getPrioridad() {
        return prioridad;
    }

    // Se implementa el método compareTo para comparar tareas según su prioridad la cual es un numero
    @Override
    public int compareTo(Tarea tareaDiferente) {
        return Integer.compare(tareaDiferente.getPrioridad(), this.prioridad);
    }

    @Override
    public String toString() {
        return "Tarea: " + nombre + ", Prioridad: " + prioridad;
    }
}

