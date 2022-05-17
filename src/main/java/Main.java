import conection.Conxion;
import services.MensajeService;

import java.sql.Connection;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        if (Conxion.getConnection() == null) new Conxion();

        System.out.println(Conxion.getConnection());

        Scanner scanner = new Scanner(System.in);

        int opcion = 0 ;

        do {

            System.out.println("----------------------");
            System.out.println("Aplicacion de mensajes");
            System.out.println("1. Crear un mensaje");
            System.out.println("2. Listar un mensaje");
            System.out.println("3. Editar un mensaje");
            System.out.println("4. Eliminar un mensaje");
            System.out.println("5. Salir");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    MensajeService.crearMensaje();
                    break;
                case 2:
                    MensajeService.listarMensaje();
                    break;
                case 3:
                    MensajeService.editarMensaje();
                    break;
                case 4:
                    MensajeService.borrarMensaje();
                    break;
                default:
                    System.out.println("Nos vemos!");
            }


        } while ( opcion != 5 );


    }
}
