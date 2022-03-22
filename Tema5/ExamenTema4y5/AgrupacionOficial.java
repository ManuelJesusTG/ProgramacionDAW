import java.util.Arrays;
import java.util.Objects;

public abstract class AgrupacionOficial extends Agrupacion{


    private Integrantes[] Integrantes;

    public AgrupacionOficial(String nombre, String autor, String autorMusic, String autorLetras, String disfraz) {
        super(nombre, autor, autorMusic, autorLetras, disfraz);
    }

    public Integrantes[] getIntegrantes() {
        return Integrantes;
    }

    public void setIntegrantes(Integrantes[] integrantes) {
        Integrantes = integrantes;
    }

    @Override
    public String toString() {
        return "AgrupacionOficial{" +
                ", Integrantes=" + Arrays.toString(Integrantes) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        AgrupacionOficial that = (AgrupacionOficial) o;
        return Arrays.equals(Integrantes, that.Integrantes);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + Arrays.hashCode(Integrantes);
        return result;
    }

    public void Insertar_Integrante(Integrantes i){

        Integrantes = Arrays.copyOf(Integrantes,Integrantes.length+1);
        Integrantes[Integrantes.length-1] = i;

    }
    public boolean Eliminar_Integrante(Integrantes i){
        boolean Eliminar = false;
        Integrantes [] Resultado = new Integrantes[Integrantes.length-1];
        for (int j = 0; j < Integrantes.length ; j++) {
            if (Integrantes[j] == i ){
                Eliminar = true;
            } else{
                Resultado [j] = Integrantes[j];
            }
        }
        Resultado = Integrantes;
        return Eliminar;
    }
    public abstract void caminito_del_falla();
}
