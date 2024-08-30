package co.uniquindio.Ejercicio3;

//Clase estudiante que hereda de la clase Persona
public class Estudiante extends Persona {

    private String matricula;

    public Estudiante(String nombre, int edad, String sexo, String matricula) {
        super(nombre, edad, sexo);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        return "Estudiante: " +
                "nombre:" + getNombre()  +
                ", edad: " + getEdad() +
                ", sexo: " + getSexo()  +
                ", matricula: " + matricula
                ;
    }
}
