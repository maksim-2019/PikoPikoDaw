/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pikopiko;

import javax.swing.ImageIcon;

/**
 *
 * @author maksim
 */
public enum Racion {
    RACION1 (21, 1, new ImageIcon("res/fichas/ficha1.png"), false),
    RACION2 (22, 1, new ImageIcon("res/fichas/ficha2.png"), false),
    RACION3 (23, 1, new ImageIcon("res/fichas/ficha3.png"), false),
    RACION4 (24, 1, new ImageIcon("res/fichas/ficha4.png"), false),
    RACION5 (25, 2, new ImageIcon("res/fichas/ficha5.png"), false),
    RACION6 (26, 2, new ImageIcon("res/fichas/ficha6.png"), false),
    RACION7 (27, 2, new ImageIcon("res/fichas/ficha7.png"), false),
    RACION8 (28, 2, new ImageIcon("res/fichas/ficha8.png"), false),
    RACION9 (29, 3, new ImageIcon("res/fichas/ficha9.png"), false),
    RACION10 (30, 3, new ImageIcon("res/fichas/ficha10.png"), false),
    RACION11 (31, 3, new ImageIcon("res/fichas/ficha11.png"), false),
    RACION12 (32, 3, new ImageIcon("res/fichas/ficha12.png"), false),
    RACION13 (33, 4, new ImageIcon("res/fichas/ficha13.png"), false),
    RACION14 (34, 4, new ImageIcon("res/fichas/ficha14.png"), false),
    RACION15 (35, 4, new ImageIcon("res/fichas/ficha15.png"), false),
    RACION16 (36, 4, new ImageIcon("res/fichas/ficha16.png"), false);
    
    private int numRacion;
    private int numGusano;
    private ImageIcon image;
    private boolean disponible;

    private Racion(int numRacion, int numGusano, ImageIcon image, boolean disponible) {
        this.numRacion = numRacion;
        this.numGusano = numGusano;
        this.image = image;
        this.disponible = disponible;
    }
    
    
}
