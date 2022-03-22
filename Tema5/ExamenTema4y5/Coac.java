import java.util.Arrays;

public class Coac {

private AgrupacionOficial [] AgrupacionO;
private int NAgrupacionesConcurso = 0;

    public Coac(AgrupacionOficial[] agrupacionO) {
        AgrupacionO = agrupacionO;
    }

    public AgrupacionOficial[] getAgrupacionO() {
        return AgrupacionO;
    }

    public void setAgrupacionO(AgrupacionOficial[] agrupacionO) {
        AgrupacionO = agrupacionO;
    }

    @Override
    public String toString() {
        return "Coac{" +
                "AgrupacionO=" + Arrays.toString(AgrupacionO) +
                ", NAgrupacionesConcurso=" + NAgrupacionesConcurso +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coac coac = (Coac) o;
        return Arrays.equals(AgrupacionO, coac.AgrupacionO);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(AgrupacionO);
    }
    public void incscribir_Agrupacion(AgrupacionOficial agrupacion){
        AgrupacionO = Arrays.copyOf(AgrupacionO,AgrupacionO.length+1);
        AgrupacionO [AgrupacionO.length-1] = agrupacion;
        NAgrupacionesConcurso++;
    }
    public boolean eliminar_agrupacion(AgrupacionOficial agrupacion){

        boolean Result = false;
        AgrupacionOficial [] Resultado = new AgrupacionOficial[AgrupacionO.length-1];

        for (int i = 0; i < AgrupacionO.length ; i++) {
            if (AgrupacionO[i]==agrupacion){
                Result = true;
                NAgrupacionesConcurso--;
            } else{
                Resultado[i] = AgrupacionO[i];
            }
        }

        AgrupacionO = Resultado;
        return Result;

    }
}
