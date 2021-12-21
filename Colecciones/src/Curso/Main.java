package Curso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in).useDelimiter("\n");

        ArrayList<Estudiante> estudiantes = new ArrayList(); // Creamos una lista de tipo Estudiante 

        String respuesta = "";

        do {

            Estudiante e1 = new Estudiante(); // Creamos un objeto en cada vuelta para meterlo a nuestra lista

            System.out.println("Ingrese el documento del estudiante"); // Pedimos los datos del objeto
            int documento = scan.nextInt();

            System.out.println("Ingrese el nombre del estudiante");
            String nombre = scan.next();

            System.out.println("Ingrese la nota 1");
            int nota1 = scan.nextInt();

            System.out.println("Ingrese la nota 2");
            int nota2 = scan.nextInt();

            e1.setDocumento(documento); // Seteamos el documento
            e1.setNombre(nombre); // Seteamos el nombre
            e1.setNota1(nota1);
            e1.setNota2(nota2);

            estudiantes.add(e1); // Agregamos el objeto llenado a la lista

            System.out.println("Quiere ingresar otro alumno ?"); // Y preguntamos si quiere ingresar otro alumno 
            respuesta = scan.next();

        } while (respuesta.equalsIgnoreCase("si"));

        for (Estudiante estudiante : estudiantes) { // Aca los mostramos en un for each

            System.out.println(estudiante);

        }
        
   

        estudiantes.sort(Estudiante.compararDocumentosAscendente); // Los ordenamos por el documento mediante un comparator

        for (Estudiante estudiante : estudiantes) { // Aca los mostramos ordenados en un for each 

            System.out.println(estudiante);

        }

        // Calcular la nota de final de un estudiante 
        
        // Preguntamos el alumno que queremos saber su nota final
        System.out.println("Que estudiante quiere calcular su nota final? "); 
        String nombreAlumno = scan.next();
        
        for (Estudiante estudiante : estudiantes) { // Recorremos la lista

            // Validamos si está el alumno que queremos calcular la nota final
            if (estudiante.getNombre().equalsIgnoreCase(nombreAlumno)) { 

                // Usamos el objeto estudiante creado en el for each para llamar el metodo para calcular la nota final
                System.out.println("La nota final de "
                        + nombreAlumno + " es " + estudiante.notaFinal()); 
            }

        }

        Iterator<Estudiante> it = estudiantes.iterator();

        boolean eliminado = false; // Usamos el booleano para mostrar si el alumno se elimino o no

        System.out.println("Que estudiante quiere eliminar ? ");
        String nombre = scan.next();

        while (it.hasNext()) {

            if (it.next().getNombre().equalsIgnoreCase(nombre)) {
                it.remove();
                eliminado = true; // Cuando se elimina pasamos el booleano a true
            }

        }

        if (eliminado) {

            for (Estudiante estudiante : estudiantes) { // Aca los mostramos en un for each

                System.out.println(estudiante);

            }

        } else {

            System.out.println("El alumno a eliminar no se encuentra en la nomina");

        }

    }

}
