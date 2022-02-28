package EntregableTema5;

import sun.security.jca.GetInstance;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Objects;

public class Vivienda extends Propiedad implements MostrarPrecioVenta {

    private Integer Banios;
    private Integer Habitaciones;
    private Integer CapacidadMax;
    private Integer Precio;
    private Personas [] persona;

    public Vivienda(Integer anioConstruccion, String direccion, Integer metrosCuadrados) {
        super(anioConstruccion, direccion, metrosCuadrados);
    }

    public Vivienda(Integer anioConstruccion, String direccion, Integer metrosCuadrados, Integer banios, Integer habitaciones, Integer capacidadMax, Integer precio, Personas[] persona) {
        super(anioConstruccion, direccion, metrosCuadrados);
        Banios = banios;
        Habitaciones = habitaciones;
        CapacidadMax = capacidadMax;
        Precio = precio;
        this.persona = persona;
    }

    public Integer getBanios() {
        return Banios;
    }

    public void setBanios(Integer banios) {
        Banios = banios;
    }

    public Integer getHabitaciones() {
        return Habitaciones;
    }

    public void setHabitaciones(Integer habitaciones) {
        Habitaciones = habitaciones;
    }

    public Integer getCapacidadMax() {
        return CapacidadMax;
    }

    public void setCapacidadMax(Integer capacidadMax) {
        CapacidadMax = capacidadMax;
    }

    public Integer getPrecio() {
        return Precio;
    }

    public void setPrecio(Integer precio) {
        Precio = precio;
    }

    public Personas[] getPersona() {
        return persona;
    }

    public void setPersona(Personas[] persona) {
        this.persona = persona;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Vivienda vivienda = (Vivienda) o;
        return Objects.equals(Banios, vivienda.Banios) && Objects.equals(Habitaciones, vivienda.Habitaciones) && Objects.equals(CapacidadMax, vivienda.CapacidadMax) && Objects.equals(Precio, vivienda.Precio) && Arrays.equals(persona, vivienda.persona);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(super.hashCode(), Banios, Habitaciones, CapacidadMax, Precio);
        result = 31 * result + Arrays.hashCode(persona);
        return result;
    }

    @Override
    public String toString() {
        return "Vivienda{" +
                "Banios=" + Banios +
                ", Habitaciones=" + Habitaciones +
                ", CapacidadMax=" + CapacidadMax +
                ", Precio=" + Precio +
                ", persona=" + Arrays.toString(persona)+
                '}'+"\n";
    }

    @Override
    void mostrarPropiedad() {
        Calendar c = Calendar.getInstance();

        String dia, mes, annio;

        dia = Integer.toString(c.get(Calendar.DATE));
        mes = Integer.toString(c.get(Calendar.MONTH));
        annio = Integer.toString(c.get(Calendar.YEAR));

        System.out.println (dia + "/" + mes +"/" + annio+" Desde Vivienda");
    }


    public boolean SiEsta(Personas p1){
        for (int i = 0; i < getPersona().length ; i++) {
            if (p1 == getPersona()[i]){
                return true;
            }
        }
        return false;
    }

    public void AddPersona(Personas p1){
        Personas [] gp1 = new Personas[getPersona().length+1];
        gp1 = getPersona();

        if (SiEsta(p1)){
            return;
        } else {
            for (int i = 0; i < gp1.length ; i++) {
                if (i == getPersona().length){
                    gp1[i]=p1;
                }
            }
            setPersona(gp1);
        }

    }

    @Override
    public void MostrarPrecioVenta() {
        System.out.println("Soy una Vivienda con capacidad máxima "+CapacidadMax+" y valgo"+Precio);
    }

    @Override
    public int compareTo(Propiedad o) {
        return 0;
    }
}
