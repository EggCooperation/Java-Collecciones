package Sets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Sets {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        HashSet<Integer> hashEnteros = new HashSet();

        int num;
        String respuesta = "";
        
        do {
            System.out.println("Ingrese un numero");
            num = leer.nextInt();

            hashEnteros.add(num);

            System.out.println("Quiere ingresar otro numero ?");
            respuesta = leer.next();

        } while (respuesta.equalsIgnoreCase("si"));
        

        System.out.println("===================================");
        System.out.println("Recorremos el hash con un for each");

        for (Integer numero : hashEnteros) {

            System.out.println(numero);

        }

        System.out.println("===================================");
        System.out.println("Recorremos la hashSet con un iterator");

        Iterator<Integer> it = hashEnteros.iterator();

        while (it.hasNext()) {

            System.out.println(it.next());

        }

        System.out.println("===================================");
        System.out.println("Usamos el iterator para remover un elemento porque con el for each falla");

        Iterator<Integer> it2 = hashEnteros.iterator();

        while (it2.hasNext()) {

            if (it2.next() == 3) { // Borramos si está el numero 3

                it2.remove();

            }
        }

        System.out.println("===================================");
        System.out.println("Mostramos el hashSet sin el elemento borrado");

        for (Integer numero : hashEnteros) {

            System.out.println(numero);

        }

        System.out.println("===================================");
        System.out.println("La hashSet es de tamaño: " + hashEnteros.size());

        System.out.println("===================================");
        System.out.println("Ordenamos el hashSet");

        ArrayList<Integer> lista = new ArrayList(hashEnteros); // Para ordenar un hashset hay que convertirlo en una lista primero

        Collections.sort(lista);

        System.out.println("===================================");
        System.out.println("Mostramos el hashSet ordenado ascendente");

        for (Integer numero : lista) {

            System.out.println(numero);
        }
        
        System.out.println("===================================");
        System.out.println("Ordenamos el hashSet");

        ArrayList<Integer> lista2 = new ArrayList(hashEnteros); // Para ordenar un hashset hay que convertirlo en una lista primero

        Collections.sort(lista2, Collections.reverseOrder());

        System.out.println("===================================");
        System.out.println("Mostramos el hashSet ordenado descendente");

        for (Integer numero : lista2) {

            System.out.println(numero);
        }

        System.out.println("===================================");
        System.out.println("Averiguamos si el hashSet contiene x elemento");

        if (hashEnteros.contains(3)) {

            System.out.println("Tiene el numero 3");

        } else {

            System.out.println("No lo tiene");
        }

        System.out.println("===================================");
        System.out.println("Averiguamos si el hashSet tiene elementos");

        if (hashEnteros.isEmpty()) {

            System.out.println("El hashSet está vacio");

        } else {

            System.out.println("El hashSet no está vacio");
        }

        System.out.println("===================================");
        System.out.println("Borramos todos los elementos de el hashSet");
        hashEnteros.clear();

    }

}
