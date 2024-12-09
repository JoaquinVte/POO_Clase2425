package es.ieslavereda.ejercicios.e1;

public class Main {
    public static void main(String[] args) {

        Cuenta c1 = new Cuenta("Manolo Garcia Lopez",500);
        Cuenta c2 = new Cuenta("Joaquin Alonso");

        c1.ingreso(500);

        System.out.println(c1.transferecia(100,c2));
        System.out.println(c1);
        System.out.println();
        System.out.println(c2);

    }
}
