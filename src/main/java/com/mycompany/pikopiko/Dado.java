/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pikopiko;

/**
 *
 * @author alex
 */
public class Dado {
    private CaraDado numCara;
    private CaraDado[] arrayDado = {
    numCara.CARA1, numCara.CARA2, numCara.CARA3, 
    numCara.CARA4, numCara.CARA5, numCara.CARA6
    };
    private boolean disponible;
    
    public Dado() {
        this.arrayDado = arrayDado;
        this.disponible = disponible;
    }

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
    
    

  
    
}
