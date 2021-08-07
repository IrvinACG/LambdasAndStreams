package lamdasandstreams.lambdas.ejercicio01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Irvn Cruz
 */
public class Ejercicio01 {
    

    
    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();
        
        personas.add(new Persona("Irvin", "Cruz Gonzalez", 22));
        personas.add(new Persona("Daniel", "Baltazar Martinez", 22));
        personas.add(new Persona("Juan", "Hernadez Gonzalez", 22));
        personas.add(new Persona("Ricardo", "Dominguez Hernandez", 22));
        personas.add(new Persona("Alejandro", "Gonzalez  Gonzalez", 22));
        
        Collections.sort(personas);
        
        for(Persona p : personas){
            System.out.println(p.toString());
        }
        
    }
   
    
}
