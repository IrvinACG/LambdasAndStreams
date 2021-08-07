package lamdasandstreams.lambdas.ejercicio01;

/**
 *
 * @author Irvn Cruz
 */
public class Persona implements Comparable<Persona>{
    private String nombre;
    private String apellidos;
    private Integer edad;

    public Persona(String nombre, String apellidos, Integer edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public Persona() {
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + '}';
    }

    @Override
    public int compareTo(Persona otro) {
        return this.getNombre().compareTo(otro.getNombre());
    }
    
}
