package es.ieslavereda.ejemplos;

public class Linea {

    private Punto inicio;
    private Punto fin;

    public Linea(Punto inicio,Punto fin){
        this.inicio=inicio;
        this.fin=fin;
    }

    public double obtenerDistancia(){

        int a = inicio.getY()- fin.getY();
        int b = inicio.getX()- fin.getX();

        return Math.sqrt(Math.pow(a,2)+Math.pow(b,2));

    }

    public void moverArriba(int c){
        inicio.moverArriba(c);
        fin.moverArriba(c);
    }



    @Override
    public String toString(){
        return inicio + "-" + fin;
    }
}
