//Integer 타입을 요소로 가지는 ArrayList를 입력받아 ArrayList의 첫번째 요소를 삭제하고, 삭제된 해당 요소를 리턴

package Section1.Object.problemSolving.src.Collection;
import java.util.ArrayList;
import java.util.Arrays;

public class CollectionEX7 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(0,1,2,3,4,5));
        Integer output = removeFromFront(arrayList);
        System.out.println(output); // --> 0
        System.out.println(arrayList);
    }
    public static Integer removeFromFront(ArrayList<Integer> arrayList) {
        int size = arrayList.size();
        if(size == 0){
            return null;
        }
        return arrayList.remove(0);
    }
}
