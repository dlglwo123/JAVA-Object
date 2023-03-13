// String 타입을 요소로 가지는 ArrayList와 인덱스를 입력받아, ArrayList에 인덱스의 요소를 삭제한 후 해당 요소를 리턴

package Section1.Object.problemSolving.src.Collection;
import java.util.ArrayList;
import java.util.Arrays;

public class CollectionEX8 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("0","1","2","3","4","5"));
        String output = removeFromNth(arrayList, 3);
        System.out.println(output); // --> "3"
    }
    public static String removeFromNth(ArrayList<String> arrayList, int index) {
        int size = arrayList.size();
        if(size < index){
            return null;
        }
        return arrayList.remove(index);
    }
}
