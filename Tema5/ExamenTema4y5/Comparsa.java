import java.util.Objects;

public class Comparsa extends AgrupacionOficial {

    private String EmpresaAtrezzo;
    private Integer PuntosObtenidos;

    public Comparsa(String nombre, String autor, String autorMusic, String autorLetras, String disfraz, String empresaAtrezzo, Integer puntosObtenidos) {
        super(nombre, autor, autorMusic, autorLetras, disfraz);
        EmpresaAtrezzo = empresaAtrezzo;
        PuntosObtenidos = puntosObtenidos;
    }

    public String getEmpresaAtrezzo() {
        return EmpresaAtrezzo;
    }

    public void setEmpresaAtrezzo(String empresaAtrezzo) {
        EmpresaAtrezzo = empresaAtrezzo;
    }

    public Integer getPuntosObtenidos() {
        return PuntosObtenidos;
    }

    public void setPuntosObtenidos(Integer puntosObtenidos) {
        PuntosObtenidos = puntosObtenidos;
    }

    @Override
    public String toString() {
        return "Comparsa{" +"Nombre='" + getNombre() + '\'' +
                ", Autor='" + getAutor() + '\'' +
                ", AutorMusic='" + getAutorMusic() + '\'' +
                ", AutorLetras='" + getAutorLetras() + '\'' +
                ", Disfraz='" + getDisfraz() + '\'' +
                "EmpresaAtrezzo='" + EmpresaAtrezzo + '\'' +
                ", PuntosObtenidos=" + PuntosObtenidos +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Comparsa comparsa = (Comparsa) o;
        return Objects.equals(EmpresaAtrezzo, comparsa.EmpresaAtrezzo) && Objects.equals(PuntosObtenidos, comparsa.PuntosObtenidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), EmpresaAtrezzo, PuntosObtenidos);
    }

    @Override
    public void caminito_del_falla() {
        System.out.println("La comparsa "+getNombre()+" va caminito del falla");
    }

    @Override
    public void cantar_la_presentacion() {
        System.out.println("Cantando la presentacion de la Comparsa con nombre: "+getNombre());
    }
    @Override
    public void hacer_tipo() {
        System.out.println("La Comparsa "+getNombre()+" va de "+getDisfraz());
    }
}
