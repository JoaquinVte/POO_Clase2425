package es.ieslavereda.exceptions.ejemplos;

import java.sql.SQLOutput;
import java.util.logging.Logger;

public class E1 {

    static Logger logger = Logger.getLogger(E1.class.getName());

    public static void main(String[] args) throws Exception {


//        int i=4;
//        int j=0;
//
//        System.out.println(i/j);


        String numero = "casa";

        try {

            System.out.println(parsearNumero(numero));


        }catch (Exception e){

           e.printStackTrace();

        }




    }

    private static int parsearNumero(String numero) throws Exception {


            if (numero.equals("casa"))
                throw new Exception("No puedo transformar " + numero);



        return Integer.parseInt(numero);



    }


}
