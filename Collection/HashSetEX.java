/*  [HashSet]
    1. HashSet은 Set 인터페이스를 구현한 가장 대표적인 컬렉션
    2. 중복된 값 허용 X
    3. 저장순서 유지 X
 */
package Section1.Object.Collection;
import java.util.HashSet;
import java.util.Iterator;
public class HashSetEX {
    public static void main(String[] args) {
        HashSet <String> hashSet = new HashSet<>(); //HashSet 선언

        hashSet.add("java");
        hashSet.add("C++");
        hashSet.add("Python");
        hashSet.add("java"); // 중복 : 중복된 값은 허용하지 않는다.

        Iterator I = hashSet.iterator(); //iterator 선언 : 각 저장된 요소들을 참조변수 I에 할당

        while(I.hasNext()) //hasNext : 참조변수 I에 있는 값들을 하나씩 불러들인다.
        {
            System.out.println(I.next()); // hasNext에서 값을 하나씩 불러올때 그 값에 대한 정보를 출력한다.
        }
    }
}
/*
    [출력결과]
    C++
    java
    Python   저장된 순서가 입력한 값처럼 순차적으로 저장되지 않는다.(저장순서 유지 X)
 */
