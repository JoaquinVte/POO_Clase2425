package es.ieslavereda.ejemplos.set;

import java.util.*;

public class Main3 {


    public static void main(String[] args) {


//        Set<Integer> conjunto = new HashSet<>(List.of(1,5,8,3,8,111,33));
//
//        System.out.println(conjunto);
//
//        Set<Integer> conjuntoTree = new TreeSet<>(conjunto);
//
//        System.out.println(conjuntoTree);


        List<Usuario> usuarios = List.of(
                new Usuario("5944","Manolo"),
                new Usuario("1111","Juan"),
                new Usuario("5678","Pedro"),
                new Usuario("5944","Manolo"),
                new Usuario("1111","Juan"),
                new Usuario("5678","Pedro")
        );


        Set<Usuario> conjunto = new TreeSet<>(usuarios);
        Set<Usuario> conjunto2 = new TreeSet<>(new Comparator<Usuario>() {
            @Override
            public int compare(Usuario o1, Usuario o2) {
                return o1.getDni().compareTo(o2.getDni());
            }
        });

        conjunto2.addAll(conjunto);

        System.out.println(conjunto);
        System.out.println(conjunto2);

    }
}
