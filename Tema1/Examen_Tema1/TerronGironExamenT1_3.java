import java.util.Random;

public class TerronGironExamenT1_3 {
    public static void main(String[] args) {
        String palo1="Picas";
        String palo2="Diamantes";
        String palo3="Corazones";
        String palo4="Treboles";
        int palo = (int)(Math.random()*4);
        int carta = (int)(Math.random()*9);

        if (carta==0){
            carta=1;
        }

        if (palo==0){
            System.out.println("Palo - "+palo1);
        }else if (palo==1){
            System.out.println("Palo - "+palo2);
        } else if (palo==2){
            System.out.println("Palo - "+palo3);
        } else if (palo==3){
            System.out.println("Palo - "+palo4);
        }

        if (carta==1) {
            int carta1 = (int)(Math.random()*4);
            if (carta1==1){
                System.out.println("Carta: J");
            } else if (carta1==2){
                System.out.println("Carta: Q");
            } else if (carta1==3){
                System.out.println("Carta: K");
            } else if (carta1==0){
                System.out.println("Carta: A");
            }
        } else {
            System.out.println("Carta: "+carta);
        }
    }
}
