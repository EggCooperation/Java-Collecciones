package servicios;

import entidad.PersonaArrayList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class PersonaServicioArrayList {

    private ArrayList<PersonaArrayList> nuevaLista; // Creo la lista
    private Scanner leer; // Creo el Scanner para utilizar en toda mi clase

    //Esta es una muy buena practica
    public PersonaServicioArrayList() {
        this.nuevaLista = new ArrayList<>(); // Creo el espacio en memoria del LISTA
        this.leer = new Scanner(System.in).useDelimiter("\n");// Cuando se invoca la clase, habilita el flujo de datos
    }

    //Metodo para que el usuario carague los DATOS de forma manual
    public void cargarPersonas() {
        System.out.println("Ingrese el nombre");
        String nombreIngresado = leer.next();
        nombreIngresado = nombreIngresado.toUpperCase();

        System.out.println("Ingrese el apellido");
        String apellidoIngresado = leer.next();
        apellidoIngresado = apellidoIngresado.toUpperCase();

        System.out.println("Ingrese el DNI");
        Integer dniIngresado = leer.nextInt();     
        
        nuevaLista.add(new PersonaArrayList(dniIngresado, nombreIngresado, apellidoIngresado));     
    }

    public void imprimirTodos() {
        // utilizo el FOREACH - ATAJO NETBEANS fore+TAB - Forma rapida de recorrer colecciones      
        for (PersonaArrayList unitariaPersona : nuevaLista) {
            System.out.println(unitariaPersona.toString());      
        }
    }

    public void buscarElimar(String varElegido) {
        // Uso el iterador, porque si uso FOREACH da error
        Iterator<PersonaArrayList> it = nuevaLista.iterator();
        while (it.hasNext()) {
            if (it.next().getApellido().equals(varElegido)) { // Si se cumple la condicion de encontrar "Ese apellido elegido,lo elimina)
                it.remove();
            }
        }
    }
    
    public void ordenarAaZApellido(){
        //Dejo estructura modelo comentada // Para que entiendan que dato reemplazo a cual en este ejemplpo
  //     Collections.sort(NombreLista, 
   //  (ClaseAtributos objeto1, ClaseAtributos objeto2) -> objeto1.getAtriutoPaComparar().compareTo(objeto2.getAtriutoPaComparar()));    
      
   Collections.sort(nuevaLista, 
(PersonaArrayList objeto1, PersonaArrayList objeto2) -> objeto1.getApellido().compareTo(objeto2.getApellido()));    
   
    }
    
}
