//String타입을 요소로 가지는 List를 입력받아 중복을 제거하고 김씨 성을 가진 이름들을 정렬하여 문자열 배열로 리턴
package Section1.Object.problemSolving.src.Stream;
import java.util.Arrays;
import java.util.List;

public class StreamEX7 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("김코딩", "박해커", "김코딩", "최자바", "김해커");
        String[] output = filterName(names);
        System.out.println(Arrays.toString(output)); // {"김자바", "김코딩"};
    }
    public static String[] filterName(List<String> names) {

       return names.stream().distinct().sorted().filter(e -> e.contains("김")).toArray(String[]::new);

    }
}
