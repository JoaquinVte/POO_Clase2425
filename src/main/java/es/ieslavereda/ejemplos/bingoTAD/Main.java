package es.ieslavereda.ejemplos.bingoTAD;

public class Main {
    public static void main(String[] args) {

        Bombo b = new Bombo();
        Carton c = new Carton();
        Bola bola;

        b.rellenar();

        while(!c.completo())
            c.check(b.sacarBola());

        System.out.println(b);
        System.out.println(c);


    }
}
