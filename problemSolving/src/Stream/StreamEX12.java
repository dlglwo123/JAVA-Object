//이번주의 최고 온도만을 모아놓은 List를 분석하여 이번주가 더웠는지 알아봅시다. 최고 기온이 30도를 넘은 날이 3일 이상이면 true를, 그렇지 않다면 false를 리턴
package Section1.Object.problemSolving.src.Stream;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEX12 {
    public static void main(String[] args) {
        int[] temperature = {25, 29, 30, 31, 26, 30, 33};
        boolean output = isHot(temperature);
        System.out.println(output); // true
    }
    public static boolean isHot(int[] temperature) {

        long i = Arrays.stream(temperature)
                .mapToLong(e -> e) // 형 변환
                .filter(e -> e >= 30) // 조건
                .count();

        if(i >= 3) return true;
        else return false;
    }
}
