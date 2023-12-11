public class LibroFisico extends Libro {
    private int numPaginas;

    public LibroFisico(String titulo, String autor, int anoPublicacion, int numPaginas) {
        super(titulo, autor, anoPublicacion);
        this.numPaginas = numPaginas;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public void imprimirInformacion() {
        super.imprimirInformacion();
        System.out.println("Número de Páginas: " + numPaginas);
    }
}