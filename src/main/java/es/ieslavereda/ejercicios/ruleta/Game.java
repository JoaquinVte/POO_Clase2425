package es.ieslavereda.ejercicios.ruleta;

public class Game {

    private Pistola pistola;
    private Jugador jugador0;
    private Jugador jugador1;
    private int turno;

    public Game(Jugador jugador0,Jugador jugador1){
        this.jugador0=jugador0;
        this.jugador1=jugador1;
        pistola = new Pistola();
        turno = (int)(Math.random()*2);
    }

    public Jugador start(){

        pistola.recargar(new Bala());
        //pistola.girarTambor();

        while (jugador0.isAlive() && jugador1.isAlive()) {

            switch (turno) {
                case 0:
                    jugador0.dispar(pistola);
                    break;
                case 1:
                    jugador1.dispar(pistola);
                    break;
            }

            turno = (turno+1)%2;


        }

        return (jugador0.isAlive())?jugador0:jugador1;

    }



}
