import java.util.Random;

public class Dice {
    int faces;

    Dice(){
        this(6);
    }
    Dice(int faces){
        this.faces=faces;
    }
     public void rollDice(){
        Random random=new Random();
         int number = random.nextInt(this.faces)+1;
        System.out.println("Number of Dice is: "+number);
     }
}
