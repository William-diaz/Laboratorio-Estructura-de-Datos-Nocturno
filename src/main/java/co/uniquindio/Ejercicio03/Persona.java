package co.uniquindio.Ejercicio3;

// Se crea la clase persona
public class Persona {

    //Atributos de la clase
    private String nombre;
    private int edad;
    private String sexo;

    public Persona(String nombre, int edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    @Override
    public String toString() {
        return "Persona: " +
                "nombre: " + nombre +
                ", edad: " + edad +
                ", sexo: " + sexo;
    }
}
