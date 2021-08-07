package lamdasandstreams.lambdas.ejercicio02;

import java.util.Comparator;
import lamdasandstreams.lambdas.ejercicio01.Persona;

/**
 *
 * @author Irvn Cruz
 */
public class ComparadorPersonaByNombre implements Comparator<Persona>{

    @Override
    public int compare(Persona o1, Persona o2) {
       return o1.getNombre().compareTo(o2.getNombre());
    }


}
