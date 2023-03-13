//String 타입을 요소로 가지는 List를 입력받아 중복을 제거하고 정렬한 후 String 타입을 요소로 갖는 배열로 리턴

package Section1.Object.problemSolving.src.Stream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEX6 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("김코딩", "박해커", "김코딩", "최자바", "박해커");
        String[] output = makeUniqueNameArray(names);
        System.out.println(Arrays.toString(output)); // {"김코딩", "박해커", "최자바"};
    }
    public static String[] makeUniqueNameArray(List<String> names) {
        return names.stream().distinct().sorted().toArray(String[]::new);
        // 반환값이 배열일 경우 toArray를 통해 반환한다.
    }
}
