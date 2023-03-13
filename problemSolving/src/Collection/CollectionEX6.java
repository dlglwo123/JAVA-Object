//[java how modify element of arrayList] 배열 덮어 씌우기

package Section1.Object.problemSolving.src.Collection;
import java.util.ArrayList;
import java.util.Arrays;

public class CollectionEX6 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("여러분", "화이팅", "입니다"));
        ArrayList<String> output = modifyNthElement(arrayList, 0, "여러분들");
        System.out.println(output); // --> ["여러분들", "화이팅", "입니다"]
    }
    public static ArrayList<String> modifyNthElement(ArrayList<String> arrayList, int index, String str) {
        int size = arrayList.size();
        if(size < index){
            return null;
        }
        arrayList.set(index,str);
        return arrayList;
    }
}
