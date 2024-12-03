package es.ieslavereda;

public class Main {

    public static void main(String[] args) {

        Punto p1 = new Punto(1,1);
        Punto p2 = new Punto(3,2);

        Linea linea = new Linea(p1,p2);

        System.out.println(linea);
        linea.moverArriba(3);
        System.out.println(linea);
    }
}
