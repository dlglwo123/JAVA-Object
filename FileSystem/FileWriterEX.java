package Section1.Object.FileSystem;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEX {
    public static void main(String[] args) {
        try{
            String fileName = "codestates.txt";
            FileWriter fileWriter = new FileWriter(fileName);

            String str = "뭐라는 거야";
            fileWriter.write(str);
            fileWriter.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
