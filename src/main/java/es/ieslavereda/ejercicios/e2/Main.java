package es.ieslavereda.ejercicios.e2;

import es.ieslavereda.ejercicios.e1.Cuenta;

public class Main {
    public static void main(String[] args) {


        Cuenta c1 = new Cuenta("Manolo",2000);

        Tarjeta t1 = new Tarjeta(c1,3000,"Manolo");

        System.out.println(t1.pagarCredito(1000));
        System.out.println(t1.pagarDebito(500));
        System.out.println(t1);
        System.out.println("----");
        System.out.println(t1.restablecerCredito());
        System.out.println(t1);

    }
}
