package co.uniquindio.Ejercicio7;

// Se crea la clase persona
public class Persona {

    //Atributos
    private String nombre;
    private int edad;

    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método para obtener el nombre de la persona
    public String getNombre() {
        return nombre;
    }

    // Método para obtener la edad de la persona
    public int getEdad() {
        return edad;
    }

    // Método para representar la persona como cadena de texto
    @Override
    public String toString() {
        return "Persona: " + nombre + " | Edad: " + edad;
    }
}
