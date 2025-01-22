package es.ieslavereda.ejemplos.estructuras_dinamicas.lse;

public class Main {

    public static void main(String[] args) {

        ListaSE lista = new ListaSE();

        lista.addHead(3);
        lista.addHead(4);
        lista.addHead(8);

        lista.addTail(0);

        System.out.println(lista);

        System.out.println(lista.removeTail());
        System.out.println(lista);

        System.out.println(lista.removeTail());
        System.out.println(lista);

        System.out.println(lista.removeTail());
        System.out.println(lista);

        System.out.println(lista.removeTail());
        System.out.println(lista);

        System.out.println(lista.removeTail());
        System.out.println(lista);

        System.out.println(lista.removeTail());
        System.out.println(lista);

        System.out.println(lista.removeTail());
        System.out.println(lista);

        System.out.println(lista.removeTail());



    }
}
