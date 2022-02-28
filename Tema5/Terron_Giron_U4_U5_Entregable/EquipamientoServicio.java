package EntregableTema5;

import java.util.Calendar;
import java.util.Objects;

public class EquipamientoServicio extends Local{

    private TipoServicio tipo;


    public EquipamientoServicio(Integer anioConstruccion, String direccion, Integer metrosCuadrados, Personas propietario, Integer precio, TipoServicio tipo) {
        super(anioConstruccion, direccion, metrosCuadrados, propietario, precio);
        this.tipo = tipo;
    }

    public TipoServicio getTipo() {
        return tipo;
    }

    public void setTipo(TipoServicio tipo) {
        this.tipo = tipo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        EquipamientoServicio that = (EquipamientoServicio) o;
        return tipo == that.tipo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), tipo);
    }

    @Override
    public String toString() {
        return "EquipamientoServicio{" +
                "tipo=" + tipo +
                '}';
    }

    @Override
    void mostrarPropiedad() {
        Calendar c = Calendar.getInstance();

        String dia, mes, annio;

        dia = Integer.toString(c.get(Calendar.DATE));
        mes = Integer.toString(c.get(Calendar.MONTH));
        annio = Integer.toString(c.get(Calendar.YEAR));

        System.out.println (dia + "/" + mes +"/" + annio+" Desde Equipamiento y Servicio");
    }

    @Override
    public int compareTo(Propiedad o) {
        return 0;
    }
}
