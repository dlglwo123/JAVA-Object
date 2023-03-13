//[map Stream]

package Section1.Object.Effective.StreamEX;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class MildleCalcStreamEX1 {
    public static void main(String[] args) {
        List<String>list = Arrays.asList("C","Java","Python");
        List<Integer> Intlist = Arrays.asList(1,3,6,9);

        list.stream()
                .map(e -> e.toUpperCase())
                .forEach(e -> System.out.println(e));

        System.out.println();

        Intlist.stream().map(e -> e * 3).forEach(e -> System.out.println(e));
    }
}
