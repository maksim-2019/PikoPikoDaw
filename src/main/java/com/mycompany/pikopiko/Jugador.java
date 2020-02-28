/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pikopiko;

/**
 *
 * @author jose
 */
public class Jugador {
    
    //Atributos
    private String nombre;
    
    //Constructor
    public Jugador(String nombre) {
        this.nombre = nombre;
    }
    
    //Getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + '}';
    }
    
}
