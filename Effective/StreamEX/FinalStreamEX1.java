//[최종연산]

package Section1.Object.Effective.StreamEX;
import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalDouble;

public class FinalStreamEX1 {
    public static void main(String[] args) {
        int[]arr = {1,2,3,4};

        // 평균값을 구해서 Optional 객체로 반환
        OptionalDouble average = Arrays.stream(arr).average();
        System.out.println(average);

        // 기본형으로 변환
        double average1 = average.getAsDouble();
        System.out.println(average1);
    }

}
