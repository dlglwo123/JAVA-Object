package Section1.Object.FileSystem;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderEX {
    public static void main(String[] args) {
        try{
            String fileName = "codestates.txt";
            FileReader file = new FileReader(fileName);
            int data = 0;
            while((data = file.read()) != 1){
                System.out.print((char)data);
            }
            file.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
