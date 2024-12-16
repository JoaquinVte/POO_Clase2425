package es.ieslavereda.ejercicios.e11;

import java.util.Arrays;

public class Mano {

    private Carta[] cartas;

    public Mano() {
        cartas = new Carta[0];
    }

    public void add(Carta carta){

        Carta[] aux = new Carta[cartas.length+1];

        int i=0;
        aux[i++] = carta;

        for(Carta c : cartas)
            aux[i++]=c;

        cartas=aux;

    }

    public int getPuntuacion(){
        int puntuacion=0;

        for(Carta c : cartas)
            puntuacion+=c.getPuntuaciones()[0];

        return puntuacion;

    }

    @Override
    public String toString(){
        return "Puntuacion: " + getPuntuacion()+"\n"+Arrays.toString(cartas);
    }
}









