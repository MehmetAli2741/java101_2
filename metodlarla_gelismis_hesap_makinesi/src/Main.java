import java.util.Scanner;
public class Main {

    static int toplama(int a,int b){
        int result = a + b;
        return result;
    }

    static int cıkarma(int a,int b){
        int result = a - b;
        return result;
    }
     static  int carpma(int a,int b){
        int result = a * b;
        return result;
     }

     static int bolme(int a,int b){
        int result = a / b;
        return result;
     }


    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int select;


String menu = "1-Toplama İşlemi\n" +
        "2-Çıkarma İşlemi\n" +
        "3-Çarpma İşlemi\n" +
        "4-Bölme İşlemi\n" +
        "5-Üslü Sayı Hesaplama\n" +
        "6-Mod Alma\n" +
        "7-Dikdörtgen Alan Ve Çevre Hesabı\n" +
        "0-Çıkış Yap";
        System.out.println(menu);

        while (true){
            System.out.print("Lütfen Bir İşlem Seçiniz: ");
            select = input.nextInt();

           if (select >= 0 && select <= 7){
               System.out.print("Lütfen 1.Sayıyı Giriniz: ");
               int a = input.nextInt();
               System.out.print("Lütfen 2.Sayıyı Giriniz: ");
               int b = input.nextInt();
               switch (select){
                   case 1:
                       System.out.println("Sonuç: "+toplama(a,b));
                       break;
                   case 2:
                       System.out.println("Sonuç: "+cıkarma(a,b));
                       break;

                   case 3:
                       System.out.println("Sonuç: "+carpma(a,b));
                       break;

                   case 4:
                       System.out.println("Sonuç: " + bolme(a,b));
                       break;


               }
           }else {
               System.out.println("Lütfen Geçerli Bir İşlem Seçiniz...");
           }

        }


    }
}