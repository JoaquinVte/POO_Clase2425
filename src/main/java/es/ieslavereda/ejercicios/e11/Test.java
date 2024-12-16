package es.ieslavereda.ejercicios.e11;

public class Test {

    public static void main(String[] args) {


        Mano m = new Mano();

        m.add(new Carta(Valor.AS,Palo.CORAZON));
        m.add(new Carta(Valor.AS,Palo.CORAZON));
        m.add(new Carta(Valor.AS,Palo.CORAZON));

        System.out.println(m.getPuntuacion());
    }
}
