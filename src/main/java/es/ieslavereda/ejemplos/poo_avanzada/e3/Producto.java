package es.ieslavereda.ejemplos.poo_avanzada.e3;

import java.time.LocalDate;

public abstract class Producto {

    private long lote;
    private LocalDate caducidad;


    public Producto(long lote, LocalDate caducidad) {
        this.lote = lote;
        this.caducidad = caducidad;
    }

    public long getLote() {
        return lote;
    }

    public LocalDate getCaducidad() {
        return caducidad;
    }

    public void setLote(long lote) {
        this.lote = lote;
    }

    public void setCaducidad(LocalDate caducidad) {
        this.caducidad = caducidad;
    }

    @Override
    public String toString() {
        return
                "lote=" + lote +
                ", caducidad=" + caducidad
               ;
    }
}
