import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int count= 0;
        int[] list = {3,7,11,23,65,3,43,23,75,7};
        for (int i=0; i<list.length;i++){
            for (int j=0; j<list.length;j++){
                if ((i != j) && list[i] == list[j] ){
                    count = list[i];
                    System.out.println(count );

                }
            }

        }
    }
}