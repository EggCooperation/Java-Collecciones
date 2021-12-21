
package entidad;

import java.util.Objects;


public class PersonaHashSet  {
    //DECLARO LOS ATRIBUTOS
    private Integer dni;
    private String nombre;
    private String apellido;

    //DECLARO LOS CONSTRUCTORES NECESARIOS
    public PersonaHashSet(Integer dni, String nombre, String apellido) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public PersonaHashSet() {
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
        return "Persona{" + "dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + '}';
    }

    //AMBOS METODOS TRABAJAN JUNTOS PARA HACER VALIDACIONES CORRECTAS Y EVITAR DUPLICACIONES.
    //DEBO DECIDIR BAJO QUE CRITERIO HAGO LA COMPARACION. 
    @Override // Lo creo para definir que parametro utiliza para no repetir datos, en este casso DNI
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.dni);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {//Lo creo para definir que parametro utiliza para no repetir datos,en este casso DNI
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PersonaHashSet other = (PersonaHashSet) obj;
        if (!Objects.equals(this.dni, other.dni)) {
            return false;
        }
        return true;
    }

   
    
    
    
    
}
