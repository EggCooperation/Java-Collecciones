
package servicios;

import entidad.PersonaHashSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;


public class PersonaServicioHashSet {
    private HashSet<PersonaHashSet> nuevoMapa; // Creo el mapa
    private Scanner leer; // Creo el Scanner para utilizar en toda mi clase
        
    //Esta es una muy buena practica
    public PersonaServicioHashSet() {
       this.nuevoMapa = new HashSet<>(); // Creo el espacio en memoria del LISTAS
       this.leer = new Scanner(System.in).useDelimiter("\n");// Cuando se invoca la clase, habilita el flujo de datos
    }
    
    //Metodo para que el usuario carague los DATOS de forma manual
    public void cargarPersonas(){
        System.out.println("Ingrese el nombre");
        String nombreIngresado = leer.next();
        nombreIngresado = nombreIngresado.toUpperCase();
        
        System.out.println("Ingrese el apellido");
        String apellidoIngresado = leer.next();
        apellidoIngresado = apellidoIngresado.toUpperCase();
        
        System.out.println("Ingrese el DNI");
        Integer dniIngresado = leer.nextInt();
       
        nuevoMapa.add(new PersonaHashSet(dniIngresado,nombreIngresado,apellidoIngresado));   //Si no creo mi HasCode en"PersonaHashSet" no encontrara duplicidad porque su parametro es espacio de mmoria    
    }
    
    public void imprimirTodos(){
        // utilizo el FOREACH - ATAJO NETBEANS fore+TAB - Forma rapida de recorrer colecciones
        for (PersonaHashSet unitariaPersona : nuevoMapa) {
            System.out.println(unitariaPersona.toString());
        }
    }

    
     public void buscarElimar(String varElegido) {
        // Uso el iterador, porque si uso FOREACH da error
        Iterator<PersonaHashSet> it = nuevoMapa.iterator();
        while (it.hasNext()) {
            if (it.next().getApellido().equals(varElegido)) { // Si se cumple la condicion de encontrar "Ese apellido elegido,lo elimina)
                it.remove();
            }
        }
    }
}
