package Mapas;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Tree {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        TreeMap<Integer, String> estudiantes = new TreeMap();

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

            System.out.println("documento=" + entry.getKey() + ", nombre=" + entry.getValue());

        }

//        for (Integer dni : estudiantes.keySet()) {
//            System.out.println("Documento = " + dni);
//        }
//
//        for (String nombres : estudiantes.values()) {
//            System.out.println("Nombre: " + nombres);
//        }
        estudiantes.replace(documento, "Martin", "Lucas");

        for (Map.Entry<Integer, String> entry : estudiantes.entrySet()) {

            System.out.println("documento=" + entry.getKey() + ", nombre=" + entry.getValue());

        }

    }

}
