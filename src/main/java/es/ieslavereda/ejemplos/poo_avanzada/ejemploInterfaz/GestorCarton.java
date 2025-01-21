package es.ieslavereda.ejemplos.poo_avanzada.ejemploInterfaz;

public interface GestorCarton {

    int restantes();
    void marcar(int numero);

    boolean contains(int numero);
}
