//<String, Integer> 타입을 요소로 가지는 HashMap과 Key, Value를 입력받아 HashMap에 Key-Value 쌍을 추가한 후 새롭게 추가된 요소를 포함한 HashMap을 리턴

package Section1.Object.problemSolving.src.Collection;
import java.util.HashMap;

public class CollectionEX14 {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>(){{
            put("a", 1);
            put("b", 2);
            put("c", 3);
        }};
        HashMap<String, Integer> output = addKeyAndValue(hashMap, "d", 4);
        System.out.println(output); // {a=1, b=2, c=3, d=4}
    }
    public static HashMap<String, Integer> addKeyAndValue(HashMap<String, Integer> hashMap, String key, int value) {
        hashMap.put(key,value);
        return hashMap;
    }
}

