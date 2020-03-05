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


}
