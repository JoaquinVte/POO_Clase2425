package es.ieslavereda.ejercicios.e3;

public class Contador {

    private int cantidad;
    private static int cantidadContadores;

    public Contador(){
        cantidad=0;
        cantidadContadores++;
    }

    public void incrementar(){
        cantidad++;
    }

    public void decrementar(){
        cantidad--;
    }

    public int getCantidad(){
        return cantidad;
    }

    public void setCantidad(int cantidad){
        this.cantidad=cantidad;
    }

    public int getCantidadContadores(){
        return cantidad;
    }

}
