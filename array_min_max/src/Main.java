import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int [] arry = {32,34,65,78,780,975,-12,-43,65,39,-143};

        int max = arry[0];
        int min = arry[0];

      
        for (int i: arry )
             {  if (i < min){
                 min  = i;
             }
                 if (i > max){
                     max = i;
                 }
            
        }
        System.out.println("Dizinin En Büyük Elemanı: "+max);
        System.out.println("Dizinin En Küçük Elemanı: "+min);
    }
}