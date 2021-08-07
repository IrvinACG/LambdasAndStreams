package lamdasandstreams.lambdas.ejercicio04;

import lamdasandstreams.lambdas.ejercicio01.Persona;

/**
 *
 * @author Irvn Cruz
 */
public class FiltroPersonas implements FiltroPersona{

    private String nombre;
    
    @Override
    public boolean test(Persona persona) {
       if(persona.getNombre().equals(this.nombre))
           return true;
       else
           return false;
    }

    public FiltroPersonas(String nombre) {
        this.nombre = nombre;
    }
    
    
}
