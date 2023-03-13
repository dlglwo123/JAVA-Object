package Section1.Object.FileSystem;

import java.io.FileOutputStream;

public class FileoutputStreamEX {
    public static void main(String[] args) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("codestates.txt");
            String word = "Hie ";

            byte b[] = word.getBytes();
            fileOutputStream.write(b);
            fileOutputStream.close();
        }
        catch (Exception e){
            System.out.println(e);
    }
}}
