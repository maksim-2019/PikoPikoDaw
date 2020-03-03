/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pikopiko;

import java.util.Random;
import javax.swing.ImageIcon;

/**
 *
 * @author alex
 */
public class Dado {

    private CaraDado[] arrayDado; // array de las caras del dado
    private boolean disponible; // disponibilidad del dado (en juego o no)
    private int caraSeleccionada; // cara que ha salido al lanzar el dado

    private Random r = new Random();

    // constructor que inicializa un dado con una de las caras del enum y lo pone
    // como disponible
    public Dado() {
        this.arrayDado = new CaraDado[]{
            CaraDado.CARA1, CaraDado.CARA2,
            CaraDado.CARA3, CaraDado.CARA4,
            CaraDado.CARA5, CaraDado.CARA6
        };
        this.disponible = true;
    }

    /////Metodos/////
    // Este metodo saca un enum aleatoriamente de entre los especificados
    // en los atributos
    public int mostrarDado() {
        return caraSeleccionada = r.nextInt(6);
    }

    // dada la cara seleccionada consigue el valor numerico del enum
    public int valorTirada() {
        return arrayDado[caraSeleccionada].getValor();
    }

    // consigue la imagen del dado
    public ImageIcon imagenDado() {
        return arrayDado[caraSeleccionada].getImagen();
    }

    public CaraDado[] getArrayDado() {
        return arrayDado;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Dado{" + ", arrayDado=" + arrayDado + ", disponible=" + disponible + '}';
    }

    // prueba de la clase
    public static void main(String[] args) {
        Dado d = new Dado();
        System.out.println(d.mostrarDado());
    }

}
