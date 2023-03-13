//<Integer, Integer> 타입을 요소로 가지는 HashMap을 입력받아 Entry의 개수 출력

package Section1.Object.problemSolving.src.Collection;
import java.util.HashMap;

public class CollectionEX17 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>(){{
            put(1, 10);
            put(2, 20);
            put(3, 30);
        }};
        int output = getSize(hashMap);
        System.out.println(output); // --> 3
    }
    public static int getSize(HashMap<Integer, Integer> hashMap) {
        return hashMap.size();
    }
}
