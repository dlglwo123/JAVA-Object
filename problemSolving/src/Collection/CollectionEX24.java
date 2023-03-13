// 문자열을 입력받아 문자열을 구성하는 각 문자(letter)를 키로 갖는 HashMap을 리턴

package Section1.Object.problemSolving.src.Collection;
import java.util.ArrayList;
import java.util.HashMap;

public class CollectionEX24 {
    public static void main(String[] args) {
        HashMap<Character, Integer> output = countAllCharacter("banana");
        System.out.println(output); // --> {b=1, a=3, n=2}
    }
    public static HashMap<Character, Integer> countAllCharacter(String str) {
        HashMap<Character,Integer> newHM = new HashMap<>();

        for(int i = 0; i < str.length(); i++){
            char key = str.charAt(i); // i에 해당하는 문자
            if(newHM.containsKey(key)) // 만약 해쉬맵 키와 str 배열의 키가 같다면
            {
                int v = newHM.get(key); // value 값은 hashMap.get() : 주어진 키에 값 리턴
                newHM.put(key,v + 1); // 키값은 중복저장 X 그렇기 때문에 값으로 증가
            }else newHM.put(key,1); // 처음 b,a,n은 else문을 통해 들어옴
        }

        if(str.isEmpty()) // 만약 빈 문자열 입력 Null
        {
            return null;
        }

        return newHM;
    }
}
