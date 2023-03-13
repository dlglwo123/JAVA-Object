/*  [요소 소모] reduce()
    1. 스트림 요소를 줄여나가면서 연산을 수행하고 최종적인 결과를 반환한다.
 */
package Section1.Object.Effective.StreamEX;

import java.util.Arrays;

public class FinalStreamEX3 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};

        //sum()
        long sum = Arrays.stream(arr).sum();
        System.out.println(sum);

        int sum1 = Arrays.stream(arr)
                .map(e -> e * 2)
                .reduce((a,b) -> a+b)
                .getAsInt();
        System.out.println("초기값이 없는 reduce : " + sum1);

        int sum2 = Arrays.stream(arr)
                .map(e -> e * 2)
                .reduce(5,(a,b) -> a * b);
        System.out.println("초기값이 있는 reduce : " + sum2);

    }
}
