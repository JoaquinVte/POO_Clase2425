package es.ieslavereda.streams;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamLinea {

    public static void main(String[] args) {


        List<Pais> paises = cargarPaises();

        listarAlfabeticamente(paises);



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
        try(BufferedReader br = new BufferedReader(
                new FileReader("paises.txt"));
            PrintWriter pw = new PrintWriter("xanadu.linea.txt")){

            String linea;
            String nombrePais,nombreGrupo,nombreCancion;
            List<Pais> paises = new ArrayList<>();

            int i=1;

            while ((linea = br.readLine())!=null){
                nombrePais=linea.split(";")[0];
                nombreGrupo=linea.split(";")[1];
                nombreCancion=linea.split(";")[2];

                paises.add(new Pais(nombrePais,nombreGrupo,nombreCancion));

            }



        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }try(BufferedReader br = new BufferedReader(
                new FileReader("paises.txt"));
             PrintWriter pw = new PrintWriter("xanadu.linea.txt")){

            String linea;
            String nombrePais,nombreGrupo,nombreCancion;
            List<Pais> paises = new ArrayList<>();

            int i=1;

            while ((linea = br.readLine())!=null){
                nombrePais=linea.split(";")[0];
                nombreGrupo=linea.split(";")[1];
                nombreCancion=linea.split(";")[2];

                paises.add(new Pais(nombrePais,nombreGrupo,nombreCancion));

            }
            return paises;


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
