import java.util.Objects;

public class Romancero extends Agrupacion implements Callejera{

    private String TematicaCartelon;

    public Romancero(String nombre, String autor, String autorMusic, String autorLetras, String disfraz, String tematicaCartelon) {
        super(nombre, autor, autorMusic, autorLetras, disfraz);
        TematicaCartelon = tematicaCartelon;
    }

    public String getTematicaCartelon() {
        return TematicaCartelon;
    }

    public void setTematicaCartelon(String tematicaCartelon) {
        TematicaCartelon = tematicaCartelon;
    }

    @Override
    public String toString() {
        return "Romancero{" + "Nombre='" + getNombre() + '\'' +
                ", Autor='" + getAutor() + '\'' +
                ", AutorMusic='" + getAutorMusic() + '\'' +
                ", AutorLetras='" + getAutorLetras() + '\'' +
                ", Disfraz='" + getDisfraz() + '\'' +
                "TematicaCartelon='" + TematicaCartelon + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Romancero romancero = (Romancero) o;
        return Objects.equals(TematicaCartelon, romancero.TematicaCartelon);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), TematicaCartelon);
    }
    @Override
    public void cantar_la_presentacion() {
        System.out.println("Cantando la presentacion del Romancero con nombre: "+getNombre());
    }
    @Override
    public void hacer_tipo() {
        System.out.println("El Romancero "+getNombre()+" va de "+getDisfraz());
    }

    @Override
    public void amo_a_escucha() {
        System.out.println("Amo a escuchar el Romancero "+getNombre());
    }
}
