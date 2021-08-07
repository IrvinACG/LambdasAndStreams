package lamdasandstreams.lambdas.ejercicio03;

import java.util.ArrayList;
import java.util.List;
import lamdasandstreams.lambdas.ejercicio01.Persona;

/**
 *
 * @author Irvn Cruz
 */
public class Ejercicio03 {
    
    //Crear lambda
    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();

        personas.add(new Persona("Irvin", "Cruz Gonzalez", 22));
        personas.add(new Persona("Daniel", "Baltazar Martinez", 23));
        personas.add(new Persona("Juan", "Hernadez Gonzalez", 41));
        personas.add(new Persona("Ricardo", "Dominguez Hernandez", 12));
        personas.add(new Persona("Alejandro", "Gonzalez  Gonzalez", 32));
        
        personas.sort((p1, p2) -> p1.getEdad().compareTo(p2.getEdad()));
        
        personas.forEach(System.out::println);
        
    }
}
