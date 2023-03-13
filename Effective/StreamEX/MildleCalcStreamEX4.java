//[기타 스트림]

package Section1.Object.Effective.StreamEX;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class MildleCalcStreamEX4 {
    public static void main(String[] args) {
        IntStream intStream = IntStream.rangeClosed(1,10);
        IntStream intStream1 = IntStream.of(1,2,2,2,3,4,4,5,7,7,8,8);

        intStream.skip(5).forEach(System.out::println); //skip() : 5를 건너뛰고 부터 출력
        //intStream.limit.forEach(System.out::println); //limit() : 5까지 출력한다.

        System.out.println("=".repeat(30));

        int sum = intStream1.filter(e -> e % 2 == 0)
                .peek(System.out::println) //forEach와 역할은 같지만 중간연산자와 최종연산자라는 차이점이 있다.
                .sum();

        System.out.println("합계 " + sum);

    }
}
