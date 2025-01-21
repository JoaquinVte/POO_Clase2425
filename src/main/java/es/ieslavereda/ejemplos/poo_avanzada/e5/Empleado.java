package es.ieslavereda.ejemplos.poo_avanzada.e5;

public abstract class Empleado {

    private String nombre;
    private String apellidos;
    private String DNI;
    private String dirección;
    private int antiguedad;
    private String telefonoContacto;
    protected float salario;
    protected Empleado supervisor;

    public Empleado(String nombre, String apellidos, String DNI, String dirección, String telefonoContacto, float salario) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.DNI = DNI;
        this.dirección = dirección;
        this.telefonoContacto = telefonoContacto;
        this.salario = salario;
        antiguedad = 0;
        supervisor = null;
    }

    @Override
    public String toString() {
        return  "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", DNI='" + DNI + '\'' +
                ", dirección='" + dirección + '\'' +
                ", antiguedad=" + antiguedad +
                ", telefonoContacto='" + telefonoContacto + '\'' +
                ", salario=" + salario +
                ", supervisor=" + supervisor;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(!(obj instanceof Empleado)) return false;
        Empleado e = (Empleado) obj;
        return e.DNI.equalsIgnoreCase(DNI);
    }

    public float getSalario() {
        return salario;
    }

    public abstract void cambiarSupervisor(Empleado empleado);

    public abstract void incrementarSalario();

}
