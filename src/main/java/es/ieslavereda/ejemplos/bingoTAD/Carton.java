package es.ieslavereda.ejemplos.bingoTAD;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Carton {


    private List<Celda> celdas;

    public Carton(){
        celdas = new ArrayList<>();
        rellenar(10,1,90);
    }

    public Carton(Integer cantidad, Integer min, Integer max) {
        this();
        rellenar(cantidad,min,max);
    }

    private void rellenar(Integer cantidad, Integer min, Integer max) {
        Celda c;

        for(int i=0;i<cantidad;i++){

            do {
                c = new Celda(aleatorio(min, max));
            }while (celdas.contains(c));

            celdas.add(c);


        }

        Collections.sort(celdas);

    }

    private int aleatorio(Integer min, Integer max) {
        return (int)(Math.random()*(max-min+1)+min);
    }

    @Override
    public String toString() {
        return "Carton{" +
                "celdas=" + celdas +
                '}';
    }

    public void check(Bola bola) {

        for(Celda c : celdas)
            c.marcar(bola);

    }

    public static class Celda implements Comparable<Celda> {

        private int value;
        private boolean marcado;

        public Celda(Integer value) {
            this.value = value;
            this.marcado=false;
        }

        public void marcar(Bola b){
            if(b.getValue()==value)
                marcar();
        }


        public void marcar(){
            this.marcado=true;
        }

        public boolean isMarcado() {
            return marcado;
        }

        @Override
        public boolean equals(Object o) {
            if(o==null) return false;
            if(!(o instanceof Celda)) return false;

            Celda c = (Celda) o;
            return c.value == value;
        }

        @Override
        public String toString() {
            return "{" + value +"-" + marcado +'}';
        }

        @Override
        public int compareTo(Celda o) {
            return value-o.value;
        }
    }
}
