package es.ieslavereda.ejemplos.poo_avanzada.e3;

import java.time.LocalDate;

public class Congelado extends Producto{

    private int temperatura;


    public Congelado(long lote, LocalDate caducidad, int temperatura) {
        super(lote, caducidad);
        this.temperatura = temperatura;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public String toString() {
        return "Congelado{" +
                super.toString()+
                ",temperatura=" + temperatura +
                '}';
    }
}
