//Integer 타입을 요소로 가지는 ArrayList와 추가할 위치의 인덱스, 정수를 입력받아 주어진 요소를 ArrayList의 인덱스에 추가하고 해당 ArrayList를 리턴해야 합니다.

package Section1.problemSolving.src.Collection;
import java.util.ArrayList;
import java.util.Arrays;
public class CollectionEX5 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(0,1,2,3));
        ArrayList<Integer> output = addNth(arrayList, 1, 7);
        System.out.println(output); // --> [0, 7, 1, 2, 3]

    }
    public static ArrayList<Integer> addNth(ArrayList<Integer> arrayList, int index, int element) {
        int size = arrayList.size();

        if(size < index){
            return null;
        }

        arrayList.add(index, element);
        return arrayList;
    }
}
