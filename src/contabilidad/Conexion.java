package contabilidad;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Eduardo Carbajal
 */
public class Conexion {
    
     private Connection conexion = null;
    private Statement sentenciaSQL = null;

    public void Conectar() {
        try {
            String controlador = "com.mysql.jdbc.Driver";
            final String server = "192.168.1.100";
            final String dbName = "ferhog";
            final String user = "consultas";
            final String password = "consultas";
            Class.forName(controlador).newInstance();
            conexion = DriverManager.getConnection("jdbc:mysql://" + server +"/"+ dbName+"?useUnicode=true&characterEncoding=utf-8" , user , password);
            sentenciaSQL = getConexion().createStatement();
            //JOptionPane.showMessageDialog(null, "Conexion correcta");
        } catch (ClassNotFoundException e) {
            System.out.println("No se pudo cargar el controlador: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Excepcion SQL: " + e.getMessage());
        } catch (InstantiationException e) {
            System.out.println("Objeto no creado. " + e.getMessage());
        } catch (IllegalAccessException e) {
            System.out.println("Acceso ilegal. " + e.getMessage());
        }
    }//Fin conectar

    public void cerrar() {
        try {
            if (getSentenciaSQL() != null) {
                getSentenciaSQL().close();
            }
            if (getConexion() != null) {
                getConexion().close();
            }
        } catch (SQLException ignorada) {
        }
    }//fin cerrar

    public Connection getConexion() {
        return conexion;
    }//fin getConexion

    public Statement getSentenciaSQL() {
        return sentenciaSQL;
    }//fin getSentenciaSQL 
   
    
}
