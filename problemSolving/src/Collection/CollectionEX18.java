//<Character, Integer> 타입을 요소로 가지는 HashMap을 입력받아 짝수 값(Value) 끼리 모두 더한 값을 리턴
//HashMap 순회 : KeySet,EntrySet,IteratorSet
package Section1.Object.problemSolving.src.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CollectionEX18 {
    public static void main(String[] args) {
        HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>(){{
            put('a', 1);
            put('b', 4);
            put('c', 6);
            put('d', 9);
        }};
        int output = addOddValues(hashMap);
        System.out.println(output); // --> 10
    }

    public static int addOddValues(HashMap<Character, Integer> hashMap) {
        int total = 0;

        for(Character key : hashMap.keySet()) //keySet : Map 전체의 키값 순회
        {
            Integer value = hashMap.get(key);
            if(value % 2 == 0){
                total += value;
            }
        }
        return total;
    }
}
