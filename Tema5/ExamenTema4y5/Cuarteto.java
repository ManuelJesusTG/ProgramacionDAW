import java.util.Objects;

public class Cuarteto extends AgrupacionOficial implements Callejera {

    private Integer Miembros;
    private Integer Puntos;

    public Cuarteto(String nombre, String autor, String autorMusic, String autorLetras, String disfraz, Integer miembros, Integer puntos) {
        super(nombre, autor, autorMusic, autorLetras, disfraz);
        Miembros = miembros;
        Puntos = puntos;
    }

    public Integer getMiembros() {
        return Miembros;
    }

    public void setMiembros(Integer miembros) {
        Miembros = miembros;
    }

    public Integer getPuntos() {
        return Puntos;
    }

    public void setPuntos(Integer puntos) {
        Puntos = puntos;
    }

    @Override
    public String toString() {
        return "Cuarteto{" + "Nombre='" + getNombre()+ '\'' +
                ", Autor='" + getAutor() + '\'' +
                ", AutorMusic='" + getAutorMusic() + '\'' +
                ", AutorLetras='" + getAutorLetras() + '\'' +
                ", Disfraz='" + getDisfraz() + '\'' +
                "Miembros=" + Miembros +
                ", Puntos=" + Puntos +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cuarteto cuarteto = (Cuarteto) o;
        return Objects.equals(Miembros, cuarteto.Miembros) && Objects.equals(Puntos, cuarteto.Puntos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), Miembros, Puntos);
    }

    @Override
    public void caminito_del_falla() {
        System.out.println("El cuarteto "+getNombre()+" va caminito del falla");
    }

    @Override
    public void cantar_la_presentacion() {
        System.out.println("Cantando la presentacion del Cuarteto con nombre: "+getNombre());
    }
    @Override
    public void hacer_tipo() {
        System.out.println("El Cuarteto "+getNombre()+" va de "+getDisfraz());
    }

    @Override
    public void amo_a_escucha() {
        System.out.println("Amo a escuchar el cuarteto "+getNombre());
    }
}
