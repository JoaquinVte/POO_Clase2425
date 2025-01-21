package es.ieslavereda.ejemplos.poo_avanzada.e2;

public class Pelicula extends Multimedia {

    private static final String ANIMACION = "ANIMACION";

    private String actor;
    private String actriz;

    public Pelicula(String titulo, String autor, Formato formato, int duración, String actor, String actriz) {
        this(titulo, autor, formato, duración);

        if(actor!=null || actriz!=null){
            this.actor = actor;
            this.actriz = actriz;
        }
    }

    public Pelicula(String titulo, String autor, Formato formato, int duración) {
        super(titulo, autor, formato, duración);

        this.actor = ANIMACION;
        this.actriz = ANIMACION;
    }

    public String getActor() {
        return actor;
    }

    public String getActriz() {
        return actriz;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                super.toString()+
                "actor='" + actor + '\'' +
                ", actriz='" + actriz + '\'' +
                '}';
    }
}
