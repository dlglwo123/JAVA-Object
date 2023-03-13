package Section1.Object.Effective.StreamEX;

import java.util.Arrays;

public class FinalStreamEX {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        long count = Arrays.stream(arr).count();
        System.out.println("전체 요소 개수 출력 : " + count);

        long sum = Arrays.stream(arr).sum();
        System.out.println("전체 요소 합 출력 : " + sum);

        double average = Arrays.stream(arr).average().getAsDouble();
        System.out.println("전체요소 평균값 : " + average);

        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println("전체요소 중 최대 값 : " + max);

        int min = Arrays.stream(arr).min().getAsInt();
        System.out.println("전체요소 중 최소 값 : " + min);

        int first = Arrays.stream(arr).findFirst().getAsInt();
        System.out.println("배열의 첫번째 요소값 : " + first);
    }
}
