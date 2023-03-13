package Section1.Object.Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class HashSetEx1 {
    public static void main(String[] args) {
        HashSet<Integer> hSet = new HashSet<>();

        hSet.add(4);
        hSet.add(1);
        hSet.add(21);
        hSet.add(30);
        hSet.add(21); //중복
        hSet.add(55);

        Iterator I = hSet.iterator();

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
    55
    30

 */
