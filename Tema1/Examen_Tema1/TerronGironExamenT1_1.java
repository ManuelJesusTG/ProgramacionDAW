import java.util.Scanner;

public class TerronGironExamenT1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int altura;

        System.out.println("Introduce la altura");
        altura = sc.nextInt();
        int nast=1;
        int nespacios=altura-1;

        while (altura<4){
            System.out.println("Altura incorrecta, introduce una altura mayor o igual a 4");
            altura = sc.nextInt();
            nespacios=altura-3;
        }
        for (int i = 0; i < nespacios ; i++) {
            System.out.print(" ");
        }
        System.out.print("*");
        System.out.println();
        for (int i = 0; i < altura ; i++) {
            if (i == altura - 1) {
                for (int j = 0; j < nast ; j++) {
                    System.out.print("^");
                }
                System.out.println();
            } else {
                for (int j = 0; j < nespacios; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < nast; j++) {
                    if (j == 0 || j == nast - 1) {
                        System.out.print("^");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
                nespacios--;
                nast++;
                nast++;
            }
        }
        nespacios = altura-1;
        for (int i = 0; i < nespacios ; i++) {
            System.out.print(" ");
        }
        System.out.print("Y");
    }
}
