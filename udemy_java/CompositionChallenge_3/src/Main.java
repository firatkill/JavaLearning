// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
/*Item coke=new Item("drink","coke",1.50);
coke.printItem();
coke.setSize("LARGE");
coke.printItem();

System.out.println("_ _ _ _ _ _ _ _ _ ");

Item avocado=new Item("Topping","avocado",1.50);
avocado.printItem();*/

/*
        Burger burger=new Burger("regular",4.00);
        burger.addToppings("BACON","CHEESE","MAYO");
        burger.printItem();
*/

/*
        MealOrder regularMeal=new MealOrder();

        regularMeal.setDrinkSize("LARGE");
        regularMeal.addBurgerToppings("BACON","CHEESE","MAYO");

        regularMeal.printItemizedList();
*/

/*
        MealOrder secondMeal=new MealOrder("turkey","7-up","chili");

        secondMeal.addBurgerToppings("LETTUCE","CHEESE","MAYO");
        secondMeal.setDrinkSize("SMALL");
        secondMeal.printItemizedList();
*/


        MealOrder deluxeMEal=new MealOrder("deluxe","7-up","chili");

        deluxeMEal.addBurgerToppings("AVOCADO","BACON","LETTUCE","CHEESE","MAYO");
        deluxeMEal.setDrinkSize("SMALL");

        deluxeMEal.printItemizedList();


    }
}