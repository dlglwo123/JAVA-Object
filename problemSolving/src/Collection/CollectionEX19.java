//한 사람의 firstName, lastName Entry가 저장되어있는 HashMap을 입력 받아, fullName 이라는 새 Entry를 HashMap에 저장하고 해당 HashMap을 리턴

package Section1.Object.problemSolving.src.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

public class CollectionEX19 {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<String, String>(){{
            put("firstName", "김");
            put("lastName", "코딩");
        }};
        HashMap<String, String> output =  addFullNameEntry(hashMap);
        System.out.println(output); // --> {firstName=김, fullName=김코딩, lastName=코딩}
    }
    public static HashMap<String, String> addFullNameEntry(HashMap<String, String> hashMap) {
        String first = hashMap.get("firstName");
        String last = hashMap.get("lastName");
        hashMap.put("fullName",first + last);
        return hashMap;
    }
}
