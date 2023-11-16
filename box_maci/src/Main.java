
public class Main {
    public static void main(String[] args) {
Fighter f1 = new Fighter("Enes",10,120,100,50);
Fighter f2 = new Fighter("Bera",20,85,85,50);

Match match =new Match(f1,f2,80,100);
match.run();
match.firstRandom();


    }
}