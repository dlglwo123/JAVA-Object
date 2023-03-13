package Section1.Object.FileSystem;

import java.io.File;
import java.io.IOException;

public class FileEX {
    public static void main(String[] args)  {
        File Dir = new File("./");
        File[] list = Dir.listFiles(); //디렉토리에 파일리스트를 배열 참조변수 list에 할당
        String Hi = "Hi JAVA";

        for(int i = 0; i < list.length; i++){
            String fileName = list[i].getName();

            if(fileName.endsWith("txt") && fileName.startsWith("Hi")){
                list[i].renameTo(new File(Dir,Hi + fileName));
            }
        }
    }
}
