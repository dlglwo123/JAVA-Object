//List를 value로 가지는 HashMap, key, 인덱스를 입력받아, key에 해당하는 키(key)가 존재하는 경우, index가 가리키는 List의 요소를 리턴

package Section1.Object.problemSolving.src.Collection;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class CollectionEX21 {
    public static void main(String[] args) {
        HashMap<String, List<String>> hashMap = new HashMap<String, List<String>>(){{
            put("apple", Arrays.asList("apple", "red"));
            put("banana", Arrays.asList("delicious"));
        }};
        String output = getElementOfListEntry(hashMap, "apple", 1);
        System.out.println(output); // --> "red"
    }
    public static String getElementOfListEntry(HashMap<String, List<String>> hashMap, String key, int index) {

        if(hashMap.size() == 0 || hashMap.size() < index){
            return null;
        }
        if(hashMap.get(key) == null){
            return null;
        }
        String list = hashMap.get(key).get(index);
        return list;
    }
}
