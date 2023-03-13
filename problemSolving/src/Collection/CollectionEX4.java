//String 타입을 요소로 가지는 ArrayList와 문자열 요소를 입력받아, 주어진 요소를 ArrayList의 맨 뒤에 추가하고 해당 ArrayList를 리턴

package Section1.Object.problemSolving.src.Collection;
import java.util.ArrayList;
import java.util.Arrays;

public class CollectionEX4 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("a", "b"));
        ArrayList<String> output = addLast(arrayList, "c");
        System.out.println(output);
    }
    public static ArrayList<String> addLast(ArrayList<String> arrayList, String str) {
        arrayList.add(str);
        return arrayList;
    }
}
