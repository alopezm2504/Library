import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Libreria {
    public List<Libro> libros;
    public List<Usuario> usuarios;
    public List<Transacion> transaciones;
    public List<Libro> librosPrestados;


    public Libreria(List<Libro> librosPrestados) {
        this.librosPrestados = librosPrestados;
    }

    public Libreria() {
        this.libros = llenarLibros();
        this.usuarios = new ArrayList<>();
        this.transaciones = new ArrayList<>();
        this.librosPrestados = new ArrayList<>();
    }

    private List<Libro> llenarLibros() {
        Libro libro1 = new Libro("El lobo estepario", "Hess", "1942");
        libro1.setIdLibro(1);
        Libro libro2 = new Libro("Damian", "Hess", "1942");
        libro2.setIdLibro(2);
        Libro libro3 = new Libro("Conjetura de Fermat", "Fermat", "1942");
        libro3.setIdLibro(3);
        Libro libro4 = new Libro("La iliada", "Homero", "1942");
        libro4.setIdLibro(4);
        return List.of(libro1, libro2, libro3, libro4);
    }

    public boolean crearUsuario(Usuario usuario) {
        if (!Objects.isNull(usuario) && !Objects.isNull(usuario.getNombre()) && !usuario.getNombre().equals("")) {
            this.usuarios.add(usuario);
            return true;

        }
        return false;
    }

    public int getNewIdLibro() {
        return libros.size() + 1;
    }

    public boolean buscarUsuario(String cedNew) {

        for (Usuario usuario : usuarios) {
            if (usuario.getCed().equals(cedNew)) {
                return true;
            }
        }
        return false;
    }

    public void cambiarEstadoLibro(int idLibro) {
        for (int i = 0; i < libros.size(); i++) {
            /*if (libros.get(i).getIdLibro() == idLibro && prestarDevolver.equals("1")) {
                libros.get(i).setActive(false);
            } else if (libros.get(i).getIdLibro() == idLibro && prestarDevolver.equals("2")) {
                libros.get(i).setActive(true);
            }*/
            if (libros.get(i).getIdLibro() == idLibro){
                libros.get(i).setActive(!libros.get(i).isActive());
            }
        }

    }
}



