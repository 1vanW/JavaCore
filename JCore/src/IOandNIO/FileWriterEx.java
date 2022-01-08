package IOandNIO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
    public static void main(String[] args) throws IOException {
        String rubai = " Цель творца и вершина творения  - мы.\n" +
                " Мудрость, разум, источник прозрения -  мы\n" +
                " Этот круг мироздания  перстню подобен. -\n" +
                " В  нем граненый алмаз, без сомнения,  мы";

        String s = "Fuck";

        try (FileWriter writer = new FileWriter("C:\\Users\\vinev\\Desktop" +
                "\\test.txt",true) ){

//            for (int i = 0; i < rubai.length(); i++){
//                writer.write(rubai.charAt(i));
//            }
            writer.write(rubai);
            writer.write(s);
            System.out.println("Done!");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
