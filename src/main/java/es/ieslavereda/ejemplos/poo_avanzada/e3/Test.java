package es.ieslavereda.ejemplos.poo_avanzada.e3;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {

        Congelado c = new Congelado(512323451, LocalDate.now(),-5);
        Refrigerados r = new Refrigerados(123526,LocalDate.now(),"Spain");
        Fresco f = new Fresco(11235123,LocalDate.now(),LocalDate.now(),"Spain");

        System.out.println(c);
        System.out.println(r);
        System.out.println(f);
    }
}
