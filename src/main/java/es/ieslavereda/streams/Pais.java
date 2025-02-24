package es.ieslavereda.streams;

import java.io.Serializable;

public class Pais implements Serializable {

    private String nombre;
    private String grupo;
    private String cancion;

    public Pais(String nombre, String grupo, String cancion) {
        this.nombre = nombre;
        this.grupo = grupo;
        this.cancion = cancion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getCancion() {
        return cancion;
    }

    public void setCancion(String cancion) {
        this.cancion = cancion;
    }

    @Override
    public String toString() {
        return "Pais{" +
                "nombre='" + nombre + '\'' +
                ", grupo='" + grupo + '\'' +
                ", cancion='" + cancion + '\'' +
                '}';
    }
}
