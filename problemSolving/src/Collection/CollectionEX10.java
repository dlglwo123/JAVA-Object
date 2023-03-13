//String 타입을 요소로 가지는 배열을 입력받아, String 타입을 요소로 가지는 ArrayList로 변환하여 리턴

package Section1.Object.problemSolving.src.Collection;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionEX10 {
    public static void main(String[] args) {
        String[] arr = {"백엔드", "개발자", "김코딩"};
        List<String> output = arrayToArrayList(arr);
        System.out.println(output); // --> ["백엔드", "개발자", "김코딩"]
    }
    public static List<String> arrayToArrayList(String[] arr) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));

        if(list.size() == 0){
            return null;
        }

        return list;
    }
}
