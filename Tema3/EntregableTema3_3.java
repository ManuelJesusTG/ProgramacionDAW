import java.util.Arrays;
import java.util.Scanner;

public class EntregableTema3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;
        int [] diagonal = new int[0];
        double suma=0;
        int max=0;
        int min=0;

        System.out.println("Introduce el tamaño del array");
        a = sc.nextInt();

        int [] [] array = new int [a] [a];

        System.out.println("Array entero: ");
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                array[i][j] = (int) (Math.random()*47)+18;
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                if (i == j){
                    diagonal = Arrays.copyOf(diagonal, diagonal.length+1);
                    diagonal [diagonal.length-1] = array[i][j];
                }
            }
        }
        for (int i = 0; i < diagonal.length ; i++) {
            suma = suma + diagonal[i];
            if (i==0){
                min = diagonal[i];
                max = diagonal[i];
            }
            if (min> diagonal[i]){
                min = diagonal[i];
            }
            if (max < diagonal[i]){
                max = diagonal[i];
            }
        }

        System.out.println();
        System.out.println("Numeros de la diagonal de la linea superior izquierda a la linea inferior derecha: ");
        System.out.println(Arrays.toString(diagonal));
        System.out.println("El maximo de los numeros de la diagonal es: ");
        System.out.println(max);
        System.out.println("El minimo de los numeros de la diagonal es: ");
        System.out.println(min);
        System.out.println("La media de los numeros de la diagonal es: ");
        System.out.println(suma/ diagonal.length);

    }
}
