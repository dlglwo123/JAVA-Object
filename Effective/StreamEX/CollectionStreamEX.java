// [컬렉션 스트림]

package Section1.Object.Effective.StreamEX;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CollectionStreamEX {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("HI","JAVA","Programming");

        Stream<String> stream = list.stream();
        stream.forEach(System.out::println);
    }
}
