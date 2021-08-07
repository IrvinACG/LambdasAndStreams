package lamdasandstreams.lambdas.ejercicio04;

import lamdasandstreams.lambdas.ejercicio01.Persona;

/**
 *
 * @author Irvn Cruz
 */

@FunctionalInterface
public interface FiltroPersona {
    
    public boolean test(Persona persona);

}
