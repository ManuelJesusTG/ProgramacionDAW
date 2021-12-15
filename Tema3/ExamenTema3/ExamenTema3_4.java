import java.util.Arrays;

public class ExamenTema3_4 {
    public static void main(String[] args) {
        int [][] v1 = new int[4][4];

        for (int i = 0; i < v1.length ; i++) {
            for (int j = 0; j <v1[i].length ; j++) {
                v1 [i][j]= (int)(Math.random()*90)+10;
            }
        }
        System.out.println("Array Completa");
        for (int [] row: v1) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println("Array sin filas impares");
        for (int [] row2: eliminarFilasImPares(v1)){
            System.out.println(Arrays.toString(row2));
        }
        System.out.println("Array sin filas pares");
        for (int [] row2: eliminarFilasPares(v1)){
            System.out.println(Arrays.toString(row2));
        }


    }
    public static int[][] eliminarFilasPares(int[][] v1){

        int [] [] Resultado = new int[v1.length/2][v1.length];

        for (int i = 0; i < v1.length ; i++) {
            for (int j = 0; j < v1[i].length ; j++) {
                if (i%2==0){
                    Resultado[i/2][j]=v1[i][j];
                }
            }
        }


        return Resultado;
    }

    public static int[][] eliminarFilasImPares(int[][] v1){

        int [] [] Resultado = new int[v1.length/2][v1.length];

        for (int i = 0; i < v1.length ; i++) {
            for (int j = 0; j < v1[i].length ; j++) {
                if (i%2==1){
                    Resultado[i/2][j]=v1[i][j];
                }
            }
        }


        return Resultado;
    }
}
