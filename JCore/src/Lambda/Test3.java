package Lambda;
import java.io.CharArrayReader;
import java.util.ArrayList;
import java.util.function.Supplier;
import java.util.function.Consumer;

public class Test3 {
   public static ArrayList<Car> createCar(Supplier<Car>c){

       ArrayList<Car> list = new ArrayList<>();
       for (int i = 0; i < 3; i++){
           list.add(c.get());
       }

       return list;

   }
   public static void changeCar(Car car, Consumer<Car> carConsumer){

       carConsumer.accept(car);
   }




    public static void main(String[] args) {


        ArrayList<Car> ourCars = createCar(()-> new Car("Nissan Tiida","blue",1.6));


        System.out.println(ourCars);

        changeCar(ourCars.get(0), (Car car) -> {car.color ="Red"; car.engine = 2.0;});


        System.out.println(ourCars);

    }



}
class Car{
    String model;
    String color;
    double engine;

    public Car(String model, String color, double engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }


}
