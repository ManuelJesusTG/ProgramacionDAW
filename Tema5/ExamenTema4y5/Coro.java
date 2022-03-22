import java.util.Objects;

public class Coro extends AgrupacionOficial {

    private Integer Bandurrias;
    private Integer NGuitarras;
    private Integer Puntos;

    public Coro(String nombre, String autor, String autorMusic, String autorLetras, String disfraz, Integer bandurrias, Integer NGuitarras, Integer puntos) {
        super(nombre, autor, autorMusic, autorLetras, disfraz);
        Bandurrias = bandurrias;
        this.NGuitarras = NGuitarras;
        Puntos = puntos;
    }

    public Integer getBandurrias() {
        return Bandurrias;
    }

    public void setBandurrias(Integer bandurrias) {
        Bandurrias = bandurrias;
    }

    public Integer getNGuitarras() {
        return NGuitarras;
    }

    public void setNGuitarras(Integer NGuitarras) {
        this.NGuitarras = NGuitarras;
    }

    public Integer getPuntos() {
        return Puntos;
    }

    public void setPuntos(Integer puntos) {
        Puntos = puntos;
    }

    @Override
    public String toString() {
        return "Coro{" +"Nombre='" + getNombre() + '\'' +
                ", Autor='" + getAutor() + '\'' +
                ", AutorMusic='" + getAutorMusic() + '\'' +
                ", AutorLetras='" + getAutorLetras() + '\'' +
                ", Disfraz='" + getDisfraz() + '\'' +
                "Bandurrias=" + Bandurrias +
                ", NGuitarras=" + NGuitarras +
                ", Puntos=" + Puntos +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Coro coro = (Coro) o;
        return Objects.equals(Bandurrias, coro.Bandurrias) && Objects.equals(NGuitarras, coro.NGuitarras) && Objects.equals(Puntos, coro.Puntos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), Bandurrias, NGuitarras, Puntos);
    }

    @Override
    public void caminito_del_falla() {
        System.out.println("El coro "+getNombre()+" va caminito del falla");
    }

    @Override
    public void cantar_la_presentacion() {
        System.out.println("Cantando la presentacion del Coro con nombre: "+getNombre());
    }

    @Override
    public void hacer_tipo() {
        System.out.println("El coro "+getNombre()+" va de "+getDisfraz());
    }
}
