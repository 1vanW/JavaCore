package IOandNIO;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelBufferEx2 {
    public static void main(String[] args) throws IOException {

        try(RandomAccessFile file
                    = new RandomAccessFile("test5.txt","r");
            FileChannel fileChannel = file.getChannel();
        ){

            ByteBuffer buffer = ByteBuffer.allocate(5);

            fileChannel.read(buffer);

            buffer.flip();

            System.out.println((char)buffer.get());
            System.out.println((char)buffer.get());
            System.out.println((char)buffer.get());

            buffer.rewind();

            System.out.println((char)buffer.get());

            System.out.println("-----");


            System.out.println();

        }
    }
}
