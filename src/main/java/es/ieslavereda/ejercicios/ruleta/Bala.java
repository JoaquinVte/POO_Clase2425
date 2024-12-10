package es.ieslavereda.ejercicios.ruleta;

public class Bala {

    private boolean valida;
    private boolean disparada;

    public Bala(){
        disparada=false;
        valida= true;
    }

    public boolean percutar(){

        if(disparada) return false;

        disparada=true;

        return valida;

    }

    @Override
    public String toString(){
        return (disparada)?"X":"O";
    }

}
