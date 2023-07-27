public class Car {
    private String name;
    private static int numberOfCars;


    Car(String name){
        this.name=name;
        this.numberOfCars++;
    }
    int getCarNumber(){
        return this.numberOfCars;
    }

    @Override
    public String toString() {
        return this.getClass().getName()+"'s name is: "+this.name;
    }
}
