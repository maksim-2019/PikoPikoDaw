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
        text.setText("¡Bienvenido al Piko Piko!");
    }
    
    public void dadoBloqueado(JTextArea text){
        text.setText("¡Ese dado está bloqueado!");
    }
    
    public void turnoJugador(JTextArea text, TurnoJugadores jugador){
        text.setText("Le jugar a " + jugador.getJugadorT());
    }
    
    public void mostrarDado(JTextArea text, TurnoJugadores jugador){
        for (int i = 0; i < jugador.getJugadorT().getArrayDado().length; i++) {
            text.setText("Dado "+(i+1)+": "+ jugador.getJugadorT().getArrayDado()[i].valorTirada());
        }
    }
    
    public void resultadoDado(JTextArea text, TurnoJugadores jugador){
        int suma = 0;
        for (int i = 0; i < jugador.getJugadorT().getArrayDado().length; i++){
            suma += jugador.getJugadorT().getArrayDado()[i].valorTirada();
        }
        text.setText("Tu puntuación total es: " + suma);
    }
}
