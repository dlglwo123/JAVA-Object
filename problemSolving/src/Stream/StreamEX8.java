//int 타입을 요소로 가지는 배열을 입력받아 가장 큰 요소를 리턴

package Section1.Object.problemSolving.src.Stream;
import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamEX8 {
    public static void main(String[] args) {
        int[] arr = {1, 10, 5, 32, 5};
        Integer output = findBiggestNumber(arr);
        System.out.println(output); // 32
    }
    public static Integer findBiggestNumber(int[] arr) {
        return Arrays.stream(arr).max().getAsInt(); // max도 average와 같이 get..로 값을 반환해야함
    }
}
