import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean flag=true;
        boolean playAgain=false;
        Scanner scanner=new Scanner(System.in);
     while(flag){
         flag=false;

         System.out.println( !playAgain ? """
                 Choose a dice type:
                 1- Default
                 2- I want to change number of faces
                 (press Q to quit program.)
                 """ : """
                     1- Roll again with Default Dice,
                     2- Select new number of faces
                     or Press Q to quit.
                     """);
         String chosenStr=scanner.nextLine().trim();

         if(chosenStr.equals("1")){
             Dice dice=new Dice();
             dice.rollDice();
             playAgain=true;
             flag=true;
         }else if(chosenStr.equals("2")){
            System.out.println("How many faces do you want your dice to have? ");
             String chosenFaces= scanner.nextLine().trim();
             Dice dice=new Dice(Integer.parseInt(chosenFaces));
             dice.rollDice();
             playAgain=true;
             flag=true;


         }else if("qQ".contains(chosenStr)){
             break;
         }else{
             flag=true;
             System.out.println("-".repeat(30));
         }

     }

    }

}