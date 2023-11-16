import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     System.out.print("Lütfen Fibonocci Serinizi Giriniz: ");
     int fibonocci = input.nextInt();
     int currentNum = 1;
     int previousNum = 0;
     int nextNum ;//= currentNum + previousNum;


        for (int i = 0; i < fibonocci; i++) {
            System.out.print(currentNum + " ");
            nextNum = currentNum + previousNum;
            previousNum = currentNum;
            currentNum = nextNum;

        }
    }
}