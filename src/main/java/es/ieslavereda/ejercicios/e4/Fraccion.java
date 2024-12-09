package es.ieslavereda.ejercicios.e4;

public class Fraccion {

    private int numerador;
    private int denominador;

    public Fraccion(int numerador, int denominador) {

        int m = mcd(numerador,denominador);

        this.numerador = numerador/m;
        this.denominador = denominador/m;


    }

    public Fraccion suma(Fraccion fraccion) {

        if (denominador == fraccion.denominador)
            return new Fraccion(numerador + fraccion.numerador, denominador);

        return new Fraccion(
                numerador * fraccion.denominador + fraccion.numerador * denominador,
                denominador * fraccion.denominador
        );

    }

    public Fraccion suma(int numero){
        return suma(new Fraccion(numero,1));
    }

    public Fraccion multiplica(Fraccion fraccion){
        return new Fraccion(numerador * fraccion.numerador,
                            denominador* fraccion.denominador);
    }

    private int mcd(int a,int b){
        if(b==0) return a;
        return mcd(b,a%b);
    }

    @Override
    public String toString() {
        return numerador + "/" + denominador;
    }

}
