package es.ieslavereda.ejemplos;

public class Persona {

    // Atributos o campos
    private float altura;
    public String nombre;
    private String apellidos;
    int edad;

    // Constructor/es
    public Persona(String nombre,float altura,String apellidos,int edad){

        this.nombre = nombre;
        this.altura=altura;
        this.apellidos=apellidos;
        this.edad=edad;

    }
    public Persona(String nombre,String apellidos,float altura,int edad){

        this.nombre = nombre;
        this.altura=altura;
        this.apellidos=apellidos;
        this.edad=edad;

    }

    public Persona(){
        nombre="Desconocido";
        apellidos="Desconocido";
    }

    //metodos

    // getters
    public String getNombre(){
        return nombre;
    }

    public int getEdad(){
        return edad;
    }

    // setters
    public void setEdad(int edad){
        if(edad>0 && edad<120)
            this.edad=edad;
    }

    public void setAltura(float altura){
        this.altura=altura;
    }

    // funcionales
    public void cumplirAnyo(){
        edad++;
    }


    @Override
    public String toString(){
     return "Persona: " +nombre+ " "+apellidos+", edad:"+edad+", altura:"+altura;
    }

}
