import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int number;

        System.out.print("Lütfen Bir Sayı Giriniz: ");
        number = input.nextInt();

        primeNumber(number);

    }

    static void primeNumber(int a){
       boolean asal = true;
       if (a <= 1){
           asal = false;
       }else if (a <= 3){
           asal = true;
       } else if (a % 2 == 0 || a % 3 == 0) {
           asal = false;
       }else
       {
          int i = 5;
          while (i * i <= a){
              if (a % i == 0 || a % (i + 2) == 0){
                  asal = false;
                  break;
              }
              i += 6;
          }
       }
      if (asal){
          System.out.println(a + " Asal Sayıdır ");

      } else {
          System.out.println(a + " Asal Sayı Degildir");
      }
    }
}