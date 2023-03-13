package Section1.Object.problemSolving.src.Collection;
//[Integer 타입의 ArrayList와 수를 입력받아 수가 인덱스로 가리키는 ArrayList의 요소를 리턴]

import java.util.ArrayList;
import java.util.Arrays;
public class CollectionEX2 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(0,1,2,3,4,5));
        Integer output = getNthElement(arrayList, 2);
        System.out.println(output); // --> 2
    }
    public static Integer getNthElement(ArrayList<Integer> arrayList, int index) {
        int size = arrayList.size();

        if(size == 0){
            return null;
        }
        if( 0 >= size || index >= size){
            return null;
        }
        return arrayList.get(index);
    }
}
