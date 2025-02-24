package es.ieslavereda.streams;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamLinea {

    public static void main(String[] args) {


        List<Pais> paises = cargarPaises();

        listarAlfabeticamente(paises);

        List<Usuario> listaUsuarios = new ArrayList<>();

        Collections.sort(listaUsuarios,Usuario.COMPARADOR_POR_NOMBRE);



    }

    private static void listarAlfabeticamente(List<Pais> paises) {

        Collections.sort(paises, (p1,p2)->p1.getNombre().compareToIgnoreCase(p2.getNombre()));


        try(PrintWriter pw = new PrintWriter("listado.txt")) {

            for (Pais p : paises)
                pw.println(p);




        }catch (Exception e){
            e.printStackTrace();
        }


    }

    private static List<Pais> cargarPaises() {
        List<Pais> paises = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(
                new FileReader("paises.txt"))
            ){

            String linea;
            String nombrePais,nombreGrupo,nombreCancion;




            while ((linea = br.readLine())!=null){
                nombrePais=linea.split(";")[0];
                nombreGrupo=linea.split(";")[1];
                nombreCancion=linea.split(";")[2];

                paises.add(new Pais(nombrePais,nombreGrupo,nombreCancion));

            }



        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return paises;
    }
}
