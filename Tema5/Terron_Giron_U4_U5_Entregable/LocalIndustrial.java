package EntregableTema5;

import java.util.Calendar;
import java.util.Objects;

public class LocalIndustrial extends Local{

    private Integer ConsumoEnergetico;

    public LocalIndustrial(Integer anioConstruccion, String direccion, Integer metrosCuadrados, Personas propietario, Integer precio, Integer consumoEnergetico) {
        super(anioConstruccion, direccion, metrosCuadrados, propietario, precio);
        ConsumoEnergetico = consumoEnergetico;
    }

    public Integer getConsumoEnergetico() {
        return ConsumoEnergetico;
    }

    public void setConsumoEnergetico(Integer consumoEnergetico) {
        ConsumoEnergetico = consumoEnergetico;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        LocalIndustrial that = (LocalIndustrial) o;
        return Objects.equals(ConsumoEnergetico, that.ConsumoEnergetico);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), ConsumoEnergetico);
    }

    @Override
    public String toString() {
        return "LocalIndustrial{" +
                "ConsumoEnergetico=" + ConsumoEnergetico +
                '}';
    }

    @Override
    void mostrarPropiedad() {
        Calendar c = Calendar.getInstance();

        String dia, mes, annio;

        dia = Integer.toString(c.get(Calendar.DATE));
        mes = Integer.toString(c.get(Calendar.MONTH));
        annio = Integer.toString(c.get(Calendar.YEAR));

        System.out.println (dia + "/" + mes +"/" + annio+" Desde Local Comercial");
    }

}
