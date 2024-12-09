package es.ieslavereda.ejercicios.ruleta;

public class Pistola {

    private Tambor tambor;
    private int pos;

    public Pistola(){
        tambor = new Tambor();
        pos=((int)Math.random())* tambor.getSize();

    }

    public void recargar(){
        tambor.recargar();
    }

    public void recargar(Bala bala){
        tambor.recargar(0,bala);
    }

    public void girarTambor(){
        pos = (int)(Math.random()* tambor.getSize());
    }


    public boolean disparar(){

        Bala b = tambor.getBalaAt(pos++);
        if(b==null) return false;

        return b.percutar();
    }

    public String toString(){
        return pos+"\n"+
                tambor.toString();
    }


}
