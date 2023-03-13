//Integer 타입을 요소로 가지는 List를 입력받아 각 요소에 2를 곱한 새로운 List를 리턴해야 합니다.
package Section1.Object.problemSolving.src.Stream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEX11 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> output = makeElementDouble(list);
        System.out.println(output); // [2, 4, 6, 8, 10]
    }
    public static List<Integer> makeElementDouble(List<Integer> list) {
        return list.stream().map(e -> e * 2).collect(Collectors.toList());

    }
}

