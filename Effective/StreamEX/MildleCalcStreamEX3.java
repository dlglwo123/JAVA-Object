//[Sorted Stream]

package Section1.Object.Effective.StreamEX;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MildleCalcStreamEX3 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,35,27,22,34,2);

        list.stream()
                .distinct()
                .sorted(Comparator.reverseOrder()) //내림차순
                .sorted() //오름차순 : 작은 값부터 출력
                .forEach(System.out::println);
    }
}
