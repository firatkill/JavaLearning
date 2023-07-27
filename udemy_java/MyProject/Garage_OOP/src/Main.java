import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Garage garage=new Garage();
        Car car1=new Car("car1");




        garage.appendCar(car1);
        garage.getCars();
        System.out.println("-".repeat(30));
        Car car2=new Car("car2");
        garage.appendCar(car2);
        garage.getCars();
        System.out.println("-".repeat(30));
        Car car3=new Car("car3");
        Car car4=new Car("car4");
        Car car5=new Car("car5");
        ArrayList<Car> cars=new ArrayList<>(List.of(new Car[]{car3,car4,car5}));
        garage.appendCars(cars);
        garage.getCars();

    }
}