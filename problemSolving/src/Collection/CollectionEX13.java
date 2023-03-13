//<String, Integer> 타입을 요소로 가지는 HashMap과 키를 입력받아, 키에 해당하는 값을 리턴

package Section1.Object.problemSolving.src.Collection;
import java.util.HashMap;
import java.util.Map;

public class CollectionEX13 {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("a",1);
        hashMap.put("b",2);
        hashMap.put("c",3);
        Integer output = getValue(hashMap, "b");
        System.out.println(output); // --> 2
    }
    public static Integer getValue(HashMap<String, Integer> hashMap, String key) {
        return hashMap.get(key);
    }
}
