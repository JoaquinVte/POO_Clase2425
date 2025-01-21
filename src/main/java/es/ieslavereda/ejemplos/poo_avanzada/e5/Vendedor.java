package es.ieslavereda.ejemplos.poo_avanzada.e5;

import java.util.Arrays;

public class Vendedor extends Empleado{

    private Coche coche;
    private String telfonoMovil;
    private String area;
    private String[] clientes;
    private float porcentajeComision;

    public Vendedor(String nombre, String apellidos, String DNI, String dirección, String telefonoContacto, float salario, String area, String telfonoMovil,float porcentajeComision) {
        super(nombre, apellidos, DNI, dirección, telefonoContacto, salario);
        this.area = area;
        this.telfonoMovil = telfonoMovil;
        clientes = new String[0];
        this.porcentajeComision = porcentajeComision;
    }

    @Override
    public void cambiarSupervisor(Empleado empleado) {
        if(
            empleado instanceof Vendedor ||
            empleado instanceof JefeZona
        )
            this.supervisor=empleado;
    }

    public void addCliente(String cliente){

        if(!containsClient(cliente)){

//            String[] aux = new String[clientes.length+1];
//            aux[0]=cliente;
//
//            for(int i=0;i< clientes.length;i++)
//                aux[i+1]=clientes[i];

            String[] aux = Arrays.copyOf(clientes,clientes.length+1);
            aux[aux.length-1] = cliente;

            clientes=aux;
        }

    }


    public void delCliente(String cliente){

        if(containsClient(cliente)){

            String[] aux = new String[clientes.length-1];

            int i=0;
            for(String c : clientes)
                if(!c.equalsIgnoreCase(cliente))
                    aux[i++]=c;

            clientes=aux;
        }

    }

    private boolean containsClient(String cliente){

        int i=0;
        boolean encontrado = false;

        while(i<clientes.length && !encontrado) {

            if (clientes[i].equalsIgnoreCase(cliente))
                encontrado=true;

            i++;
        }

        return encontrado;

    }

    @Override
    public void incrementarSalario() {
        salario*=1.1;
    }

    public void cambiarCoche(Coche coche) {
        this.coche = coche;
    }

    

    @Override
    public String toString() {
        return "Vendedor{" +
                    super.toString()+
                '}';
    }
}
