package NestedClass.InnerClass;

import javax.swing.*;

public class Car {

    String color;
    int doorCount;
    Engine engine;
    private static int A;

    public Car(String color, int doorCount) {
        System.out.println(new Engine(100).horsePower);
        this.color = color;
        this.doorCount = doorCount;
//        this.engine = this.new Engine(horsePower);
    }

    public void setEngine(Engine engine){
        this.engine = engine;
    }


    @Override
    public String toString() {
        return " My car{" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }
    public class Engine{
        private int horsePower;


        public Engine(int horsePower) {
//            System.out.println(doorCount);
            this.horsePower = horsePower;
        }

        @Override
        public String toString() {
            return "my Engine{" +
                    "horsePower=" + horsePower +
                    '}';
        }


    }
}
class Test{
    public static void main(String[] args) {


      Car car = new Car("Black",4);

//      Car.Engine eng = car.new Engine(150);




        System.out.println(car);

//        Car.Engine engine3 = new Car("Red",2).new Engine(100);

    }
}
