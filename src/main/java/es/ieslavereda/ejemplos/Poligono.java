package es.ieslavereda.ejemplos;

public class Poligono {

    private Linea[] lineas;


    public Poligono(Linea... lineas){

        this.lineas = lineas;

    }

    public void moverArriba(int c){
        for(Linea l : lineas)
            l.moverArriba(c);
    }

    public double obtenerPermitro(){

        double perimetro=0;

        for(Linea l : lineas)
            perimetro+=l.obtenerDistancia();

        return perimetro;
    }

}
