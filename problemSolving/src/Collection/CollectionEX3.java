//[문자열타입의 ArrayList를 입력받아 마지막 요소를 리턴]

package Section1.Object.problemSolving.src.Collection;
import java.util.ArrayList;
import java.util.Arrays;

public class CollectionEX3 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("코", "드", "스", "테", "이", "츠"));
        String output = getLastElement(arrayList);
        System.out.println(output); // --> "츠"
    }
    public static String getLastElement(ArrayList<String> arrayList) {
        int size = arrayList.size();

        if(size == 0){
            return null;
        }
        return arrayList.get(size - 1); // 배열 길이 - 1(마지막 인덱스 출력)
    }
}
