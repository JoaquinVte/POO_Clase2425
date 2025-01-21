package es.ieslavereda.ejemplos.poo_avanzada.ejemploInterfaz;

public class ImplementacionCarton1 implements GestorCarton {

    private int[] numeros;
    private boolean[] marcados;

    public ImplementacionCarton1() {
        numeros = new int[10];
        marcados = new boolean[10];

    }

    @Override
    public int restantes() {
        return 0;
    }

    @Override
    public void marcar(int numero) {

    }

    @Override
    public boolean contains(int numero) {
        return false;
    }


}
