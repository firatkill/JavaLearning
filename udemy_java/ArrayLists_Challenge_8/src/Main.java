import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList <String> groceryList = new ArrayList<String>();
        groceryList.add("Potato");
        groceryList.addAll(List.of("Potato","Tomato"));
        System.out.println(groceryList);
        boolean flag=true;
        while(flag){
             flag=false;
            System.out.println("""
Available Actions:
0 - to shutDown
1 - to add item(s) to list (comma delimited list)
2 - to remove any items (comma delimited list)
Enter a number for which action you want to do:
""");
           String pressed = scanner.nextLine().trim();


            if ("012".contains(pressed) == false) {
                System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
                System.out.println("Please enter a valId optIon.".toUpperCase());
                System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
                flag=true;
            }else{

                if(Integer.parseInt(pressed) == 0 ){
                    System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
                    System.out.println("Quitting Program..");
                    System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
                    break;
                }else if(Integer.parseInt(pressed) == 1 ){
                    System.out.println("Enter value to add to groceries list. You can add multiple values by seperating each value with a comma");
                    String nextLine=scanner.nextLine().trim();

                    if(nextLine.trim().isEmpty()){
                        System.out.println("no values");
                    }else{
                       String[] nextLineArr= nextLine.split(",");

                        groceryList.addAll(List.of(nextLineArr));

                      System.out.println(groceryList);
                    }


                }else if(Integer.parseInt(pressed)==2){
 System.out.println("Enter a item name to delete from list:");

                        String itemToRemove=scanner.nextLine().trim();

                        if(groceryList.contains(itemToRemove)){
                            for(int i=0;i<groceryList.size();i++){

                                if(groceryList.get(i).equals(itemToRemove)) {

                                    groceryList.remove(i);
                                    System.out.println("İtem deleted. New List is:");
                                    System.out.println(groceryList);
                                    break;
                                }
                        }
                        }else{
                            System.out.println("looks like theres no such item.");
                        }

                }else{
                    System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
                    System.out.println("Please enter a valId and only one optIon.".toUpperCase());
                    System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
                    flag=true;
                }
            }

            flag=true;
        }

    }

}
