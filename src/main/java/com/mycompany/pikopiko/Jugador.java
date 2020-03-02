/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pikopiko;

import java.util.Random;

/**
 *
 * @author jose
 */
public class Jugador {

    //Atributos
    private String nombre;
    private int puntosAcumulados;
    private Dado[] arrayDado;

    private Random r = new Random();

    //Constructor
    public Jugador(String nombre) {
        this.nombre = nombre;
        this.puntosAcumulados = puntosAcumulados;
        this.arrayDado = arrayDado;
    }

    //Metodos
    public void tirarDados() {

        arrayDado[0].mostrarDado();

        
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntosAcumulados() {
        return puntosAcumulados;
    }

//    public void setPuntosAcumulados(int puntosAcumulados) {
//        this.puntosAcumulados = puntosAcumulados;
//    }
    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + '}';
    }
    
    public static void main(String[] args) {
        Jugador p = new Jugador("e");
        p.tirarDados();
        
        for (int i = 0; i < p.arrayDado.length; i++) {
            System.out.println(p.arrayDado[i]);
        }
 
    }
}
