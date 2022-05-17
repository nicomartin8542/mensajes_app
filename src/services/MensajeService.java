package services;

import DAO.MensajeDAO;
import DTO.Mensajes;
import conection.Conxion;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class MensajeService {

    public  static  void  crearMensaje() {

        String mensaje = "";
        String autor = "";
        Mensajes mensajes = new Mensajes();
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Debe ingresar un mensaje y un autor...");

           if (mensaje.trim().equals("")) {
               //Pido mensaje
               System.out.println("Ingrese su mensaje: ");
               mensaje = sc.nextLine();
           }

           if (autor.trim().equals("")) {
               //Pido autor
               System.out.println("Ingrese el autor: ");
               autor = sc.nextLine();
           }

        } while (mensaje.trim().equals("") || autor.trim().equals("") );

        //Agrego a objeto instanciado de clase Mensajes
        mensajes.setMensaje(mensaje);
        mensajes.setAutorMensaje(autor);

        //Paso a el controlador DAO para crear el mensaje en la DB
        MensajeDAO.crearMensajeDB(mensajes);
    }


    public  static  void  listarMensaje() {

        System.out.println("Listo un mensaje");

    }
     public  static  void  borrarMensaje() {
         System.out.println("borro un mensaje");
    }

    public  static  void  editarMensaje() {
        System.out.println("edito un mensaje");
    }

}
