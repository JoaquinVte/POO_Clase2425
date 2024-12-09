package es.ieslavereda.ejercicios.ruleta;

public class Main {
    public static void main(String[] args) {

        Pistola p = new Pistola();

        p.recargar(new Bala());
        p.girarTambor();

        System.out.println(p);

        for(int i=0;i<8;i++)
            System.out.println(p.disparar());

        System.out.println(p);

    }
}
