//<String, Integer> 타입을 요소로 가지는 HashMap과 문자열을 입력받아, String 타입의 변수 key를 키(key)로 가지고있는 Entry를 제거

package Section1.Object.problemSolving.src.Collection;
import java.security.Key;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CollectionEX15 {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("a",1);
        hashMap.put("b",2);
        hashMap.put("c",3);
        removeEntry(hashMap, "b");
        System.out.println(hashMap); // --> {a=1, c=3}
    }
    public static void removeEntry(HashMap<String, Integer> hashMap, String key) {
        hashMap.remove(key);
    }
}
