package Sets;


import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class SetTree {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        TreeSet<Integer> treeEnteros = new TreeSet();

        int num;
        String respuesta = "";

        do {
            System.out.println("Ingrese un numero");
            num = leer.nextInt();

            treeEnteros.add(num);

            System.out.println("Quiere ingresar otro numero ?");
            respuesta = leer.next();

        } while (respuesta.equalsIgnoreCase("si"));
        
        System.out.println("===================================");
        System.out.println("Mostramos el treeSet con un forEach");

        for (Integer numero : treeEnteros) {

            System.out.println(numero);

        }

        System.out.println("===================================");
        System.out.println("Recorremos la TreeSet con un iterator");

        Iterator<Integer> it = treeEnteros.iterator();

        while (it.hasNext()) {

            System.out.println(it.next());

        }

        System.out.println("===================================");
        System.out.println("Usamos el iterator para remover un elemento porque con el for each falla");

        Iterator<Integer> it2 = treeEnteros.iterator();

        while (it2.hasNext()) {

            if (it2.next().equals(3)) { // Borramos si está el numero 3

                it2.remove();

            }
        }

        System.out.println("===================================");
        System.out.println("Mostramos el TreeSet sin el elemento borrado");

        for (Integer numero : treeEnteros) {

            System.out.println(numero);

        }

        System.out.println("===================================");
        System.out.println("La TreeSet es de tamaño: " + treeEnteros.size());

        System.out.println("===================================");
        System.out.println("Averiguamos si el TreeSet contiene x elemento");

        if (treeEnteros.contains(3)) {

            System.out.println("Tiene el numero 3");

        } else {

            System.out.println("No lo tiene");
        }

        System.out.println("===================================");
        System.out.println("Averiguamos si el TreeSet tiene elementos");

        if (treeEnteros.isEmpty()) {

            System.out.println("El TreeSet está vacio");

        } else {

            System.out.println("El TreeSet no está vacio");
        }

        System.out.println("===================================");
        System.out.println("Borramos todos los elementos de el TreeSet");
        treeEnteros.clear();
        

        
        
        
    }

}
