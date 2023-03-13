/*
    [HashMap]
- 키와 값으로 구성된 객체를 저장하는데 이 객체를 Entry 객체라고 한다.
- HashMap은 해시 함수를 통해 ‘키’와 ‘값’이 저장되는 위치를 결정한다.
- 사용자는 그 위치를 알 수 없고, 삽입되는 순서와 위치 또한 관계가 없다.
- 많은 양의 데이터를 검색하는 데 있어서 뛰어난 성능을 보인다.

1. Map은 키와 값을 쌍으로 저장하기 때문에 Iterator()를 직접 호출할 수 없다.
2. 그대신 KeySet이나 entrySet 메서드를 이용하여 Set 형태로 반환된 컬렉션에 iterator() 를 호출하여 반복자를 만든후, 반복자를 통해 순회할 수 있다.
 */



package Section1.Object.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEX {
    public static void main(String[] args) {

        HashMap<String,Integer> map = new HashMap<>(); //hashMap 선언

        //Entry 객체 저장
        map.put("무순",23);
        map.put("희동",26);
        map.put("오리",30);
        map.put("호리",45);
        map.put("자야",12);

        System.out.println("총 Entry 수 : " + map.size()); // 저장된 총 Entry수 얻기

        System.out.println("무순 :" + map.get("무순")); // 무순에 대한 키로 값 찾기

        Set<String> KeySet = map.keySet(); //Key를 요소로 가지는 Set 생성 -> 아래에서 순회하기 위해 필요

        Iterator<String> keyInterator = KeySet.iterator(); //Key를 요소로 가지는 Set을 생성 -> 아래에서 순회하기 위해 필요

        while(keyInterator.hasNext()){
            String Key = keyInterator.next(); //String인 Key 참조변수에 keyInterator 값을 넣는다.
            Integer value = map.get(Key); //주어진 키에 해당하는 값을 리턴한다.
            System.out.println(Key + " : " + value); // 출력
        }

        //객체 삭제
        map.remove("오리");

        System.out.println("총 Entry 수 : " + map.size()); // 오리 엔트리를 제거한 총 Entry수 얻기

        Set<Map.Entry<String,Integer>> entrySet = map.entrySet(); //엔트리 객체를 요소로 가지는 Set을 생성 -> 아래에서 순회하기 위해 필요
        // entrySet() : 키와 값의 쌍으로 구성된 Map.entry 객체를 Set에 담아서 리턴한다.

        Iterator<Map.Entry<String,Integer>> entryInteger = entrySet.iterator(); //순회할 Iterator 선언

        while (entryInteger.hasNext()){
            Map.Entry<String, Integer> entry = entryInteger.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " : " + value);
        }
        //객체 전체 삭제
        map.clear();
    }
}
