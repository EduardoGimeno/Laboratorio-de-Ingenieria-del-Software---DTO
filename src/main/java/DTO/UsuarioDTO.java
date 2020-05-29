/*
 * UsuarioDTO.java 1.0 29/05/2020
 */

/**
 * Esta clase reprensenta el DTO de Usuario
 *
 * @author Gonzalo Berné
 * @version 1.0, 29/05/2020
 */

package DTO;

import java.io.Serializable;

public class UsuarioDTO implements Serializable {

    private String nombre;

    private String apellidos;

    private String email;

    private int NIA;

    private int telefono;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNIA() {
        return NIA;
    }

    public void setNIA(int NIA) {
        this.NIA = NIA;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
