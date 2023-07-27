package LinkedList_Methods;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
       // LinkedList<String> placesToVisit=new LinkedList<>();
        var placesToVisit=new LinkedList<String>();

        placesToVisit.add("Sydney");
        placesToVisit.add(0,"Canberra");

        System.out.println(placesToVisit);

        addMoreElements(placesToVisit);
        System.out.println(placesToVisit);

        removeElements(placesToVisit);
        System.out.println(placesToVisit);

        System.out.println(placesToVisit.get(4)); //returns fifth element from the list.
    }

    private static void addMoreElements(LinkedList<String> list){
        list.addFirst("Darwin");
        list.addLast("Hobart");

        //queue methods
        list.offer("Melbourne"); //adds element to tail
        list.offerFirst("Brisbane"); //adds element to start
        list.offerLast("Toowomba");  // adds element to end of list

        //slack methods
        list.push("Alice Springs"); //adds element to start of list, same as addFirst method
        list.pop(); //same as removeFirst method. removes first element from list
        list.addFirst("Alice Springs");


    }

private static void removeElements(LinkedList<String> list){
        list.remove(4); //removes first element from the list if theres no arg, same as removeFirst method, or removes the given index.
//    list.removeLast(); //removes last element from the list;
    list.remove("Brisbane");//removes the element if given element is in the list.

}


}
