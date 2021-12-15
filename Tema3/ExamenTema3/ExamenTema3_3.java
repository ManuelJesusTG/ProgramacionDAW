import java.util.Arrays;
import java.util.Scanner;

public class ExamenTema3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.println("Introduce un numero entero");
        num = sc.nextInt();

        int[][] v1 = new int[num][num];

        for (int i = 0; i < v1.length; i++) {
            for (int j = 0; j < v1[i].length; j++) {
                v1[i][j] = (int) (Math.random() * 100) + 100;
            }

        }

        for (int[] row : v1) {
            System.out.println(Arrays.toString(row));
        }

        System.out.println("El numero de picos en la matriz es: "+numPicos(v1));

    }

    public static int numPicos(int[][] v1) {

        int contador = 0;

        for (int i = 0; i < v1.length; i++) {
            for (int j = 0; j < v1[i].length; j++) {

                if (j == 0 && i == 0) {
                    if (v1[i][j] > v1[i][j + 1] && v1[i][j] > v1[i + 1][j] && v1[i][j] > v1[i + 1][j + 1]) {
                        contador++;
                    }
                }
                if (j != v1[i].length && j != 0 && i != v1[i].length && i!= 0 ){
                    if (v1[i][j] > v1[i][j + 1] && v1[i][j] > v1[i + 1][j] && v1[i][j] > v1[i + 1][j + 1] && v1[i][j] > v1[i - 1][j - 1] && v1[i][j] > v1[i][j - 1] && v1[i][j] > v1[i -1][j]){
                        contador++;
                    }
                }
            }
        }
        return contador;
    }
}
