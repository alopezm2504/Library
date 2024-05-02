import java.util.Date;

public class Transacion {
    private Libro libro;
    private Usuario usuario;
    private Date fecha;

    public Transacion(Libro libro, Usuario usuario, Date fecha) {
        this.libro = libro;
        this.usuario = usuario;
        this.fecha = fecha;
    }

}
