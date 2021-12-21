
package servicios;

import entidades.PersonaHashMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;


public class PersonaServicioHashMap {
    //Entre <> Primer termino, digo que tipo de dato es la llave, segundo termino tipo de dato que es el OBJETO a guardar
    private HashMap<Integer,PersonaHashMap> nuevoMapa; // Creo EL MAPA
    private Scanner leer; // Creo el Scanner para utilizar en toda mi clase

    //Esta es una muy buena practica
    public PersonaServicioHashMap() {
        this.nuevoMapa = new HashMap<>(); // Creo el espacio en memoria del MAPA
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
        // Te este modo agrego elementos a un mapa. Observar que el primer termino se corresponde a la KEY
        nuevoMapa.put(dniIngresado,new PersonaHashMap(dniIngresado, nombreIngresado, apellidoIngresado));      
    }

    public void imprimirTodos() {
   // entry.getKey trae la llave y entry.getValue trae los valores del mapa, Es decir todos sus atributos
       for (Map.Entry<Integer, PersonaHashMap> entry : nuevoMapa.entrySet()) {
            System.out.println("Documento=" + entry.getKey() + ", Datos de la Persona" + entry.getValue());
        }
   }
    

    public void buscarElimar(Integer varElegido) {
         nuevoMapa.remove(varElegido);    
    }
    
}
