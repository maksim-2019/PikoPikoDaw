/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pikopiko;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author aida
 */
public class TurnoJugadores {

    // Atributos de clase de TurnoJugadores
    ArrayList<Jugador> lista;
    int turno;

    //Constructor con la lista
    public TurnoJugadores(ArrayList<Jugador> lista) {
        this.lista = lista;
    }

    // getTurnoJugador : para saber quien le toca
    public int getTurnoJugador() {
        // Empieza el turno de la ronda de fomra random
        Random alt = new Random();
        int ronda = alt.nextInt(4);
        return ronda;
    }

    // getTodosTurno: para saber cual es el turno en el que 
    // le toca a cada jugador
    public int getTodosTurno() {
        int numero = getTurnoJugador();
        System.out.println(numero);
        System.out.println("ORDEN DE LOS JUGADORES: ");

        for (int i = 0; i < lista.size(); i++) {

            if (lista.get(numero).equals(lista.size())) {
                System.out.println(lista.get(0));
            } else {
                System.out.println(lista.get(numero++));
            }
        }
        return turno;
    }

    // Método pasarSiguiente
    public void pasarSiguiente() {
        // No es necesario 
        int numero = getTurnoJugador();
        System.out.println(numero);
        if (lista.get(numero).equals(lista.size())) {
            System.out.println(lista.get(0));
        } else {
            System.out.println(lista.get(numero++));
        }

    }

    @Override
    public String toString() {
        return "TurnoJugadores{" + "jugador=" + lista + ", turno=" + turno + '}';
    }

    public static void main(String[] args) {
        ArrayList<Jugador> j = new ArrayList<>();
        j.add(new Jugador("Jose"));
        j.add(new Jugador("Aida"));
        j.add(new Jugador("Maksin"));
        j.add(new Jugador("Alex"));

        System.out.println("---------------------");

        TurnoJugadores n = new TurnoJugadores(j);
        System.out.println(j.toString());
        System.out.println(j.size());

        System.out.println("---------------------");

        System.out.println("Empieza el jugador: " + n.getTurnoJugador());
        System.out.println("El jugador sigueinte será: ");
        n.pasarSiguiente();

        System.out.println("-------------------------");
        n.getTodosTurno();
    }

}
