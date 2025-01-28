package es.ieslavereda.ejemplos.bingoTAD;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bombo {

    private List<Bola> bolas;

    public Bombo() {

        bolas = new ArrayList<>();

    }

    public boolean isEmpty(){
        return bolas.isEmpty();
    }

    public void add(Bola bola){
        bolas.add(bola);
    }

    public void rellenar(){
        for(int i=1;i<=90;i++)
            bolas.add(new Bola(i));
    }

    public boolean contains(Bola bola){

        return bolas.contains(bola);

    }

    public void girar(){
        Collections.shuffle(bolas);
    }

    public Bola sacarBola(){

        if(bolas.size()%5==0) girar();

        if(!bolas.isEmpty()) return bolas.remove(0);


        return null;
    }

    @Override
    public String toString() {
        return "Bombo{" +
                "bolas=" + bolas +
                '}';
    }
}
