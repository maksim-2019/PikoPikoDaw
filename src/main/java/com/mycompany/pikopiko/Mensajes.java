/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pikopiko;

import javax.swing.JTextArea;

/**
 *
 * @author jose
 */
public class Mensajes {
    //Atributos de Mensajes
    private JTextArea texto;

    //Constructor parametrizado
    public Mensajes() {
        this.texto = texto;
    }
    
    //Método hola
    public void hola(JTextArea text){
        texto.setText("¡Bienvenido al Piko Piko!");
    }
    
    public void dadoBloqueado(JTextArea text){
        text.setText("¡Ese dado está bloqueado!");
    }
    
    public void turnoJugador(JTextArea text, Jugador jugador){
        text.setText("Le jugar a " + jugador.getNombre());
    }
    
    public void mostrarDado(JTextArea text){
        text.setText("");
    }
}
