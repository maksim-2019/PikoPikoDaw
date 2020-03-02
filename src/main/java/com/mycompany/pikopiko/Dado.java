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

    private CaraDado numCara;
    private CaraDado[] arrayDado;
    private boolean disponible;
    private int caraSeleccionada;

    private Random r = new Random();

    public Dado() {
        this.arrayDado = new CaraDado[]{numCara.CARA1, numCara.CARA2, numCara.CARA3, numCara.CARA4, numCara.CARA5, numCara.CARA6};
        this.disponible = disponible;
    }

    /* Este metodo saca un enum aleatoriamente de entre los especificados
       en los atributos
     */
    public int mostrarDado() {

        return caraSeleccionada = r.nextInt(6);
//        System.out.println(arrayDado[resultado]);
//        return arrayDado[caraSeleccionada];
    }

    public int valorTirada() {
        return arrayDado[caraSeleccionada].getValor();
    }

    public ImageIcon imagenDado() {
        return arrayDado[caraSeleccionada].getImagen();
    }

////    public void comprobardado() {
//        int resultado;
//        if (this.disponible == false) {
//            JOptionPane.showMessageDialog(null, "Este dado esta deshabilitado");
//        } else {
//            resultado = r.nextInt(5);
//        }
//    }
    public CaraDado getNumCara() {
        return numCara;
    }

    public CaraDado[] getArrayDado() {
        return arrayDado;
    }

//    public void setArrayDado(CaraDado[] arrayDado) {
//        this.arrayDado = arrayDado;
//    }
    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Dado{" + "numCara=" + numCara + ", arrayDado=" + arrayDado + ", disponible=" + disponible + ", r=" + r + '}';
    }

    public static void main(String[] args) {
        Dado d = new Dado();
        System.out.println(d.mostrarDado());
    }

}
