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


    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Transacion{" +
                "libro=" + libro +
                ", usuario=" + usuario +
                ", fecha=" + fecha +
                '}';
    }
}
