package lamdasandstreams.lambdas.ejercicio02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import lamdasandstreams.lambdas.ejercicio01.Persona;

/**
 *
 * @author Irvn Cruz
 */
public class Ejercicio02 {

    //Ejercicio sobre Comparator
    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();

        personas.add(new Persona("Irvin", "Cruz Gonzalez", 22));
        personas.add(new Persona("Daniel", "Baltazar Martinez", 23));
        personas.add(new Persona("Juan", "Hernadez Gonzalez", 41));
        personas.add(new Persona("Ricardo", "Dominguez Hernandez", 12));
        personas.add(new Persona("Alejandro", "Gonzalez  Gonzalez", 32));

        //personas.sort(new ComparadorPersonaByNombre());
        personas.sort(new ComparadorPersonaByApellidos());
        
        
        //Order por clase anonima == NO HACERLO MUCHO CODIGO
        personas.sort(new Comparator<Persona>() {
            @Override
            public int compare(Persona o1, Persona o2) {
               return o1.getEdad().compareTo(o2.getEdad());
            }
        });
        
        
        
        personas.forEach(System.out::println);

    }
}
