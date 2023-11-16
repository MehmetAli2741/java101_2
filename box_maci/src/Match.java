public class Match {
    Fighter f1; // dövüşcü 1
    Fighter f2; // dövüşcü 2
    int minWeight; // minumum kilo(agırlık)
    int maxWeight; // maximum kilo
   Fighter first;


    Match(Fighter f1,Fighter f2,int minWeight,int maxWeight){
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }
    void firstRandom(){
        double randomFirst = Math.random();
        if (randomFirst < 0.5){
            first = f1;

        }else{
            first = f2;
        }
        System.out.println("İlk Başlayan Sporcu: "+first.name);

    }


    void run(){
      if (isCheck()){
          while (this.f1.health > 0 && this.f2.health >0){
              System.out.println("========YENİ ROUND=======");
              firstRandom();

              this.f2.health = this.f1.hit(f2);
              if (isWin()){
                  break;
              }
              //firstRandom();
              this.f1.health = this.f2.hit(f1);
              System.out.println("Enes:"+this.f1.health + "  " +"Bera:"+this.f2.health);
              if (isWin()){
                  break;
              }
              System.out.println(this.f1.name + "   Saglık   " + this.f1.health);
              System.out.println(this.f2.name + "   Saglık   " + this.f2.health);



          }

      }else {
          System.out.println("Sporcuların Sikletleri Uymuyor. ");
      }
    }

    boolean isCheck(){
        return (this.f1.weight > this.minWeight && this.f1.weight <= this.maxWeight) &&
                (this.f2.weight > this.minWeight && this.f2.weight <= this.maxWeight);


    }
    boolean isWin(){
        if (this.f1.health == 0){
            System.out.println(this.f2.name + "  Kazandı");
            firstRandom();
            return true;
        }
        if (this.f2.health == 0){
            System.out.println(this.f1.name + "  Kazandı");
            firstRandom();
            return true;

        }
        return false;
    }



}
