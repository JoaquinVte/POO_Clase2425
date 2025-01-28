package es.ieslavereda.ejemplos.bingoTAD;

public class Bola {

    private int value;

    public Bola(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o){

        if(o==null) return false;
        if(!(o instanceof Bola)) return false;

        Bola b = (Bola) o;

        return value == b.value;

    }

    @Override
    public String toString() {
        return  ""+value ;
    }
}
