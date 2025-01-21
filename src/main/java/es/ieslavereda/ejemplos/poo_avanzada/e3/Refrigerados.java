package es.ieslavereda.ejemplos.poo_avanzada.e3;

import java.time.LocalDate;

public class Refrigerados extends Producto{

    private String codigo;

    public Refrigerados(long lote, LocalDate caducidad, String codigo) {
        super(lote, caducidad);
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Refrigerados{" +
                super.toString()+
                ",codigo='" + codigo + '\'' +
                '}';
    }
}
