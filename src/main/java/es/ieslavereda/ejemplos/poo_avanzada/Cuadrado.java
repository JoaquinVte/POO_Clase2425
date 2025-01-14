package es.ieslavereda.ejemplos.poo_avanzada;

public class Cuadrado extends Figura{

    private float longitud;

    public Cuadrado(float longitud){
        super(4);
        this.longitud=longitud;
    }

    public float obtenerArea(){
        return longitud*longitud;
    }
}
