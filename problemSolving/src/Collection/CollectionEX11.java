//입력받은 ArrayList의 모든 요소를 삭제한 뒤 해당 ArrayList를 리턴

package Section1.Object.problemSolving.src.Collection;
import java.util.ArrayList;
import java.util.Arrays;

public class CollectionEX11 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> output = clearArrayList(arrayList);
        System.out.println(output);
    }
    public static ArrayList<Integer> clearArrayList(ArrayList<Integer> arrayList) {
        arrayList.clear();
        return arrayList;
    }
}
