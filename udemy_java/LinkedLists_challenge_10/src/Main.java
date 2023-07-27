import java.util.Arrays;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<Place> placeList=new LinkedList<>();


        placeList.add(new Place("Adeliade",1374));
        placeList.add(new Place("Alice Springs",2771));
        placeList.add(new Place("Brisbane",917));
        placeList.add(new Place("Darwin",3972));
        placeList.add(new Place("Melbourne",877));
        placeList.add(new Place("Perth",3923));

        placeList=sortList(placeList);


        userInterface(placeList);
    }

    public static LinkedList<Place> sortList(LinkedList<Place> list){
        list.addFirst(new Place("Sydney",0));

Place temp;
        for(int i=0;i<list.size()-1;i++){
          for(int k=list.size()-1;k>=i;k--){
              if(list.get(i).distance()>list.get(k).distance()){
                  temp=list.get(i);
                  list.set(i,list.get(k));
                  list.set(k,temp);
              }
          }
        }
return list;
    }

    public static void userInterface(LinkedList<Place> list){
        var iterator=list.listIterator();
        Scanner scanner=new Scanner(System.in);
        boolean showList=true;
        boolean flag=true;
        System.out.println(list.get(0));
        while(flag){
            System.out.println(showList? """
                    Press Keys to control program:
                    (F)orward
                    (B)ackward
                    (L)ist Places
                    (M)enu
                    (Q)uit
                    """:"_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
            String pressed=scanner.nextLine().trim().toUpperCase();
            switch (pressed){
                case "F":{
                    if (iterator.hasNext()) {
                        System.out.println(iterator.next());
                        showList=false;
                        flag=true;
                        break;
                    }else{System.out.println("end of path.");showList=false;flag=true;break;}

                }
                case "B":{if(iterator.hasPrevious()){
                    System.out.println(iterator.previous());showList=false;flag=true;break;
                }else{
                    System.out.println("Beginning of the path.");
                    showList=false;
                    flag=true;
                    break;

                }

                }
                case "L":{System.out.println(list);flag=true;showList=false;break;}
                case "M":{showList=true;flag=true;break;}
                case "Q":{System.out.println("Quitting program...");flag=false;break;}
                default:{System.out.println("please provide a correct key.");System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");flag=true;showList=true;break;}
            }


        }


    }

}
