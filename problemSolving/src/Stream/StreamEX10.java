//String 타입을 요소로 가지는 List 두 개를 입력받아, 스트림을 이용해 하나의 List로 합친 결과를 리턴

package Section1.Object.problemSolving.src.Stream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEX10 {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("김코딩", "박해커");
        List<String> list2 = Arrays.asList("최자바", "이스프링");
        List<String> output = mergeTwoStream(list1, list2);
        System.out.println(output); // ["김코딩", "박해커", "최자바", "이스프링"]


    }
    public static List<String> mergeTwoStream(List<String> list1, List<String> list2) {
        Stream<String>stream = list1.stream();
        Stream<String>stream1 = list2.stream();

        List<String>addlist = Stream.concat(stream1,stream)
                .collect(Collectors.toList());
        return addlist;

    }
}
