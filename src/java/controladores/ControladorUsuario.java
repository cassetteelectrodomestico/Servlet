package controladores;


import conexionBD.Connection;
import modelos.ModeloUsuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Erick
 */
public class ControladorUsuario extends Connection {

    public ControladorUsuario() {

    }

    public boolean registrarUsuario(ModeloUsuario r) {
        try {
            PreparedStatement sql = con.prepareStatement("INSERT INTO usuarios(username, password, nombre,apellido) VALUES (?, ?, ?, ?)");
            sql.setString(1, r.getUsername());
            sql.setString(2, r.getPassword());
            sql.setString(3, r.getNombre());
            sql.setString(4, r.getApellidos());
            if (sql.executeUpdate() == 1) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
             System.out.println(ex.getMessage());
            return false;
        }
    }
    
    public ModeloUsuario login(ModeloUsuario usuario){
        ResultSet resultSet;
        ModeloUsuario result = new ModeloUsuario();
        try {
            PreparedStatement statement = con.prepareCall(
                    "SELECT * FROM usuarios WHERE username= ?  AND password= ?"
            );
            statement.setString(1, usuario.getUsername());
            statement.setString(2, usuario.getPassword());
            resultSet = statement.executeQuery();
            if(resultSet.first()){
                result.setId(resultSet.getInt("id"));
                result.setUsername(resultSet.getString("username"));
                result.setNombre(resultSet.getString("nombre"));
                result.setApellidos(resultSet.getString("apellido"));
                System.out.println(resultSet.getString("nombre"));
                System.out.println(resultSet.getString("username"));
                System.out.println(resultSet.getString("password"));
                System.out.println(resultSet.getString("apellido"));
                return result;
            }else return null;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return result;
        }
    }
    
}
