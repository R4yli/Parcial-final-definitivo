public class Principal {
    public static void main(String[] args) {
        LibroFisico libroFisico = new LibroFisico("El Señor de los Anillos", "J.R.R. Tolkien", 1954, 1170);
        LibroElectronico libroElectronico = new LibroElectronico("Inteligencia Artificial", "Stuart Russell", 1995, "PDF");

        Biblioteca biblioteca = new Biblioteca();

        biblioteca.agregarLibro(libroFisico);
        biblioteca.agregarLibro(libroElectronico);

        biblioteca.imprimirInformacionBiblioteca();
    }
}