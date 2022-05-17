package DAO;

import DTO.Mensajes;
import conection.Conxion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MensajeDAO {


    public  static  void  crearMensajeDB(Mensajes mensaje) {

        //Preparo consulta para impactar en base de datos
        PreparedStatement ps = null;
        String consultaSql = "INSERT INTO mensajes ( mensaje, autor_mensaje)" +
                                           " VALUES (?,?)";

        //Verico si existe una instancia de la DB
        if (Conxion.getConnection() == null) new Conxion();

        try {

            ps = Conxion.getConnection().prepareStatement(consultaSql);
            ps.setString(1, mensaje.getMensaje());
            ps.setString(2, mensaje.getAutorMensaje());
            ps.executeUpdate();

            System.out.println("Se cargo el mensaje correctamente!");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public  static  void  leerMensajesDB() {

    }

    public static  void  borrarMensajesDB() {

    }

    public static  void  editarMensajesDB(Mensajes mensaje) {

    }


}
