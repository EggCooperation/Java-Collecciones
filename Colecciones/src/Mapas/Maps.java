package Mapas;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Maps {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        HashMap<Integer, String> estudiantes = new HashMap(); // Primero la llave y despues de los valores

        int documento;
        String nombre;
        String respuesta = "";

        do {
            System.out.println("Ingrese el documento del alumno");
            documento = leer.nextInt();

            System.out.println("Ingrese el nombre del alumno");
            nombre = leer.next();

            estudiantes.put(documento, nombre);

            System.out.println("Quiere ingresar otro alumno ?");
            respuesta = leer.next();

        } while (respuesta.equalsIgnoreCase("si"));
        

        for (Map.Entry<Integer, String> entry : estudiantes.entrySet()) {

            System.out.println("Documento=" + entry.getKey() + ", Nombre=" + entry.getValue());

        }

//        for (Integer dni : estudiantes.keySet()) {
//        
//            System.out.println("Documento = " + dni);
//        }
//
//        for (String nombres : estudiantes.values()) {
//            System.out.println("Nombre: " + nombres);
//        }

//        Iterator<Map.Entry<Integer, String>> iterator = estudiantes.entrySet().iterator();
//
//        System.out.println("Que estudiante quiere eliminar ? ");
//        int dni = leer.nextInt();
//
//        while (iterator.hasNext()) {
//
//            Map.Entry<Integer, String> entry = iterator.next();
//
//            if (entry.getKey() == dni) {
//                iterator.remove();
//            }
//        }

        System.out.println("Que estudiante quiere eliminar ? ");
        int dniABorrar = leer.nextInt();

        estudiantes.remove(dniABorrar);

        for (Map.Entry<Integer, String> entry : estudiantes.entrySet()) {

            System.out.println("Documento=" + entry.getKey() + ", Nombre=" + entry.getValue());

        }

        TreeMap<Integer, String> estudiantesTree = new TreeMap(estudiantes);

        for (Map.Entry<Integer, String> entry : estudiantesTree.entrySet()) {

            System.out.println("Documento=" + entry.getKey() + ", Nombre=" + entry.getValue());

        }

    }

}
