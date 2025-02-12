package es.ieslavereda.ejemplos.map.hashmap;

import es.ieslavereda.ejemplos.set.Usuario;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {


    public static void main(String[] args) {

//        Map<String,Integer> almacen = new HashMap<>();
//
//        almacen.put("Tornillos",27);
//        almacen.put("Arandelas",100);
//        almacen.put("Tuercas",0);
//        almacen.put("Clavos",0);

        //     K        V
        Map<Vendedor, Usuario> relacion = new TreeMap<>();

        relacion.put(new Vendedor("Juan"),new Usuario("1234","Manolo"));
        relacion.put(new Vendedor("Vicente"),new Usuario("1111","Carlos"));
        relacion.put(new Vendedor("Teresa"),new Usuario("2323","Luis"));
        relacion.put(new Vendedor("Carmen"),new Usuario("0987","Pablo"));
        relacion.put(new Vendedor("Tomas"),new Usuario("0987","Pablo"));


        for(Vendedor k : relacion.keySet())
            System.out.println(k.getNombre() + " -> " + relacion.get(k).getNombre());



    }
}
