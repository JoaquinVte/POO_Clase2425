package es.ieslavereda.ejercicios.e11;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {



        Jugador j1 = new Jugador("Manolo");
        Jugador j2 = new Jugador("Juan");

        Game game = new Game(j1,j2);
        game.start();


    }
}
