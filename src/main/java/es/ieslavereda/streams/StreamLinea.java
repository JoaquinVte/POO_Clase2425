package es.ieslavereda.streams;

import java.io.*;

public class StreamLinea {

    public static void main(String[] args) {


        try(BufferedReader br = new BufferedReader(
                new FileReader("paises.txt"));
            PrintWriter pw = new PrintWriter("xanadu.linea.txt")){

            String linea;
            int i=1;

            while ((linea = br.readLine())!=null){
                System.out.println(linea.split(";")[0]);
                //System.out.println(linea.split(";")[1]);
                System.out.println(linea.split(";")[2]);
            }



        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
