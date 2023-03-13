package Section1.Object.FileSystem;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class FileInputSystemEX {
    public static void main(String[] args) {
        try{
            FileInputStream fileInputStream = new FileInputStream("codestates.txt");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            int i = 0;
            while((i = bufferedInputStream.read()) != -1 ) // BufferedInputStream 이라는 보조스트림을 사용하면 성능이 향상된다.
                                                            // 여러 바이트를 저장하여 한번에 많은 양의 데이터를 입출력 할 수 있도록 도와주는 임시 저장 공간
            {
                System.out.print((char)i);
            }
            fileInputStream.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
