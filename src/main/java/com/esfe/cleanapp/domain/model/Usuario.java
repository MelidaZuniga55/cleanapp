package com.esfe.cleanapp.domain.model;

public class Usuario {
    private  String nombre;
    private String email;
    private String password;
    private boolean estado;

    public Usuario(String nombre, String email, String password, boolean estado) {
        this.nombre = nombre;
        this.email = email;
        this.password = password;
        this.estado = estado;
    }

    public Usuario(){

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

}
