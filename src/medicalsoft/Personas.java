/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicalsoft;

/**
 *
 * @author estudiante
 */
public class Personas {
    
    private String nombres;
    private String apellidos;
    private String fechaNaci;
    private String identificacion;
    private String genero;
    private String direccion;
    private String email;
    private String telefono;
    private String celular;

    public Personas(String nom, String ape) {
        this.nombres = nom;
        this.apellidos = ape;

    }

    public String getNombres() {
        return nombres.toUpperCase();
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getFechaNaci() {
        return fechaNaci;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String getGenero() {
        return genero;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCelular() {
        return celular;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setFechaNaci(String fechaNaci) {
        this.fechaNaci = fechaNaci;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
}
