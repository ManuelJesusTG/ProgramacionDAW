import java.util.Arrays;
import java.util.Scanner;

public class EntregableTema3_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] [] v1 = new int [3][4];

        for (int i = 0; i < v1.length ; i++) {
            for (int j = 0; j < v1[i].length ; j++) {
                if (j==0){
                    v1 [i] [j] = 1;
                }
                if (j==1){
                    v1 [i] [j] = 2;
                }
                if (j==2){
                    v1 [i] [j] = 3;
                }
                System.out.print(v1[i][j]);
            }
            System.out.println();
        }

        System.out.println("Introduce el numero de veces que se va a desplazar la matriz");
        int numero = sc.nextInt();

        for (int [] row: desplazarMatriz(v1, numero)){
            System.out.println(Arrays.toString(row));
        }

    } public static int [] [] desplazarMatriz (int [] [] v1, int numero){

        if (numero>3){
            numero = numero%3;
        }
        int n = numero;

        int [][] vfinal = new int [3][4];

        for (int i = 0; i < v1.length ; i++) {
            numero = n;
            for (int j = 0; j < v1[i].length ; j++) {
                if (numero+j < v1[i].length) {
                    vfinal[i][j] = v1[i][j + numero];
                } else {
                    vfinal[i][j] = v1[i][j-numero];
                }
            }

        }

        return vfinal;
    }
}
