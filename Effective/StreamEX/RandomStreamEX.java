//[임의의 난수 생성 스트림]

package Section1.Object.Effective.StreamEX;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class RandomStreamEX {
    public static void main(String[] args) {

        //무한 스트림
        IntStream intStream = new Random().ints(); //방식 : Math.random과 동일하다.
        //intStream.forEach(System.out::println);

        //무한 스트림 제한
        IntStream limitIntStream = new Random().ints(5);
            IntStream limitIntStream1 = new Random().ints().limit(5);

            limitIntStream.forEach(System.out::println);
            System.out.println("---------");
            limitIntStream1.forEach(System.out::println);

            System.out.println("---------");

        //특정 범위의 정수
        IntStream rangeStream = IntStream.rangeClosed(1,10); //range의 경우 1 ~ 9 까지 출력된다.
        rangeStream.forEach(System.out::println);
    }
}
