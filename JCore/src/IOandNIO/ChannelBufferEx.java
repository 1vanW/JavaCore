package IOandNIO;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;

public class ChannelBufferEx {
    public static void main(String[] args) {
        try(RandomAccessFile randomAccessFile
                    = new RandomAccessFile("test10.txt","rw");
            FileChannel fileChannel = randomAccessFile.getChannel();
        ){
            ByteBuffer buffer = ByteBuffer.allocate(25);

            StringBuilder stringBuilder = new StringBuilder();

            int byteRead = fileChannel.read(buffer);

            while (byteRead > 0){
                System.out.println("Read " + byteRead);
                buffer.flip();

                while(buffer.hasRemaining()){
                    stringBuilder.append((char)buffer.get());
                }

                buffer.clear();

                byteRead =fileChannel.read(buffer);
            }




            String text = "\n eeee I`ve gonna take my horse";

            ByteBuffer buffer2 = ByteBuffer.allocate(text.getBytes().length);

            buffer2.put(text.getBytes());

            buffer2.flip();


            fileChannel.write(buffer2);








        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
