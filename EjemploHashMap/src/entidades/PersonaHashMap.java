
package entidades;


public class PersonaHashMap {
    //DECLARO LOS ATRIBUTOS
    private Integer dni;
    private String nombre;
    private String apellido;

    //DECLARO LOS CONSTRUCTORES NECESARIOS
    public PersonaHashMap(Integer dni, String nombre, String apellido) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public PersonaHashMap() {
    }

    //DECLARO GETTER Y SETTER
    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    //DEJO DEFINIDO EL METODO PARA IMPRIMIR LOS OBJETOS
    @Override
    public String toString() {
        return "Persona{" + "DNI=" + dni + ", NOMBRE=" + nombre + ", APELLIDO=" + apellido + '}';
    }

}
