import java.util.Arrays;
import java.util.Scanner;

public class ExamenTema3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] v1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] v2 = {5, 6, 7, 8, 9, 1, 2, 3, 4};
        int[] v3 = {10, 23, 43, 56};
        int[] ejemplo = {1,2,4};
        int[] ejemplo2 = {3,4,5,6,7,8};

        System.out.println(Arrays.toString(mediaVectores(ejemplo,ejemplo2)));

        System.out.println(Arrays.toString(mediaVectores(v1, v2)));
        System.out.println(Arrays.toString(mediaVectores(v2, v3)));
        System.out.println(Arrays.toString(mediaVectores(v1, v3)));


        System.out.println("Introduce el tamaño del vector 1");
        int [] v4 = new int[sc.nextInt()];
        System.out.println("Introduce el tamaño del vector 2");
        int [] v5 = new int[sc.nextInt()];
        System.out.println("Rellena el vector 1");
        for (int i = 0; i < v4.length ; i++) {
            v4[i]= sc.nextInt();
        }
        System.out.println("Rellena el vector 2");
        for (int i = 0; i <v5.length ; i++) {
            v5[i]= sc.nextInt();
        }

        System.out.println(Arrays.toString(mediaVectores(v4,v5)));

    }

    public static float[] mediaVectores(int[] v1, int[] v2) {
        float[] Resultado = new float[0];
        if (v1.length > v2.length) {
            for (int i = 0; i < v1.length; i++) {
                if (v2.length > i) {
                    Resultado = Arrays.copyOf(Resultado, Resultado.length + 1);
                    Resultado[i] = (v1[i] + v2[i]) / 2;
                } else {
                    Resultado = Arrays.copyOf(Resultado, Resultado.length + 1);
                    Resultado[i] = v1[i];
                }
            }
        } else {
            for (int i = 0; i < v2.length; i++) {
                if (v1.length > i) {
                    Resultado = Arrays.copyOf(Resultado, Resultado.length + 1);
                    Resultado[i] = (v1[i] + v2[i]) / 2;
                } else {
                    Resultado = Arrays.copyOf(Resultado, Resultado.length + 1);
                    Resultado[i] = v2[i];
                }
            }
        }
        return Resultado;
    }
}