package es.ieslavereda.ejemplos.poo_avanzada.e4;

public abstract class Vehiculo {

    private int velocidad;

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    protected void incrementar(){
        velocidad++;
    }

    protected boolean decrementar(){

        if(velocidad > 0) {
            velocidad--;
            return true;
        }
        return false;

    }

    public abstract boolean incrementar(int cantidad);
    public abstract boolean decrementar(int cantidad);

}
