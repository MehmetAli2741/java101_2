import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizinin Kaç Elemanlı Olsun?: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        //System.out.printf("Lütfen %d sayı girin:%n", n);

        for (int i = 0; i < n; i++) {
            System.out.printf("%d. eleman: ", i + 1);
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Sıralama: " + Arrays.toString(arr));
    }
}


