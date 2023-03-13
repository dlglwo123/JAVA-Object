//String 타입을 요소로 가지는 배열을 입력받아, 가장 길이가 긴 문자열 요소의 길이를 리턴

package Section1.Object.problemSolving.src.Stream;
import java.util.Arrays;

public class StreamEX9 {
    public static void main(String[] args) {
        String[] strArr = {"codestates", "java", "backend", "programming"};
        int output = findLongestLength(strArr);
        System.out.println(output); // -> 11
    }
    public static int findLongestLength(String[] strArr) {
        return Arrays.stream(strArr)
                .mapToInt(e -> e.length())
                .max().getAsInt();
    }
}
