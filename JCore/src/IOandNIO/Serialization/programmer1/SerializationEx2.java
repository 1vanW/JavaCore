package IOandNIO.Serialization.programmer1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationEx2 {
    public static void main(String[] args) {
        Car car = new Car("Suzuki Swift","silver");
        Employee emp1 =new Employee("Ivan","Hohryakov","It",500.30,car);
        Employee emp2 =new Employee("Anna","Hohryakova","Medicine",750.8,car);


        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("Anna.bin"));){


            outputStream.writeObject(emp2);
            System.out.println("done!");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
