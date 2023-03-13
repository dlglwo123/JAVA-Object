// String 타입을 요소로 가지는 배열과 <String, Integer> 타입을 요소로 가지는 HashMap을 입력받아, 배열의 각 요소들을 HashMap의 키로 했을 때 그 값을 추출하여 만든 새로운 HashMap을 리턴

package Section1.Object.problemSolving.src.Collection;
import java.util.HashMap;

public class CollectionEX23 {
    public static void main(String[] args) {
        String[] arr = {"a", "c", "e"};
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>(){{
            put("a", 1);
            put("b", 2);
            put("c", 3);
        }};
        HashMap<String, Integer> output = select(arr, hashMap);
        System.out.println(output); // --> { "a"=1, "c"=3 }
    }
    public static HashMap<String, Integer> select(String[] arr, HashMap<String, Integer> hashMap) {
        HashMap<String,Integer> newHm = new HashMap<>();

        for(String key : arr){
            if(hashMap.containsKey(key)){
                newHm.put(key,hashMap.get(key));
            }
        }
        return newHm;
    }
}

