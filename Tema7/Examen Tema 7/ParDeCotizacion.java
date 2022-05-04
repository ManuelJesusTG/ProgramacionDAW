import java.util.Objects;

public class ParDeCotizacion {

    private Double DivisaBase;
    private Double DivisaCotizada;
    private Double Precio;
    private Integer VariacionPorcentual;
    private Divisa Divisa;

    public ParDeCotizacion(Double divisaBase, Double divisaCotizada, Double precio, Integer variacionPorcentual, Divisa divisa) {
        DivisaBase = divisaBase;
        DivisaCotizada = divisaCotizada;
        Precio = precio;
        VariacionPorcentual = variacionPorcentual;
        Divisa = divisa;
    }

    public Double getDivisaBase() {
        return DivisaBase;
    }

    public void setDivisaBase(Double divisaBase) {
        DivisaBase = divisaBase;
    }

    public Double getDivisaCotizada() {
        return DivisaCotizada;
    }

    public void setDivisaCotizada(Double divisaCotizada) {
        DivisaCotizada = divisaCotizada;
    }

    public Double getPrecio() {
        return Precio;
    }

    public void setPrecio(Double precio) {
        Precio = precio;
    }

    public Integer getVariacionPorcentual() {
        return VariacionPorcentual;
    }

    public void setVariacionPorcentual(Integer variacionPorcentual) {
        VariacionPorcentual = variacionPorcentual;
    }

    public Divisa getDivisa() {
        return Divisa;
    }

    public void setDivisa(Divisa divisa) {
        Divisa = divisa;
    }

    @Override
    public String toString() {
        return "ParDeCotizacion{" +
                "DivisaBase=" + DivisaBase +
                ", DivisaCotizada=" + DivisaCotizada +
                ", Precio=" + Precio +
                ", VariacionPorcentual=" + VariacionPorcentual +
                ", Divisa=" + Divisa +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ParDeCotizacion that = (ParDeCotizacion) o;
        return DivisaBase.equals(that.DivisaBase) && DivisaCotizada.equals(that.DivisaCotizada) && Precio.equals(that.Precio) && VariacionPorcentual.equals(that.VariacionPorcentual) && Divisa.equals(that.Divisa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(DivisaBase, DivisaCotizada, Precio, VariacionPorcentual, Divisa);
    }
}
