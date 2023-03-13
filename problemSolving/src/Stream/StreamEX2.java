//[평균 값 리턴]

package Section1.Object.problemSolving.src.Stream;
import java.util.Arrays;
import java.util.List;

public class StreamEX2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        double output = computeAverageOfNumbers(list);
        System.out.println(output);
    }
    public static double computeAverageOfNumbers(List<Integer> list) {
        return list.stream()
                .mapToDouble(e -> e) //map : list 형을 double로 바꾼다.
                .average().orElse(0); // average()연산자가 반환하는 값의 반환타입은 OptionalDouble()이다.
                                          // 반환타입이 래퍼클래스 객체로 되어있기 때문에 기본형으로 변환하는 과정이 필요하다. getAsDouble,getAsInt 을 사용한다.
                                            // orElse를 사용할 경우 값이 0일때는 0을 반환 값이 있다면 getAsDouble과 같다.
    }
}
