import java.util.Arrays;

public class ExamenTema3_2 {
    public static void main(String[] args) {
        int [] v1= {1,2,3,4,5};
        int [] v2= {11,22,33,44,55,66,77,88,99};


        System.out.println("El ejemplo del ejercicio: "+Arrays.toString(InsertarValor(v1,8,3)));
        System.out.println();
        System.out.println(Arrays.toString(InsertarValor(v2,0,6)));
        System.out.println(Arrays.toString(InsertarValor(v2,5,9)));
        System.out.println(Arrays.toString(InsertarValor(v2,0,0)));
        System.out.println();
        System.out.println("Lo que ocurre cuando te pasas del limite con la posicion:");
        System.out.println(Arrays.toString(InsertarValor(v2,6,300)));
    }
    public static int [] InsertarValor (int v1[],int valor,int pos){

        int [] Resultado = new int[v1.length+1];
        int contador=0;
        int [] NoResultado = {-1};

        if (pos > v1.length){
            System.out.println("La posición que quieres añadir se pasa del limite del vector");
            return NoResultado;
        }else {
            for (int i = 0; i < Resultado.length; i++) {

                if (i == pos) {
                    Resultado[pos] = valor;
                    contador++;
                } else if (contador == 0) {
                    Resultado[i] = v1[i];
                } else {
                    Resultado[i] = v1[i - 1];
                }

            }
        }
        return Resultado;
    }
}

