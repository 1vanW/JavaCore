package IOandNIO;

import java.io.*;

public class DataIOStreamEx {
    public static void main(String[] args) {

        try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("myTest.bin"));
             DataInputStream inputStream=  new DataInputStream(new FileInputStream("myTest.bin"))
        ){
            dataOutputStream.writeBoolean(true);
            dataOutputStream.writeByte(5);
            dataOutputStream.writeShort(120);
            dataOutputStream.writeLong(1_000_000L);
            dataOutputStream.writeFloat(1.14f);

            System.out.println(inputStream.readBoolean());
            System.out.println(inputStream.readByte());
            System.out.println(inputStream.readShort());
            System.out.println(inputStream.readLong());
            System.out.println(inputStream.readFloat());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
