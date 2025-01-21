package es.ieslavereda.ejemplos.poo_avanzada.e5;

public class Secretario extends Empleado{

    private String despacho;
    private String fax;

    public Secretario(String nombre, String apellidos, String DNI, String dirección, String telefonoContacto, float salario, String despacho, String fax) {
        super(nombre, apellidos, DNI, dirección, telefonoContacto, salario);
        this.despacho = despacho;
        this.fax = fax;
    }


    @Override
    public void cambiarSupervisor(Empleado empleado) {
        if(
            empleado instanceof Secretario ||
            empleado instanceof JefeZona
        )
            this.supervisor = empleado;

    }

    @Override
    public void incrementarSalario() {
        salario*=1.15f;
    }

    @Override
    public String toString() {
        return "Secretario{" +
                super.toString()+
                ",despacho='" + despacho + '\'' +
                ", fax='" + fax + '\'' +
                '}';
    }
}
