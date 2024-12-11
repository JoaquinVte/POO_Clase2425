package es.ieslavereda.ejercicios.e11;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Baraja b = new Baraja();
        for(int i=0;i<54;i++) {
            System.out.println(b.obtenerCartaInferior());
            System.out.println(b);
        }

    }
}
