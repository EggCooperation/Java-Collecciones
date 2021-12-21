
package principal;

import java.util.Scanner;
import servicios.PersonaServicioHashMap;


public class ClaseMainHashMap {

 
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       
        PersonaServicioHashMap nuevaEjecucion = new PersonaServicioHashMap(); // Llamo a mi clase SERVICIO para acceder a los metodos correspondientes

        System.out.println("Cuantas personas va a cargar???");
        byte cantidad = leer.nextByte(); // Para que me diga el usuario cuantas quiere crear
        
        for (int i = 0; i < cantidad; i++) {
            nuevaEjecucion.cargarPersonas(); // Invoco al metodo para cargar una persona, utilizo un FOR para crear las q quiera el Sr
        }
      
        nuevaEjecucion.imprimirTodos(); // Invoco al metodo de imprimir 
        System.out.println("Ingrese el DNI de la que persona desea eliminar de la lista");
        Integer varElegido = leer.nextInt(); 
        
        nuevaEjecucion.buscarElimar(varElegido);//LLAMO AL METODO y envio a quien quiero eliminar. "OJO CON ELIMINARME A MI JAJAJ"
        nuevaEjecucion.imprimirTodos(); // Invoco al metodo de imprimir , para ver que se fue.....

    }
    
}
