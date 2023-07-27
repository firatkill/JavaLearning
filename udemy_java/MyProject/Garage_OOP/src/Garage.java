import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Garage {
    ArrayList<Car> cars=new ArrayList<>();

    void appendCar(Car car){
        this.cars.add(car);
    }
    void appendCars(ArrayList<Car> cars){
        this.cars.addAll(cars);
    }
      void getCars(){
        for(Car car:this.cars){
            System.out.println(car.getCarNumber()+". "+car.toString());
        }
    }


}
