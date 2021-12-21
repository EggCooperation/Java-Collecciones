package atributocoleccion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        Coleccion c1 = new Coleccion();

        ArrayList<String> libros = new ArrayList();

        libros.add("La Odisea");

        c1.setLibros(libros); // Se guarda la lista        
        
        // Conjuntos 

        HashSet<Integer> numeros = new HashSet();

        numeros.add(10);
        numeros.add(86);
        // Fua el Diego

        c1.setNumeros(numeros); // Se guarda el conjunto
        
        // Mapas

        HashMap<Integer, String> alumnos = new HashMap();

        alumnos.put(40234123, "Nacho");

        c1.setAlumnos(alumnos); // Se guarda el mapa

        for (String libro : c1.getLibros()) {
            System.out.println(libro); // Mostrar el conjunto usando el get
        }

        for (Integer numero : c1.getNumeros()) {
            System.out.println(numero); // Mostrar el conjunto usando el get
        }
        
        c1.recorrerColecciones(); // Mostramos la lista a traves del objeto
        
        
    }

}
