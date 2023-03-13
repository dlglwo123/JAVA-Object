//[map Stream]

package Section1.Object.Effective.StreamEX;

import java.util.Arrays;

public class MildleCalcStreamEX2 {
    public static void main(String[] args) {
        String[][]arr = new String[][]{{"JavaScript","HTML"},{"C++","JAVA"}};

        Arrays.stream(arr) // 배열은 항상 Arrays.stream
                .map(e -> Arrays.stream(e))
                .forEach(n -> n.forEach(System.out::println)); // 배열에 저장된 값을 다른 참조 변수에 넣어서 출력한다.

        System.out.println("");

        //flatMap() : 중첩구조를 제거하고 단일 컬렉션으로 만들어주는 역할이다.
        Arrays.stream(arr)
                .flatMap(Arrays::stream).forEach(System.out::println);
    }

}
