// [합 구하기]
package Section1.Object.problemSolving.src.Stream;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamEX1 {
    public static void main(String[] args) {
        List<Integer>list = Arrays.asList(1,2,3,4,5);
        int out = computeSumOfAllElements(list);
        System.out.println(out); //-->  15
    }
    public static int computeSumOfAllElements(List<Integer> list) {
        /*      return list.stream()
                .mapToInt(e -> e) //map : mapToInt로 List형을 Int형으로 변환(map은 원하는 필드만 추출하거나 특정형태로 변환할 때 사용한다.)
                .sum();
        */
        /*      return list.stream()
                .reduce(0,(a , b) -> a + b); // reduce : 스트림의 요소를 줄여나가면서 연산을 수행하고 최종적인 결과를 반환한다.
         */
        return list.stream()
                .reduce(0,Integer::sum); // reduce : 첫번째 매개변수 identyfy는 특정 연산을 시작할 때 설정되는 초기값을 의미한다.
    }                                       //          두번째 accumulator는 각 요소들을 연산하여 나온 누적된 값을 생성하는 데 사용하는 조건식이다.
}
