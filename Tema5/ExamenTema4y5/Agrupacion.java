import java.util.Objects;

public abstract class Agrupacion  {

    private String Nombre;
    private String Autor;
    private String AutorMusic;
    private String AutorLetras;
    private String Disfraz;
    private int NAgrupacionesTotales = 0;

    public Agrupacion(String nombre, String autor, String autorMusic, String autorLetras, String disfraz) {
        Nombre = nombre;
        Autor = autor;
        AutorMusic = autorMusic;
        AutorLetras = autorLetras;
        Disfraz = disfraz;
        NAgrupacionesTotales++;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public String getAutorMusic() {
        return AutorMusic;
    }

    public void setAutorMusic(String autorMusic) {
        AutorMusic = autorMusic;
    }

    public String getAutorLetras() {
        return AutorLetras;
    }

    public void setAutorLetras(String autorLetras) {
        AutorLetras = autorLetras;
    }

    public String getDisfraz() {
        return Disfraz;
    }

    public void setDisfraz(String disfraz) {
        Disfraz = disfraz;
    }

    @Override
    public String toString() {
        return "Agrupacion{" +
                "Nombre='" + Nombre + '\'' +
                ", Autor='" + Autor + '\'' +
                ", AutorMusic='" + AutorMusic + '\'' +
                ", AutorLetras='" + AutorLetras + '\'' +
                ", Disfraz='" + Disfraz + '\'' +
                ", NAgrupacionesTotales=" + NAgrupacionesTotales +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Agrupacion that = (Agrupacion) o;
        return Objects.equals(Nombre, that.Nombre) && Objects.equals(Autor, that.Autor) && Objects.equals(AutorMusic, that.AutorMusic) && Objects.equals(AutorLetras, that.AutorLetras) && Objects.equals(Disfraz, that.Disfraz);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Nombre, Autor, AutorMusic, AutorLetras, Disfraz);
    }

    public abstract void cantar_la_presentacion();
    public abstract void hacer_tipo();

}
