public class LibroElectronico extends Libro {
    private String formato;

    public LibroElectronico(String titulo, String autor, int anoPublicacion, String formato) {
        super(titulo, autor, anoPublicacion);
        this.formato = formato;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    @Override
    public void imprimirInformacion() {
        super.imprimirInformacion();
        System.out.println("Formato: " + formato);
    }
}