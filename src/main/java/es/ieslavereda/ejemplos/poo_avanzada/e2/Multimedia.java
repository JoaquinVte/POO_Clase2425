package es.ieslavereda.ejemplos.poo_avanzada.e2;

public abstract class Multimedia {

    private String titulo;
    private String autor;
    private Formato formato;
    private int duración;

    public Multimedia(String titulo, String autor, Formato formato, int duración) {
        this.titulo = titulo;
        this.autor = autor;
        this.formato = formato;
        this.duración = duración;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Formato getFormato() {
        return formato;
    }

    public void setFormato(Formato formato) {
        this.formato = formato;
    }

    public int getDuración() {
        return duración;
    }

    public void setDuración(int duración) {
        this.duración = duración;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null || !(obj instanceof Multimedia))return false;
        Multimedia m = (Multimedia)obj;
        return m.titulo.equalsIgnoreCase(titulo) &&
                autor.equalsIgnoreCase(m.autor);

    }

    @Override
    public String toString() {
        return  "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", formato=" + formato +
                ", duración=" + duración;
    }

    public enum Formato {
        wav, mp3, midi, avi, mov, mpg, cdAudio, dvd;
    }
}
