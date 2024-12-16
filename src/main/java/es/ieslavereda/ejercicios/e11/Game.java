package es.ieslavereda.ejercicios.e11;

public class Game {

    private Jugador[] jugadores;
    private Jugador pc;
    private Baraja baraja;


    public Game(Jugador... jugadores){
        this.jugadores=jugadores;
        pc=new Jugador("Banca");

    }


    public void start(){

        jueganJugadores();
        juegaBanca();
        analizoGanador();

    }

    private void jueganJugadores() {

        for(Jugador jugador : jugadores) {

            baraja = new Baraja();
            baraja.barajar();
            char opcion=' ';

            System.out.println("Juega " + jugador.getNombre());

            do {

                jugador.recibir(baraja.obtenerCartaSuperior());
                System.out.println(jugador);
                if(jugador.getPuntuacion()<21)
                    opcion = Entrada.getOpcion("Quieres carta" + jugador.getNombre() + "?");

            } while (jugador.getPuntuacion() < 21 && opcion == 's');

        }

    }

    private void juegaBanca() {
    }

    private void analizoGanador() {
    }
}
