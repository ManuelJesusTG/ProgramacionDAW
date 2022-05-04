import java.util.Objects;

public class Fiat extends Divisa {

    private String PaisDeReferencia;

    public Fiat(String nombre, String simbolo, String ID, String paisDeReferencia) {
        super(nombre, simbolo, ID);
        PaisDeReferencia = paisDeReferencia;
    }

    public String getPaisDeReferencia() {
        return PaisDeReferencia;
    }

    public void setPaisDeReferencia(String paisDeReferencia) {
        PaisDeReferencia = paisDeReferencia;
    }

    @Override
    public String toString() {
        return "Fiat{" +
                "PaisDeReferencia='" + PaisDeReferencia + '\'' +
                '}';
    }

    @Override
    public int compare(Object o, Object t1) {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Fiat fiat = (Fiat) o;
        return PaisDeReferencia.equals(fiat.PaisDeReferencia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), PaisDeReferencia);
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }


}
