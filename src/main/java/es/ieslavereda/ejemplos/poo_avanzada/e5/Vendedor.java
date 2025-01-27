package es.ieslavereda.ejemplos.poo_avanzada.e5;

import java.util.Arrays;

public class Vendedor extends Empleado{

    private Coche coche;
    private String telfonoMovil;
    private String area;
    private ListaSEString clientes;
    private float porcentajeComision;

    public Vendedor(String nombre, String apellidos, String DNI, String dirección, String telefonoContacto, float salario, String area, String telfonoMovil,float porcentajeComision) {
        super(nombre, apellidos, DNI, dirección, telefonoContacto, salario);
        this.area = area;
        this.telfonoMovil = telfonoMovil;
        clientes = new ListaSEString();
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

        if(!clientes.contains(cliente)){

//            String[] aux = new String[clientes.length+1];
//            aux[0]=cliente;
//
//            for(int i=0;i< clientes.length;i++)
//                aux[i+1]=clientes[i];

            clientes.addHead(cliente);
        }

    }


    public void delCliente(String cliente){

        clientes.remove(cliente);

    }

//    private boolean containsClient(String cliente){
//
//        int i=0;
//        boolean encontrado = false;
//
//        while(i<clientes.length && !encontrado) {
//
//            if (clientes[i].equalsIgnoreCase(cliente))
//                encontrado=true;
//
//            i++;
//        }
//
//        return encontrado;
//
//    }

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
