package es.ieslavereda.ejemplos.bingoTAD;

public class Main {
    public static void main(String[] args) {

        Bombo b = new Bombo();
        Carton c = new Carton();
        Bola bola;

        b.rellenar();

        while(!b.isEmpty()){

            bola = b.sacarBola();
            c.check(bola);

            System.out.println(bola);
            System.out.println(c);

        }



    }
}
