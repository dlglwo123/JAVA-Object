/*
    [스트림 생성]
    1. 스트림으로 데이터를 처리하기 위해서는 가장 먼저 스트림을 생성해야한다.
    2.

 */

package Section1.Object.Effective.StreamEX;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamCreator {
    public static void main(String[] args) {
        String[]arr = new String[]{"자동차","오토바이","트럭"};

        Stream<String> stream = Arrays.stream(arr);// forEach
        Stream<String> stream1 = Stream.of(arr); // Stream of

        stream.forEach(System.out::println);
        stream1.forEach(System.out::println);
    }
}
