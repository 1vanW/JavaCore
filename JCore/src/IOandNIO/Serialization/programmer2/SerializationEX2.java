package IOandNIO.Serialization.programmer2;

import IOandNIO.Serialization.programmer1.Employee;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializationEX2 {
    public static void main(String[] args) {
        Employee bestEmployee ;

        try(ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("Anna.bin"));){

            bestEmployee = (Employee) inputStream.readObject();

            System.out.println(bestEmployee);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
