package IOandNIO;

import java.io.*;

public class BufferedReaderEx {
    public static void main(String[] args) {

        try(BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\vinev\\Desktop\\test.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\vinev\\Desktop\\test1.txt"))
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
