import java.util.Scanner;
public class Main {
// Polindrom sayı:iki taraftan okundugu zaman okunuş yönüyle aynı olan sayılardır
    static boolean ispolindrom(int number){
        int temp = number,reverseNumber = 0, lastNumber;

        while (temp != 0){
            //System.out.println("===========================");
            //System.out.println("Sayı => " + temp);

            lastNumber = temp % 10;
            //System.out.println("Son Basamak => " + lastNumber);

            reverseNumber = (reverseNumber * 10) + lastNumber;
            //System.out.println("Yeni Sayı => " + reverseNumber);

            temp /= 10;
            //System.out.println("Yeni Temp =>" + temp);


        }
        if (number == reverseNumber)
        return true;
        else
            return false;
    }
    public static void main(String[] args) {

        //ispolindrom(2476);
        System.out.println(ispolindrom(989));
    }
}