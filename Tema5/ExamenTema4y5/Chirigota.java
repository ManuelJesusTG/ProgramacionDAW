import java.util.Objects;

public class Chirigota extends AgrupacionOficial implements Callejera {

    private Integer NCuples;
    private Integer Puntos;

    public Chirigota(String nombre, String autor, String autorMusic, String autorLetras, String disfraz, Integer NCuples, Integer puntos) {
        super(nombre, autor, autorMusic, autorLetras, disfraz);
        this.NCuples = NCuples;
        Puntos = puntos;
    }

    public Integer getNCuples() {
        return NCuples;
    }

    public void setNCuples(Integer NCuples) {
        this.NCuples = NCuples;
    }

    public Integer getPuntos() {
        return Puntos;
    }

    public void setPuntos(Integer puntos) {
        Puntos = puntos;
    }

    @Override
    public String toString() {
        return "Chirigota{" +"Nombre='" + getNombre() + '\'' +
                ", Autor='" + getAutor() + '\'' +
                ", AutorMusic='" + getAutorMusic() + '\'' +
                ", AutorLetras='" + getAutorLetras() + '\'' +
                ", Disfraz='" + getDisfraz() + '\'' +
                "NCuples=" + NCuples +
                ", Puntos=" + Puntos +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Chirigota chirigota = (Chirigota) o;
        return Objects.equals(NCuples, chirigota.NCuples) && Objects.equals(Puntos, chirigota.Puntos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), NCuples, Puntos);
    }

    @Override
    public void caminito_del_falla() {
        System.out.println("La chirigota "+getNombre()+" va caminito del falla");
    }

    @Override
    public void cantar_la_presentacion() {
        System.out.println("Cantando la presentacion de la chirigota con nombre: "+getNombre());
    }

    @Override
    public void hacer_tipo() {
        System.out.println("La chirigota "+getNombre()+" va de "+getDisfraz());
    }

    @Override
    public void amo_a_escucha() {
        System.out.println("Amo a escuchar la Chirigota "+getNombre());
    }
}
