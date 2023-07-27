package iterator_and_listIterator;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();
        ArrayList<String> array= new ArrayList<>(List.of(new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
        list.addAll(array);

        System.out.println(list);
        testIterator(list);
    }
    private static void testIterator(LinkedList<String> list){
        var iterator=list.iterator();
       // var iterator=list.listIterator()
       //only difference between listIterator and iterator is you can move backwards with listIterator
        while(iterator.hasNext()){
            String current=iterator.next();

            if(current=="5"){
                System.out.println(current +" --> this is five");

            }else{
                System.out.println(current);
            }
        }
        System.out.println(list);
    }
}
