package co.uniquindio.Ejercicio3;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        // Crear estudiantes
        Estudiante estudiante1 = new Estudiante("Sarai", 23, "Mujer", "1234");
        Estudiante estudiante2 = new Estudiante("Carlos", 34, "Hombre", "1235");
        Estudiante estudiante3 = new Estudiante("Maria", 19, "Mujer", "1236");

        // Esto crea un mapa para relacionar la matrícula con el estudiante
        HashMap<String, Estudiante> mapaEstudiantes = new HashMap<>();

        mapaEstudiantes.put(estudiante1.getMatricula(), estudiante1);
        mapaEstudiantes.put(estudiante2.getMatricula(), estudiante2);
        mapaEstudiantes.put(estudiante3.getMatricula(), estudiante3);

        // Mostrar todos los estudiantes en el mapa
        for (String matricula : mapaEstudiantes.keySet()) {
            System.out.println("Matrícula: " + matricula +" --> "+ mapaEstudiantes.get(matricula));
        }

        // Buscar un estudiante por su matrícula
        String matriculaBuscada = "1236";
        Estudiante estudianteBuscado = mapaEstudiantes.get(matriculaBuscada);

        if (estudianteBuscado != null) {
            System.out.println("\nEl estudiante ha sido encontrado --> " + estudianteBuscado);
        } else {
            System.out.println("\nEl estudiante no ha sido encontrado.");
        }
    }
}

