package IOandNIO.Serialization.programmer1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializationEX {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Ivan");
        list.add("Zaur");
        list.add("Anna");

        try(ObjectOutputStream outputStream =
                    new ObjectOutputStream(new FileOutputStream("Employees1.bin"));){

            outputStream.writeObject(list);
            System.out.println("Done!");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
