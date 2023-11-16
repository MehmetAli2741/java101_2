import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        System.out.print("Lütfen Bir Sayı Giriniz: ");
        int number = input.nextInt();

        for(int i = 1; i < number; ++i) {
            if (number % i == 0) {
                count += i;
            }
        }

        if (count == number) {
            System.out.println("" + number + " Mükemmel Sayıdır: ");
        } else {
            System.out.println("" + number + " Mükemmel Sayı Degildir ");
        }    }
}