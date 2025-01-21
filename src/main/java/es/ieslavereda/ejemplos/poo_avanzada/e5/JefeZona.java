package es.ieslavereda.ejemplos.poo_avanzada.e5;

import java.util.Arrays;

public class JefeZona extends Empleado{

    private String despacho;
    private Secretario secretario;
    private Vendedor[] vendedores;
    private Coche coche;

    public JefeZona(String nombre, String apellidos, String DNI, String dirección, String telefonoContacto, float salario, String despacho, Secretario secretario) {
        super(nombre, apellidos, DNI, dirección, telefonoContacto, salario);
        this.despacho = despacho;
        this.secretario = secretario;

        vendedores = new Vendedor[0];
        coche=null;
    }

    @Override
    public void cambiarSupervisor(Empleado empleado) {
        if(empleado instanceof JefeZona)
            this.supervisor=empleado;
    }

    @Override
    public void incrementarSalario() {
        salario*=1.05;
    }

    @Override
    public String toString() {
        return "JefeZona{"+
                super.toString()+
        "}";
    }

    public void addVendedor(Vendedor vendedor){

        if(!containsClient(vendedor)){

            Vendedor[] aux = Arrays.copyOf(vendedores,vendedores.length+1);
            aux[aux.length-1] = vendedor;

            vendedores=aux;
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

    private boolean containsClient(Vendedor vededor){

        int i=0;
        boolean encontrado = false;

        while(i<vendedores.length && !encontrado) {

            if (vendedores[i].equals(vededor))
                encontrado=true;

            i++;
        }

        return encontrado;

    }

    public void setSecretario(Secretario secretario) {
        this.secretario = secretario;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }
}
