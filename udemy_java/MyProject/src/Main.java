public class Main {
    public static void main(String[] args) {
        for(int i=0;i<1000;i++){
            printWrapper(i);
        }
    }
    public static void printWrapper(int num){
        Integer number=num;
        System.out.println(number.intValue());
    }
    public static void printActual(int num){
        int number=num;
        System.out.println(number);
    }
}

//1 sec 627 msffvf