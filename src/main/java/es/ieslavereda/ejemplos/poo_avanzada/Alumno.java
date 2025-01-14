package es.ieslavereda.ejemplos.poo_avanzada;

public class Alumno extends Persona {

    private String nia;

    public Alumno(String nombre,String apellidos,String nia){
        super(nombre,apellidos);
        this.nia=nia;
    }



    @Override
    public String toString() {
        return super.toString() +"\n"+
                "Alumno\n"+
                "Nia: " + nia;
    }
}
