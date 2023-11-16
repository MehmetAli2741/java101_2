import java.util.Random;
public class Fighter {
    String name;
    int damage; // hasar
    int health; // dayanıklık (gücü)
    int weight; // agırlık(siklet)
    int dodge; // kaçınmak (savunmak)



    Fighter(String name,int damage,int health,int weight,int dodge){
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;


    }
    int hit(Fighter foe){
        System.out.println(this.name + " => " + foe.name + " " + this.damage + " Hasar Vurdu. " );

        if (isDodge()){
            System.out.println(foe.name + " Gelen Hasarı Blokladı ");
            return foe.health;
        }
        if (foe.health - this.damage < 0){
            return 0;
        }
        return foe.health - this.damage;
    }
    boolean isDodge(){
        double randomNumber = Math.random() * 100;
        return randomNumber <= this.dodge;
    }



}
