import javax.swing.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Libreria {
    public List<Libro> libros;
    public List<Usuario> usuarios;
    public List<Transacion> transaciones;
    public List<List<Object>> librosPrestados;




    public Libreria() {
        this.libros = llenarLibros();
        this.usuarios = new ArrayList<>();
        this.transaciones = new ArrayList<>();
        this.librosPrestados = new ArrayList<>();
    }





    public void recorrerLista(){
        for (List<Object> listaInterna: librosPrestados) {
            for (Object objeto: listaInterna) {
                 if(objeto instanceof Libro){
                   boolean prestado=false;

                 } else if (objeto instanceof Usuario) {

                 } else {

                 }


            }
        }
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
        ArrayList arrayList = new ArrayList();
        arrayList.add(libro1);
        arrayList.add(libro2);
        arrayList.add(libro3);
        arrayList.add(libro4);

        return arrayList;
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

    public void cambiarEstadoUsuario(String cedNew) {

        for (Usuario usuario : usuarios) {
            if (usuario.getCed().equals(cedNew)) {
                usuario.prestoLibros = !usuario.prestoLibros;
            }


        }

    }


    public Usuario buscarUsuario(String cedNew) {

        for (Usuario usuario : usuarios) {
            if (usuario.getCed().equals(cedNew)) {
                return usuario;
            }
        }
        return null;
    }

    public void cambiarEstadoLibro(int idLibro) {
        for (int i = 0; i < libros.size(); i++) {
            /*if (libros.get(i).getIdLibro() == idLibro && prestarDevolver.equals("1")) {
                libros.get(i).setActive(false);
            } else if (libros.get(i).getIdLibro() == idLibro && prestarDevolver.equals("2")) {
                libros.get(i).setActive(true);
            }*/
            if (libros.get(i).getIdLibro() == idLibro) {
                libros.get(i).setActive(!libros.get(i).isActive());
            }
        }

    }
}



