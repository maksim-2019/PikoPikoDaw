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
    private String nombre; // nombre del jugador
    private int puntosAcumulados; // puntos del jugador
    private Dado[] arrayDado; // dados que el jugador tiene en juego

    //Constructor
    public Jugador(String nombre) {
        this.nombre = nombre;

        // creacion del array de los dados (8) y un objeto dado
        // por cada posicion del array, asi tenemos un array de dados
        this.arrayDado = new Dado[8];
        for (int i = 0; i < arrayDado.length; i++) {
            arrayDado[i] = new Dado();
        }
    }

    /////Metodos/////
    // le da a cada dado del array un valor si solo si estan disponibles
    public void tirarDados() {
        for (int i = 0; i < arrayDado.length; i++) {
            if (arrayDado[i].isDisponible()) {
                arrayDado[i].mostrarDado();
            }
        }
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

    @Override
    public String toString() {
        return "Jugador = " + nombre;
    }

    // Main para probar la clase
    public static void main(String[] args) {
        Jugador p = new Jugador("e");
        p.tirarDados();

    }
}
