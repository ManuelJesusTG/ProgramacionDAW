import java.util.Comparator;
import java.util.Objects;
import java.util.function.ToLongFunction;

public class Criptomoneda extends Divisa {

    private Double Precio_USD;
    private Integer VolumenTransaccion;
    private String FechaCreaccion;
    private Integer Ranking;

    public Criptomoneda(String nombre, String simbolo, String ID, Double precio_USD, Integer volumenTransaccion, String fechaCreaccion, Integer ranking) {
        super(nombre, simbolo, ID);
        Precio_USD = precio_USD;
        VolumenTransaccion = volumenTransaccion;
        FechaCreaccion = fechaCreaccion;
        Ranking = ranking;
    }

    public Double getPrecio_USD() {
        return Precio_USD;
    }

    public void setPrecio_USD(Double precio_USD) {
        Precio_USD = precio_USD;
    }

    public Integer getVolumenTransaccion() {
        return VolumenTransaccion;
    }

    public void setVolumenTransaccion(Integer volumenTransaccion) {
        VolumenTransaccion = volumenTransaccion;
    }

    public String getFechaCreaccion() {
        return FechaCreaccion;
    }

    public void setFechaCreaccion(String fechaCreaccion) {
        FechaCreaccion = fechaCreaccion;
    }

    public Integer getRanking() {
        return Ranking;
    }

    public void setRanking(Integer ranking) {
        Ranking = ranking;
    }

    @Override
    public String toString() {
        return "Criptomoneda{" +
                "Precio_USD=" + Precio_USD +
                ", VolumenTransaccion=" + VolumenTransaccion +
                ", FechaCreaccion='" + FechaCreaccion + '\'' +
                ", Ranking=" + Ranking +
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
        Criptomoneda that = (Criptomoneda) o;
        return Precio_USD.equals(that.Precio_USD) && VolumenTransaccion.equals(that.VolumenTransaccion) && FechaCreaccion.equals(that.FechaCreaccion) && Ranking.equals(that.Ranking);
    }



    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), Precio_USD, VolumenTransaccion, FechaCreaccion, Ranking);
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }


}
