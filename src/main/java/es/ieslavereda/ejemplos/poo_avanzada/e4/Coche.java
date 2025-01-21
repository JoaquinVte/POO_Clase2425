package es.ieslavereda.ejemplos.poo_avanzada.e4;

public class Coche extends Vehiculo {


    @Override
    public boolean incrementar(int cantidad) {

        for(int i=0;i<cantidad;i++)
            incrementar();


        return false;
    }

    @Override
    public boolean decrementar(int cantidad) {

        boolean realizado = true;

        for(int i=0;i<cantidad;i++)
            realizado = realizado && decrementar();

        return realizado;
    }
}
