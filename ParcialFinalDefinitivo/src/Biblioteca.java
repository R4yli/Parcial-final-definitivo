import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> libros;

    public Biblioteca() {
        libros = new ArrayList<>();
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void imprimirInformacionBiblioteca() {
        System.out.println("Libros en la Biblioteca:");
        System.out.println("-----------------------------");
        for (Libro libro : libros) {
            libro.imprimirInformacion();
            System.out.println("-----------------------------");
        }
    }
}