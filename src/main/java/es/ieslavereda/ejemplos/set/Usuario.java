package es.ieslavereda.ejemplos.set;

public class Usuario implements Comparable<Usuario> {

    private String dni;
    private String nombre;

    public Usuario(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }




    @Override
    public String toString() {
        return "Usuario{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    @Override
    public int compareTo(Usuario u) {

        if (nombre.compareToIgnoreCase(u.nombre) == 0)
            return dni.compareToIgnoreCase(u.dni);
        else
            return nombre.compareToIgnoreCase(u.nombre);
    }
}
