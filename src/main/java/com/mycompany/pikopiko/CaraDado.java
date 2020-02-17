/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pikopiko;

import javax.swing.ImageIcon;

/**
 *
 * @author aida
 */
public enum CaraDado {
     // Valores
    CARA1 (1, new ImageIcon("res/cara1.png"), 1),
    CARA2 (2, new ImageIcon("res/cara2.png"), 2),
    CARA3 (3, new ImageIcon("res/cara3.png"), 3),
    CARA4 (4, new ImageIcon("res/cara4.png"), 4),
    CARA5 (5, new ImageIcon("res/cara5.png"), 5),
    CARA6 (6, new ImageIcon("res/cara6.png"), 5);
    
    // Atributos
    private int numCara; // el número de la cara
    private ImageIcon imagen;// la imagen del dado
    private int valor; // el valor que tiene cada cara del dado

    // Constructor
    private CaraDado(int numCara, ImageIcon imagen, int valor) {
        this.numCara = numCara;
        this.imagen = imagen;
        this.valor = valor;
    }

    // Getter
    public int getNumCara() {
        return numCara;
    }

    public ImageIcon getImagen() {
        return imagen;
    }

    public int getValor() {
        return valor;
    }
}
