import javax.swing.*;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        String opcion = JOptionPane.showInputDialog(retornarMensaje());
        Libreria libreria = new Libreria();
        do {
            switch (opcion) {
                case "1":
                    boolean isCreate = libreria.crearUsuario(ingresarUsuario());
                    if (isCreate) {
                        JOptionPane.showMessageDialog(null, "el cliente se creo correctamente");
                    } else {
                        JOptionPane.showMessageDialog(null, "el cliente no se creo correctamente");
                    }
                    break;
                case "2":
                    mostrarLista(libreria.usuarios);
                    break;
                case "3":
                    Libro libro = ingresarLibro();
                    libro.setIdLibro(libreria.getNewIdLibro());
                    libreria.libros.add(libro);
                    JOptionPane.showMessageDialog(null, "el libro se creo correctamente");
                    break;
                case "4":
                    String cedNew = JOptionPane.showInputDialog("Digite la cedula del usuario");
                    boolean idUsuario = libreria.buscarUsuario(cedNew);
                    if (idUsuario) {
                        Libro libroPrestar = retornarMensaje4(libreria.libros);
                        libroPrestar.setActive(false);
                        libreria.librosPrestados.add(libroPrestar);
                        libreria.cambiarIdLibro(libroPrestar.getIdLibro());
                    }

                    mostrarLista(libreria.librosPrestados);
                    break;
                default:
                    opcion = JOptionPane.showInputDialog(retornarMensaje());

            }
            opcion = JOptionPane.showInputDialog(retornarMensaje());

        } while (!opcion.equals("11"));

    }

    private static Libro retornarMensaje4(List<Libro> libros) {
        String opcion4 = JOptionPane.showInputDialog("por favor digite el titulo del libro");
        opcion4 = opcion4.toUpperCase();
        String opcion5 = "";
        for (Libro objet : libros) {
            opcion5 = objet.getAutor().toUpperCase();
            if (opcion5.contains(opcion4)) {

                return objet;

            }


        }
        return null;
    }

    private static Libro ingresarLibro() {
        String titulo = JOptionPane.showInputDialog("ingrese el titulo del libro");
        String autor = JOptionPane.showInputDialog("ingrese el autor del libro");
        String anio = JOptionPane.showInputDialog("ingrese el año en que se hizo");
        Libro libro = new Libro(titulo, autor, anio);
        return libro;


    }

    private static Usuario ingresarUsuario() {
        String nombre = JOptionPane.showInputDialog("ingrese el nombre del usuario");
        String direccion = JOptionPane.showInputDialog("ingrese la direccion del usuario");
        String telefono = JOptionPane.showInputDialog("ingrese el telefono del usuario");
        String ced = JOptionPane.showInputDialog("ingrese la cedula del usuario");
        long telefonoNew = 0L;
        try {
            telefonoNew = Long.parseLong(telefono);
            Usuario usuario = new Usuario(nombre, direccion, telefonoNew, ced);
            return usuario;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "el telefono no es correcto");
        }
        return null;

    }

    private static void mostrarLista(List<?> lista) {
        for (Object objects : lista) {
            JOptionPane.showMessageDialog(null, objects);
        }
    }

    private static String retornarMensaje() {
        return "Hola ingrese una opcion\n" +
                "1. Ingresar usuario\n" +
                "2. lista de usuarios\n" +
                "3. Ingrese libro\n" +
                "4. Prestar libro\n" +
                "5. lista de libros prestados\n" +
                "6. Devolucion de libros prestados\n" +
                "7. lista de libros en tienda \n" +
                "8. lista de usuarios con libros prestados\n" +
                "9. prestamo vencidos \n" +
                "10. usuarios con mas de un libro\n" +
                "11. Salir\n";

    }


}

