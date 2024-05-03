public class Libro {
    private String titulo;
    private String autor;
    private String anio;
    private boolean isActive;
    private int idLibro;

    public Libro(String titulo, String autor, String anio) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
        this.isActive = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anio='" + anio + '\'' +
                ", isActive=" + isActive +
                ", idLibro=" + idLibro +
                '}';
    }
}
