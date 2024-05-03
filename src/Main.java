import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String opcion = JOptionPane.showInputDialog(retornarMensaje());
        do{

        }while(opcion);

    }

        private static String retornarMensaje () {
            return "Hola ingrese una opcion\n" +
                    "1. Ingrese Cliente\n" +
                    "2. lista de clientes\n" +
                    "3. Ingrese libro\n" +
                    "4. lista de libros prestados\n" +
                    "5. lista de libros en tienda \n" +
                    "6. lista de visita\n" +
                    "7. Registrar atencion \n" +
                    "8. lista de atencion\n" +
                    "9. Salir\n";

        }



}

