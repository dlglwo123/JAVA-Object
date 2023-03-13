//ArrayList와 요소를 입력받아, 마지막 요소가 제거된 새로운 ArrayList을 리턴
package Section1.Object.problemSolving.src.Collection;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class CollectionEX9 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(0,1,2,3,4,5));
        ArrayList<Integer> output = removeFromBackOfNew(arrayList);
        System.out.println(arrayList); // --> [0, 1, 2, 3, 4, 5]
        System.out.println(output); // --> [0, 1, 2, 3, 4]
    }
    public static ArrayList<Integer> removeFromBackOfNew(ArrayList<Integer> arrayList) {
        ArrayList <Integer> list = new ArrayList<>(arrayList);
        int size = list.size();

        if(size == 0){
            return null;
        }
        list.remove(size - 1);
        return list;
    }
}
