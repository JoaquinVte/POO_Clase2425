package es.ieslavereda.ejercicios.ruleta;

public class Main {
    public static void main(String[] args) {

        Jugador j0 = new Jugador("Juan");
        Jugador j1 = new Jugador("Pedro");

        Game game = new Game(j0,j1);

        Jugador ganador = game.start();

        System.out.println("Ganador: "+ganador.getNombre());
        System.out.println(j0.isAlive());
        System.out.println(j1.isAlive());




    }
}
