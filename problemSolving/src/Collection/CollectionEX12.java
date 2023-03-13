//Integer 타입의 ArrayList를 입력받아 모든 요소를 더한 값을 리턴

package Section1.Object.problemSolving.src.Collection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class CollectionEX12 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList =  new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        int output = sumAllElements(arrayList);
        System.out.println(output); // --> 15
    }
    public static int sumAllElements(ArrayList<Integer> arrayList) {
        ArrayList<Integer> list = arrayList;
        Iterator<Integer> iterator = list.iterator();
        int total = 0;

        while(iterator.hasNext()){
            total += iterator.next();
        }

        return total;
    }
}
