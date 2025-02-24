package es.ieslavereda.streams;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StreamsObject {


    public static void main(String[] args) {

       // guardarPais();
        System.out.println(cargarPais());

    }

    private static List<Pais> cargarPais() {


        List<Pais> paises = new ArrayList<>();


        try(ObjectInputStream is = new ObjectInputStream(new FileInputStream("ficheroObjetos"))) {

            Object o;
            while ((o = is.readObject())!=null)
                paises.add((Pais)o);



        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


        return paises;

    }

    public static void guardarPais(){
        Pais p1 = new Pais("España","Melody","Diva");
        Pais p2 = new Pais("Francia","Grupo francia","Cancion francesa");

        try(ObjectOutputStream os = new ObjectOutputStream(
                new FileOutputStream("ficheroObjetos")))
        {
            os.writeObject(p1);
            os.writeObject(p2);
            os.flush();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
