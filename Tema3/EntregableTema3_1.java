import java.util.Arrays;

public class EntregableTema3_1 {
    public static void main(String[] args) {

        int [] v1 = {1,45,32,6,12,54};
        int [] v2 = {1,23,4,6,12};
        int [] v3 = {4,23,32,12,54,6};

        System.out.println("v1,v2: ");
        System.out.println(Arrays.toString(interseccionVectores(v1,v2)));

        System.out.println("v1,v3: ");
        System.out.println(Arrays.toString(interseccionVectores(v1,v3)));

        System.out.println("v2,v3: ");
        System.out.println(Arrays.toString(interseccionVectores(v2,v3)));
    }
    public static int [] interseccionVectores (int [] v1, int [] v2){

        int [] vfinal = new int[0];

        for (int i = 0; i < v1.length ; i++) {
            for (int j = 0; j < v2.length ; j++) {
                if (v1[i] == v2[j]) {
                    vfinal = Arrays.copyOf(vfinal, vfinal.length+1);
                    vfinal [vfinal.length-1] = v1[i];
                }
            }
        }
        return vfinal;
    }
}
