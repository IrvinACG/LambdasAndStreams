package lamdasandstreams.lambdas.ejercicio02;

import java.util.Comparator;
import lamdasandstreams.lambdas.ejercicio01.Persona;

/**
 *
 * @author Irvn Cruz
 */
public class ComparadorPersonaByApellidos implements Comparator<Persona>{

    @Override
    public int compare(Persona o1, Persona o2) {
       return o1.getApellidos().compareTo(o2.getApellidos());
    }
    
}
