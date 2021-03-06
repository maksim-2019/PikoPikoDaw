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
    private ArrayList<Jugador> lista; // Guardaremos el nombre de los jugadores en una lista
    private int turno; // Indicaremos el turno de los jugadores

    //Constructor parametrizado con la lista
    public TurnoJugadores(ArrayList<Jugador> lista) {
        this.lista = lista;
        // Empieza el turno de fomra random
        Random alt = new Random();
        // Le indicamos a turno que se inicie de forma aleatoria con el tamaño de la lista
        this.turno = alt.nextInt(lista.size());
    }

    // getTurnoJugador : para saber quien le toca
    public int getTurnoJugador() {
        return this.turno;
    }
    
    // getJugadorTurno: para saber a que jugador le toca
    public Jugador getJugadorT() {
        return this.lista.get(turno);
    }
 
    // getTodosTurno: para saber cual es el turno en el que 
    // le toca a cada jugador
//    public ArrayList<Jugador> getTodosTurno() {
//        int numero = getTurnoJugador();
//        ArrayList<Jugador> lista2 = new ArrayList<>();
//        
//        System.out.println("ORDEN DE LOS JUGADORES: ");
//        for (int i = 0; i < lista.size(); i++) {
//            if (numero >= lista.size()) {
//                numero = 0;
//                lista2.add(lista.get(numero));
//                numero++;
//            }else {
//                lista2.add(lista.get(numero));            
//                numero++;
//            } 
//        }
//                    System.out.println(lista2);
//        return lista2;
//    }

    // Método pasarSiguiente: que indica a que jugador le toca
    public int pasarSiguiente() {
        return this.turno = (this.turno == lista.size()-1)? 0: (turno+1);
    }
    
    //toString para probar que todo funcione
    @Override
    public String toString() {
        return "TurnoJugadores{" + "jugador=" + lista + ", turno=" + turno + '}';
    }
//    MAIN PARA PORBAR LA CLASE
//    public static void main(String[] args) {
//        ArrayList<Jugador> j = new ArrayList<>();
//        j.add(new Jugador("Jose"));
//        j.add(new Jugador("Aida"));
//        j.add(new Jugador("Maksin"));
//        j.add(new Jugador("Alex"));
//        
//        System.out.println("---------------------");
//
//        TurnoJugadores n = new TurnoJugadores(j);
//        System.out.println(n.getTurnoJugador());
//        n.pasarSiguiente();
//        n.getJugadorTurno().tirarDados();
//        System.out.println(n.getTurnoJugador());
//        n.pasarSiguiente();
//        n.getJugadorTurno().tirarDados();
//        
//        System.out.println(n.getTurnoJugador());
//        n.pasarSiguiente();
//        System.out.println(n.getTurnoJugador());
//        n.pasarSiguiente();
//        System.out.println(n.getTurnoJugador());
//        n.pasarSiguiente();
//        System.out.println(n.getTurnoJugador());
//        n.pasarSiguiente();
//        System.out.println(n.getTurnoJugador());
//    }

}
