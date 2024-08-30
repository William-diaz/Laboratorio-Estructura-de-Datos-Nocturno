package co.uniquindio.Ejercicio01;

//Se crea la clase persona
public class Persona implements Comparable<Persona> {

    //Se crean susu atributos
    String nombre;
    int edad;
    String genero;

    //Constructor de la clase
    public Persona(String nombre, int edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    // Compara 2 edades de 2 personas, retorna -1 o 0 o +1
    @Override
    public int compareTo(Persona otraPersona) {
        return Integer.compare(this.edad, otraPersona.edad);
    }

    @Override
    public String toString() {
        return nombre + " --- " + edad + " --- " + genero;
    }
}

