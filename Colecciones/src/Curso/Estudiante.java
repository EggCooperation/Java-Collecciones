package Curso;

import java.util.Comparator;

public class Estudiante {

    private Integer documento;
    private String nombre;
    private Integer nota1;
    private Integer nota2; 

    public Integer getDocumento() {
        return documento;
    }

    public void setDocumento(Integer documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNota1() {
        return nota1;
    }

    public void setNota1(Integer nota1) {
        this.nota1 = nota1;
    }

    public Integer getNota2() {
        return nota2;
    }

    public void setNota2(Integer nota2) {
        this.nota2 = nota2;
    }
    
    public int notaFinal(){
        int notaFinal;
        notaFinal = (nota1 + nota2) / 2;
        return notaFinal;
    }
    

    public static Comparator<Estudiante> compararDocumentosAscendente = new Comparator<Estudiante>() { // Creamos un objeto comparator 
        @Override // Usamos el override para traer un metodo de otra clase y poder usarlo
        public int compare(Estudiante e1, Estudiante e2) { // Le pasamos dos objetos a comparar
            return e1.getDocumento().compareTo(e2.getDocumento()); // Los comparamos usando el get y el compareTo
        }
    };

    public static Comparator<Estudiante> compararNombresAscendente = new Comparator<Estudiante>() { // Creamos un objeto comparator 
        @Override // Usamos el override para traer un metodo de otra clase y poder usarlo
        public int compare(Estudiante e1, Estudiante e2) { // Le pasamos dos objetos a comparar
            return e1.getNombre().compareTo(e2.getNombre()); // Los comparamos usando el get y el compareTo
        }
    };
    
    @Override
    public String toString() {
        return "Documento: " + documento + ", nombre: " + nombre + ", nota1: " + nota1 + ", nota2: " + nota2 ;
    }

}
