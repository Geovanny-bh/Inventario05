package sv.udu.utec;


import sv.udu.utec.datos.ConexionDB;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args){
        probarConexion();
    }

    private static void probarConexion() {
        try (Connection cn = ConexionDB.obtenerConexion()){
            if (cn != null && !cn.isClosed()){
                System.out.println("Conexion Exitosa a:" + cn.getMetaData().getURL());
            }
        }catch (SQLException e){
            System.out.println("Error de Conexion" + e.getMessage());
        }
    }

}



