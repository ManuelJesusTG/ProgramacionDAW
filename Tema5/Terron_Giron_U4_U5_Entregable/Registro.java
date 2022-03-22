package EntregableTema5;

import java.util.Arrays;

public class Registro {

    private Propiedad [] propiedades;

    public Registro(Propiedad[] propiedades) {
        this.propiedades = propiedades;
    }

    public Propiedad[] getPropiedades() {
        return propiedades;
    }

    public void setPropiedades(Propiedad[] propiedades) {
        this.propiedades = propiedades;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Registro registro = (Registro) o;
        return Arrays.equals(propiedades, registro.propiedades);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(propiedades);
    }

    @Override
    public String toString() {
        return "Registro{" +
                "propiedades=" + Arrays.toString(propiedades) +
                '}';
    }

    public void informeSuperficie(){
        Arrays.sort(propiedades);
        System.out.println(Arrays.toString(propiedades));
    }
}
