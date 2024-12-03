package es.ieslavereda;

public class Punto {

    private int x;
    private int y;

    public Punto(){
        this.x=0;
        this.y=0;
    }

    public Punto(int x,int y){
        this.x=x;
        this.y=y;
    }

    public Punto(int x){
        this.x=x;
        this.y=0;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void moverIzq(int cantidad){
        if(cantidad>0)
            this.x-=cantidad;
    }

    public void moverDer(int cantidad){
        if(cantidad>0)
            this.x+=cantidad;
    }

    public void moverArriba(int cantidad){
        if(cantidad>0)
            this.y+=cantidad;
    }

    public void moverAbajo(int cantidad){
        if (cantidad>0)
            this.y-=cantidad;
    }

    @Override
    public String toString(){
        return "("+x+","+y+")";
    }

}
