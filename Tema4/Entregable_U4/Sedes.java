package Entregable_U4;

import java.util.Arrays;

public class Sedes {

    private String Codigo_Sede;
    private Ciudad Ciudad;
    private Opositor [] Opositor;
    private int CapacidadOpositores;

    public Sedes(String codigo_Sede, Entregable_U4.Ciudad ciudad, Entregable_U4.Opositor[] opositor, int capacidadOpositores) {
        Codigo_Sede = codigo_Sede;
        Ciudad = ciudad;
        Opositor = opositor;
        CapacidadOpositores = capacidadOpositores;
    }

    public String getCodigo_Sede() {
        return Codigo_Sede;
    }

    public void setCodigo_Sede(String codigo_Sede) {
        Codigo_Sede = codigo_Sede;
    }

    public Entregable_U4.Ciudad getCiudad() {
        return Ciudad;
    }

    public void setCiudad(Entregable_U4.Ciudad ciudad) {
        Ciudad = ciudad;
    }

    public Entregable_U4.Opositor[] getOpositor() {
        return Opositor;
    }

    public void setOpositor(Entregable_U4.Opositor[] opositor) {
        Opositor = opositor;
    }

    public int getCapacidadOpositores() {
        return CapacidadOpositores;
    }

    public void setCapacidadOpositores(int capacidadOpositores) {
        CapacidadOpositores = capacidadOpositores;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sedes sedes = (Sedes) o;
        return Arrays.equals(Opositor, sedes.Opositor);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(Opositor);
    }

    private boolean Esta (Opositor a){

        for (int i = 0; i < Opositor.length ; i++) {
            if (a == Opositor[i]){
                return true;
            }
        }
        return false;
    }

    private boolean addOpositor(Opositor a){
        if (CapacidadOpositores<Opositor.length){
            return false;
        }
        if (!Esta(a)){
            return false;
        }

        Opositor [] resultado = new Opositor[Opositor.length+1];

        for (int i = 0; i < resultado.length ; i++) {
            if (Opositor.length+1==i){
                resultado [i] = a;
            }
        }
        resultado = Opositor;
        return true;
    }

    private boolean delOpositor(Opositor a){
        Opositor [] Resultado = new Opositor[Opositor.length-1];

        for (int i = 0; i < Opositor.length ; i++) {
            if (Opositor[i]==a){

            }
            else {
                Resultado [i] = Opositor [i];
            }
        }
        Resultado = Opositor;
        return true;
    }

    @Override
    public String toString() {
        return "Sedes{" +
                "Codigo_Sede='" + Codigo_Sede + '\'' +
                ", Ciudad=" + Ciudad +
                ", Opositor=" + Arrays.toString(Opositor) +
                ", CapacidadOpositores=" + CapacidadOpositores +
                '}';
    }
}
