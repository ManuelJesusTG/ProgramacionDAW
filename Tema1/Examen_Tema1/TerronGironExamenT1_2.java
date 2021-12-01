import java.util.Scanner;

public class TerronGironExamenT1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int numero;
            int numeroalreves=0;
            int aux=0;

        System.out.println("Introduce un numero");
        numero = sc.nextInt();

        do {
            aux = numero%10;
            numeroalreves = (numeroalreves * 10) + aux;
            numero = numero/10;
        } while (numero>0);

        int cifra;
        do {
            cifra = numeroalreves%10;
            for (int i = 0; i < cifra ; i++) {
                System.out.print("*");
            }
            numeroalreves = numeroalreves/10;
            if (numeroalreves!=0){
                System.out.print("_");
            }
        } while (numeroalreves>0);


    }
}
