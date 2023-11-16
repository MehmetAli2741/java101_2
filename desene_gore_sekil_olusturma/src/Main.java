import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen Bir Sayı Giriniz: ");
        int number = input.nextInt();
        shape(number);


    }
    static void shape(int a){
       int result = 0;
       int temp = a;
       while (temp > 0){
           System.out.println("Aktif Sayı: " + temp);
           temp -= 5;
           result = temp;
       }System.out.println(temp);
      while (temp < a){
          System.out.println("Aktif Sayı: " + temp);
          temp += 5;


      }System.out.println("Aktif Sayı: " + temp);

    }
}