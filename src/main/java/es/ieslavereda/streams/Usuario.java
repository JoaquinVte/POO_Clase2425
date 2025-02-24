package es.ieslavereda.streams;

import java.io.Serializable;

public class Usuario implements Serializable {

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
}
