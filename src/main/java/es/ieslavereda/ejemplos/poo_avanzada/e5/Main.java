package es.ieslavereda.ejemplos.poo_avanzada.e5;

import java.util.*;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {


        List<String> lista = new LinkedList<>();


        lista.add("Coche");

        lista.add("Moto");
        // 10000000 elementos
        lista.add("Arbol");

        lista.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });



        System.out.println(lista);



    }


    public static class MyComparator implements Comparator<String>{

        @Override
        public int compare(String o1, String o2) {
            return o1.compareTo(o2);
        }
    }
}
