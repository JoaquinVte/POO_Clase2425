package es.ieslavereda.streams;

import java.io.Serializable;
import java.util.Comparator;

public class Usuario implements Serializable,Comparable<Usuario> {

    public static Comparator<Usuario> COMPARADOR_POR_NOMBRE = new Comparator<Usuario>() {
        @Override
        public int compare(Usuario o1, Usuario o2) {
            return o1.nombre.compareToIgnoreCase(o2.nombre);
        }
    };

    private String nombre;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

    @Override
    public int compareTo(Usuario o) {
        return 0;
    }


}
