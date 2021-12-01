import java.util.Scanner;

public class EjercicioEntregable2_2021_MJTG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int cifra;
        int aux;
        int numeroin=0;
        int a;
        int ocurrencias=0;
        int posiciones=0;

        System.out.println("Introduce un numero positivo");
        numero = sc.nextInt();
        System.out.println("Introduce una cifra a eliminar (entre 0 y 9)");
        cifra = sc.nextInt();
        aux=numero;
        if (numero < 0){
            System.out.println("El numero es negativo");
        } else if (cifra <0 || cifra >9){
            System.out.println("la cifra no es valida");
        } else {
            do {
                 a = aux%10;
                 if (a==cifra) {
                     posiciones++;
                     ocurrencias++;
                     System.out.println("Ocurrencia en la Posición "+posiciones);
                 } else {
                     posiciones++;
                     numeroin = numeroin * 10 + a;
                 }
                aux = aux / 10;
            } while (aux>0);
            System.out.println("Numero de ocurrencias "+ocurrencias);
            System.out.println("El numero final sin la cifra seria "+numeroin);
        }
    }
}
