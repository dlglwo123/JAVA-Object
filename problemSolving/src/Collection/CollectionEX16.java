//<Integer, Boolean> 타입을 요소로 가지는 HashMap을 입력받아 모든 Entry를 제거

package Section1.Object.problemSolving.src.Collection;
import java.util.HashMap;

public class CollectionEX16 {
    public static void main(String[] args) {
        HashMap<Integer, Boolean> hashMap = new HashMap<Integer, Boolean>(){{
            put(1, true);
            put(3, false);
            put(5, true);
        }};
        clearHashMap(hashMap);
        System.out.println(hashMap); // --> {}
    }
    public static void clearHashMap(HashMap<Integer, Boolean> hashMap) {
        hashMap.clear();
    }
}
