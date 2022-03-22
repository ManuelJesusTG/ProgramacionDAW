package EntregableTema5;

import java.util.Calendar;
import java.util.Objects;

public class LocalComercial extends Local implements MostrarPrecioVenta{

    private String Actividad;


    public LocalComercial(Integer anioConstruccion, String direccion, Integer metrosCuadrados, Personas propietario, Integer precio, String actividad) {
        super(anioConstruccion, direccion, metrosCuadrados, propietario, precio);
        Actividad = actividad;
    }


    public String getActividad() {
        return Actividad;
    }

    public void setActividad(String actividad) {
        Actividad = actividad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        LocalComercial that = (LocalComercial) o;
        return Actividad.equals(that.Actividad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), Actividad);
    }

    @Override
    public String toString() {
        return "LocalComercial{" +
                "Actividad='" + Actividad + '\'' +
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

    @Override
    public void MostrarPrecioVenta() {
        System.out.println("Soy un LocalComercial que me dedico a "+Actividad+" y valgo "+getPrecio());
    }

    @Override
    public int compareTo(Propiedad o) {
        return 0;
    }
}
