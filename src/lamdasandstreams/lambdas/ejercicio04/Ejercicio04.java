package lamdasandstreams.lambdas.ejercicio04;

import java.util.ArrayList;
import java.util.List;
import lamdasandstreams.lambdas.ejercicio01.Persona;

/**
 *
 * @author Irvn Cruz
 */
public class Ejercicio04 {

    //Crear filtro
    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();

        personas.add(new Persona("Irvin", "Cruz Gonzalez", 22));
        personas.add(new Persona("Alejandro", "Baltazar Martinez", 23));
        personas.add(new Persona("Juan", "Hernadez Gonzalez", 41));
        personas.add(new Persona("Ricardo", "Dominguez Hernandez", 12));
        personas.add(new Persona("Alejandro", "Gonzalez  Gonzalez", 32));
        
        //Filtro por forma normal
        //personas = filtroPersonaByNombre(personas, "Alejandro");
        
        personas.forEach(System.out::println);
        
    }
    
    
    //Filtro por forma tradicional
    public static List<Persona> filtroPersonaByNombre (List<Persona> personas, String filtro){
        List<Persona> listaFiltro = new ArrayList<>();
        for(Persona p : personas){
            if(p.getNombre().equals(filtro))
                listaFiltro.add(p);
        }
        return listaFiltro;
    }
}
