import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Libreria {
    public List<Libro> libros;
    public List<Usuario> usuarios;
    public List<Transacion> transaciones;

    public Libreria() {
        this.libros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
        this.transaciones = new ArrayList<>();
    }

    public boolean crearUsuario(Usuario usuario) {
        if (!Objects.isNull(usuario)&& !Objects.isNull(usuario.getNombre())&&!usuario.getNombre().equals("")){
            this.usuarios.add(usuario);
            return true;

        }
        return false;
    }

    public int getNewIdLibro() {
        return libros.size() + 1;
    }
}

