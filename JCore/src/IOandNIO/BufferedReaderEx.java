package IOandNIO;

import java.io.*;

public class BufferedReaderEx {
    public static void main(String[] args) {

        try(BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\vinev\\Desktop\\pejzazhi-priroda-trava-xolmy-svet-utro-oblako-oblaka.jpg"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("java_pic.jpeg"))
        ){
//            int character;
//            while ((character = reader.read()) != -1){
//                writer.write(character);
//            }
            String line ;
            while ((line = reader.readLine()) != null){
                writer.write(line);
                writer.write("\n");
            }
            System.out.println("done!");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
