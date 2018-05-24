package modelos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Erick
 */
public class ModeloUsuario {
    
    private int id;
    private String username;
    private String password;
    private String nombre;
    private String apellidos;

    public ModeloUsuario() {
    }

    public ModeloUsuario(String username, String password, int id) {
        this.username = username;
        this.password = password;
        this.id = id;
    }

    
    
    
    public ModeloUsuario(int id, String username, String password, String nombre, String apellidos) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    
    
    
}
