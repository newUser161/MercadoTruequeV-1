import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MercadoTrueque {


    public static void main(String[] args) {
        // Se crean las instancias de las clases Usuario y Aviso
        Usuario[] arrayUsuarios = new Usuario[100];
        Aviso[] arrayAviso = new Aviso[100];

        try {
            // Parametros de usuario //
            String nombre;
            String clave;
            String correo;
            String telefono;

            // Parametros de aviso //
            String titulo;
            String descripcion;
            String precio;
            String creador;


            // variables locales //
            int i;

            /*
            *   Lectura de datos
            * */
            File lectorArchivos = new File("usuarios.txt");
            Scanner scanner = new Scanner(lectorArchivos);
            scanner.useDelimiter(";");
            i = 0;

            while (scanner.hasNext()) {

                nombre = scanner.next();
                clave = scanner.next();
                correo = scanner.next();
                telefono = scanner.next();
                arrayUsuarios[i] = new Usuario (nombre,clave,correo,telefono);
                scanner.nextLine();
                i++;
            }

            //*************** Lectura de los avisos **************//
            lectorArchivos = new File("avisos.txt");
            scanner = new Scanner(lectorArchivos);
            scanner.useDelimiter(";");
            i = 0;

            while (scanner.hasNext()) {

                creador = scanner.next();
                titulo = scanner.next();
                precio = scanner.next();
                descripcion = scanner.next();
                arrayAviso[i] = new Aviso(creador,titulo,descripcion,precio);
                scanner.nextLine();
                i++;
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error :(");
        }


        /*
        *   Mostrando datos
        * */

        System.out.println("\n// Mostrando Usuarios //");
        int i = 0;
        while (arrayUsuarios[i] != null)
        {
            System.out.println(arrayUsuarios[i].getNombre() +" "+ arrayUsuarios[i].getPassword() +" "+ arrayUsuarios[i].getCorreo() +" "+ arrayUsuarios[i].getTelefono());
            i++;
        }

        System.out.println("\n// Mostrando Avisos //");
        i = 0;
        while (arrayAviso[i] != null)
        {
            System.out.println(arrayAviso[i].getCreador() +" "+ arrayAviso[i].getTitulo() +" "+ arrayAviso[i].getPrecio() +" "+ arrayAviso[i].getDescripcion());
            i++;

        }
    }
}
