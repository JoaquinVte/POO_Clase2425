package es.ieslavereda.ejemplos.poo_avanzada.e3;

import java.time.LocalDate;

public class Fresco extends Producto{

    private LocalDate envasado;
    private String pais;

    public Fresco(long lote, LocalDate caducidad, LocalDate envasado, String pais) {
        super(lote, caducidad);
        this.envasado = envasado;
        this.pais = pais;
    }

    public LocalDate getEnvasado() {
        return envasado;
    }

    public void setEnvasado(LocalDate envasado) {
        this.envasado = envasado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Fresco{" +
                super.toString()+
                ",envasado=" + envasado +
                ", pais='" + pais + '\'' +
                '}';
    }
}
