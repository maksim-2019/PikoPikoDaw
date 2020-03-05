/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pikopiko;

import java.util.ArrayList;

/**
 *
 * @author alex
 */
public class PilaRacion {

    // Declaración del array y del tope de la pila
    ArrayList<Racion> arrayRacion = new ArrayList<>();
    private int tope;

    public PilaRacion(int tope) {
        this.arrayRacion = new ArrayList<>();
        this.tope = 16; // Hay 16 fichas en total
    }

    // Inserta una ración a la pila del jugador
    public void push(Racion racion1) {
        if (arrayRacion.size() <= (this.tope - 1)) {
            this.arrayRacion.add(racion1);
        } else {
            System.out.println("esta llena");
        }
    }

    // Saca una ración de la pila
    public Racion pop() {
        if (!estaVacia()) {
            return this.arrayRacion.remove(arrayRacion.size() - 1);
        }
        return null;
    }

    // Devuelve un booleano que indica si hay Raciones o no
    public boolean estaVacia() {
        return this.arrayRacion.isEmpty();
    }

    // Muestra cuantas Raciones tiene el jugador independientemente de la puntuacion
    public int cantidadRaciones() {
        return arrayRacion.size();
    }

    // Muestra las Raciones que tiene el jugador
    public void mostrarPilaRacion() {
        for (Racion aux : this.arrayRacion) {
            System.out.print(aux + " - ");
        }
    }

}
