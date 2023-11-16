import java.util.Scanner;
public class Main {

    static int calculation(int a, int b){
        int result = 1;
        if (b == 0){
            return 1;
        }
        for (int i = 1; i <= b; i++){
            result *= a;
        }
        return result;
    }
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int a,b;
       boolean active = true;
       char select = 'q';
       while (active = true){
           System.out.print("Taban Giriniz: ");
           a = input.nextInt();
           System.out.print("Üs Giriniz: ");
           b = input.nextInt();

           System.out.println("Sonuç: "+calculation(a,b));

       }

    }
}