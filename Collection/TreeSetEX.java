/*
    [TreeSet]
    - 이진 탐색 트리 형태로 데이터를 저장한다.
    - 이진탐색트리란? 하나의 부모노드가 최대 두개의 자식노드와 연결되는 이진 트리의 일종으로 정렬과 검색에 특화된 자료구조
    - Set의 특징은 그대로 적용된다(순서 유지 X,데이터의 중복저장 X)
 */


package Section1.Object.Collection;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEX {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(1);
        treeSet.add(4);
        treeSet.add(21);
        treeSet.add(30);
        treeSet.add(21); //중복
        treeSet.add(55);

        Iterator I = treeSet.iterator();

        while(I.hasNext()){
            System.out.println(I.next());
        }
    }
}
/*
    [출력결과]
    1
    4
    21
    30
    55  오름차순 정렬로 나오는 것을 확인할 수 있다.

 */