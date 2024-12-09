package es.ieslavereda.ejemplos;

public class Main {

    public static void main(String[] args) {
//
//        Punto p1 = new Punto(1,1);
//        Punto p2 = new Punto(3,2);
//        Punto p3 = new Punto(0,0);
//
//        Linea linea = new Linea(p1,p2);
//        Linea linea1 = new Linea(p2, p3);
//        Linea linea2 = new Linea(p3,p1);
//
//        Poligono p = new Poligono(linea,linea1,linea2);
//        p.moverArriba(3);
//        System.out.println(p.obtenerPermitro());

        Punto p1 = new Punto(1,1);
        Punto p2 = new Punto(1,1);
        Punto p3 = p2;

        System.out.println(p1==p2);
        System.out.println(p1.equals(p2));



    }
}
