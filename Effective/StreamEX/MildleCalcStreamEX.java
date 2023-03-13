/*  [중간 연산 스트림]
    1. 필터링
    - distinct() : Stream의 요소들에 중복된 데이터가 존재하는 경우, 중복을 제거하기 위해서 사용
    - filter() : Stream의 조건에 맞는 데이터만을 정제해서 더 작은 컬렉션을 만든다.
 */


package Section1.Object.Effective.StreamEX;

import java.util.Arrays;
import java.util.List;

public class MildleCalcStreamEX {
    public static void main(String[] args) {
        List<String>list = Arrays.asList("바나나","딸기","메론","바나나","딸기");

        list.stream()
                .distinct() // 중복제거
                .forEach( e -> System.out.println(e)); // 순회하면서 중복 제거 한 값을 출력
        System.out.println(" ");


        list.stream()
                .filter(e -> e.startsWith("바"))
                .forEach(e -> System.out.println(e));
        System.out.println();

        list.stream()
                .distinct()
                .filter(e -> e.startsWith("딸"))
                .forEach(e -> System.out.println(e));
    }
}
