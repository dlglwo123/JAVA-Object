//[IntStream으로 총합 계산하기]

package Section1.Object.Effective.StreamEX;
import java.util.Arrays;
import java.util.stream.IntStream;

public class IntStreamEX {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};

        IntStream intStream = Arrays.stream(arr);
        System.out.println("총 합 : " + intStream.sum());
    }
}
