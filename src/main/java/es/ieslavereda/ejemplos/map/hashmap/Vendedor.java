package es.ieslavereda.ejemplos.map.hashmap;

public class Vendedor implements Comparable<Vendedor> {

    private String nombre;

    public Vendedor(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        return nombre.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null || !(obj instanceof Vendedor))return false;

        Vendedor v = (Vendedor) obj;
        return nombre.equalsIgnoreCase(v.nombre);
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

    @Override
    public int compareTo(Vendedor o) {
        return nombre.compareToIgnoreCase(o.nombre);
    }
}
