package es.ieslavereda.ejemplos.poo_avanzada.ejemploInterfaz;

public class ImplementacionMejorada implements GestorCarton{

    Celda[] celdas;

    public ImplementacionMejorada() {
        celdas = new Celda[10];
    }

    @Override
    public int restantes() {
        return 0;
    }

    @Override
    public void marcar(int numero) {
        // funciona
    }

    @Override
    public boolean contains(int numero) {
        return false;
    }

    public class Celda {

    }
}
