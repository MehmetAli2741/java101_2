import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] list1 = {3,4,6,7,9,};
        double sum = 0;

        for (int i = 0; i < list1.length;i++){
            sum += 1 + (1/list1[i]);
        }
        //double avarege = sum / list1.length;
        System.out.println(Arrays.toString(list1));
        System.out.println(sum);

    }
}