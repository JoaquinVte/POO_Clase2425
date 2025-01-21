package es.ieslavereda.ejemplos.poo_avanzada;

import java.util.Arrays;
import java.util.Comparator;

public class EjemploInterfaz {

    public static void main(String[] args) {


        Persona[] personas = new Persona[]{
                new Persona("Juan","Garcia Lopez"),
                new Persona("Juan","Jimenez Sanchez"),
                new Persona("Juan","Garcia Martinez"),
                new Persona("Juan","Lopez Alonso"),
                new Persona("Juan","Ruiz Sanz"),
                new Persona("Tomas","Sanchez Lopez")
        };


        Arrays.sort(personas, new Comparator<Persona>() {
            @Override
            public int compare(Persona o1, Persona o2) {
                return 0;
            }
        });


        System.out.println(Arrays.toString(personas));


    }

    public static class CustomClass implements Comparator<Persona> {


        @Override
        public int compare(Persona o1, Persona o2) {
            return o1.getApellidos().compareToIgnoreCase(o2.getApellidos());
        }
    }
}
