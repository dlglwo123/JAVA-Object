// [ArrayList를 선언하고 1부터 5까지 담은 뒤 리턴]

package Section1.Object.problemSolving.src.Collection;
import java.util.ArrayList;
import java.util.Arrays;

public class CollectionEX1 {
    public static void main(String[] args) {
        ArrayList<Integer>arrayList = makeArrayList();
        System.out.println(arrayList);
    }

    public static ArrayList<Integer> makeArrayList() {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        return arr;
    }
}