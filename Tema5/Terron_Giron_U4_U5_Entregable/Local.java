package EntregableTema5;

import java.util.Calendar;
import java.util.Objects;

public abstract class Local extends Propiedad{

    private Personas propietario;
    private Integer Precio;


    public Local(Integer anioConstruccion, String direccion, Integer metrosCuadrados) {
        super(anioConstruccion, direccion, metrosCuadrados);
    }

    public Local(Integer anioConstruccion, String direccion, Integer metrosCuadrados, Personas propietario, Integer precio) {
        super(anioConstruccion, direccion, metrosCuadrados);
        this.propietario = propietario;
        Precio = precio;
    }

    public Personas getPropietario() {
        return propietario;
    }

    public void setPropietario(Personas propietario) {
        this.propietario = propietario;
    }

    public Integer getPrecio() {
        return Precio;
    }

    public void setPrecio(Integer precio) {
        Precio = precio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Local local = (Local) o;
        return propietario.equals(local.propietario) && Precio.equals(local.Precio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), propietario, Precio);
    }

    @Override
    public String toString() {
        return "Local{" +
                "propietario=" + propietario +
                ", Precio=" + Precio +
                '}';
    }
    @Override
    abstract void mostrarPropiedad();
}
