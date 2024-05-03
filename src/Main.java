import javax.swing.*;
import java.util.List;
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
                    Libro libro=ingresarLibro();
                    libro.setIdLibro(libreria.getNewIdLibro());
                    libreria.libros.add(libro);
                default:
                    opcion = JOptionPane.showInputDialog(retornarMensaje());

            }
            opcion = JOptionPane.showInputDialog(retornarMensaje());

        } while ( !opcion.equals("9"));

    }

    private static Libro ingresarLibro() {
        String titulo = JOptionPane.showInputDialog("ingrese el titulo del libro");
        String autor = JOptionPane.showInputDialog("ingrese el autor del libro");
        String anio = JOptionPane.showInputDialog("ingrese el año en que se hizo");
        Libro libro=new Libro(titulo,autor,anio);
        return libro;



    }

    private static Usuario ingresarUsuario() {
        String nombre = JOptionPane.showInputDialog("ingrese el nombre del usuario");
        String direccion = JOptionPane.showInputDialog("ingrese la direccion del usuario");
        String telefono = JOptionPane.showInputDialog("ingrese el telefono del usuario");
        long telefonoNew = 0L;
        try {
            telefonoNew = Long.parseLong(telefono);
            Usuario usuario = new Usuario(nombre, direccion, telefonoNew);
            return usuario;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "el telefono no es correcto");
        }
        return null;

    }
    private static void mostrarLista(List<?> lista){
        for (Object objects: lista) {
            JOptionPane.showMessageDialog(null,objects);
        }
    }

    private static String retornarMensaje() {
        return "Hola ingrese una opcion\n" +
                "1. Ingresar usuario\n" +
                "2. lista de usuarios\n" +
                "3. Ingrese libro\n" +
                "4. lista de libros prestados\n" +
                "5. lista de libros en tienda \n" +
                "6. lista de usuarios con libros prestados\n" +
                "7. prestamo vencidos \n" +
                "8. usuarios con mas de un libro\n" +
                "9. Salir\n";

    }


}

