/*
    [Stream]
    1. 배열 및 컬렉션의 저장 요소를 하나씩 참조해서 람다식으로 처리할 수 있도록 하는 반복자이다.
    2. 데이터 흐름으로, 각 데이터를 흐름에 따라 우리가 원하는 결과로 가공하고 처리하는 일련의 과정이다.
    3. 선언형 프로그래밍 방식으로 데이터를 처리할 수 있다.
 */

package Section1.Object.Effective.StreamEX;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamEX {
    public static void main(String[] args) {
        List<Integer>list = Arrays.asList(1,2,3,4,5);
        Stream<Integer> stream = list.stream();
        stream.forEach(System.out::print);
    }
}

