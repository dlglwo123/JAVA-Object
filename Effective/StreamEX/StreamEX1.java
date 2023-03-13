package Section1.Object.Effective.StreamEX;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamEX1 {
    public static void main(String[] args) {
        List<String>fruitList = new ArrayList<>();
        fruitList.add("바나나");
        fruitList.add("수박");
        fruitList.add("딸기");

        String[]fruitArray = {"바나나","사과","수박"};

        Stream<String> stream = fruitList.stream();
        Stream<String> stream1 = Arrays.stream(fruitArray); // 배열은 Arrays.stream

        stream.forEach(System.out::println); //forEach 메서드를 사용하여 각 요소들을 순회하며 출력하고 있다.
        stream1.forEach(System.out::println);

        // * forEach : 데이터 소스의 각 요소들을 순회하면서 람다식 안에 정의된 어떤 명령을 실행하는데 사용하는 최종연산자이다.

    }
}
