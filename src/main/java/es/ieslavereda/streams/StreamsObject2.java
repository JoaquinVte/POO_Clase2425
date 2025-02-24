package es.ieslavereda.streams;

import java.io.*;

public class StreamsObject2 {

    public static void main(String[] args) {
      cargar();
    }

    private static void cargar() {

        try(ObjectInputStream is =new ObjectInputStream(new FileInputStream("ficheroObjetos"))){

            Pais p = (Pais)is.readObject();
            System.out.println(p);

            Usuario u = (Usuario)is.readObject();
            System.out.println(u);



        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    public static void guardar(){

        Pais p1 = new Pais("España","Melody","Diva");
        Usuario u = new Usuario("Manolo");

        try(ObjectOutputStream os = new ObjectOutputStream(
                new FileOutputStream("ficheroObjetos")))
        {
            os.writeObject(p1);
            os.writeObject(u);
            os.flush();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
