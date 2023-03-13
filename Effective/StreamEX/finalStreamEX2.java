package Section1.Object.Effective.StreamEX;
// 매칭(match()) : 조건식 람다 predicate를 매개 변수로 넘겨 스트림의 각 데이터 요소들이 특정한 조건을 충족하는 지 만족시키지 않는 지 검사하여 그결과를 boolean 값으로 반환한다.

import java.util.Arrays;

public class finalStreamEX2 {
    public static void main(String[] args) {
        int[] arr = {2,4,6};

        //allMatch() : 모든 요소들이 조건을 만족하는지 만족하면 true 아니면 false
        boolean result = Arrays.stream(arr).allMatch(e -> e % 2 == 0);
        System.out.println("요소 모두 2의 배수인가 ? " + result); //true

        //anyMatch() : 모든 요소들중 하나라도 조건을 만족하는 요소가 있는지 검사
        result = Arrays.stream(arr).anyMatch(e -> e % 3 == 0);
        System.out.println("요소 중 하나라도 3의 요소가 있나요? " + result); // true

        //noneMatch() : 모든 요소들이 조건을 만족하지 않는 경우
        result = Arrays.stream(arr).noneMatch(e -> e % 3 == 0);
        System.out.println("요소중 하나라도 3의 요소가 없나요 ? " + result); //false


    }
}
