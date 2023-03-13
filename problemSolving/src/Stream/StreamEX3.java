//[짝수 요소 출력하기]

package Section1.Object.problemSolving.src.Stream;
import java.util.*;
import java.util.stream.Collectors;

public class StreamEX3 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> output = computeAverageOfNumbers(list);;
        System.out.println(output);
    }
    public static List<Integer> computeAverageOfNumbers(List<Integer> list){
        return list.stream()
                .filter(e -> e % 2 == 0)
                .collect(Collectors.toList()); // 반환 타입이 list.
    }
}
