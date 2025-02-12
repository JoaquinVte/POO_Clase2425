package es.ieslavereda.ejemplos.set;

import java.util.*;

public class Main {
    public static void main(String[] args) {


        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(13);
        lista.add(44);
        lista.add(65);
        lista.add(776);
        System.out.println(lista);



        //Set<Integer> conjunto = new HashSet<>(lista);

        Set<Integer> conjunto = new LinkedHashSet<>(lista);
//        conjunto.add(5);
//        conjunto.add(115);
//        conjunto.add(56);
//        conjunto.add(33);
//        conjunto.add(9);


        System.out.println(conjunto);




    }

}
