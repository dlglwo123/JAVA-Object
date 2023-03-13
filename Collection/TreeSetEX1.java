package Section1.Object.Collection;

import java.util.TreeSet;

public class TreeSetEX1 {
    public static void main(String[] args) {

        // TreeSet 생성
        TreeSet<String> workers = new TreeSet<>();

        // TreeSet에 요소 추가
        workers.add("Lee Java");
        workers.add("Park Hacker");
        workers.add("Kim Coding");

        System.out.println(workers); // 저장된 인덱스 출력
        System.out.println(workers.first()); //첫번째 인덱스 출력
        System.out.println(workers.last()); //마지막 인덱스 출력
        System.out.println(workers.higher("Lee")); //인덱스 값을 스필릿하여 앞글자가 LEE 포함된 인덱스 출력
        System.out.println(workers.subSet("Kim", "Park")); //Kim 부터 시작해서 Park 전까지(즉 Park 이상의 것들은 출력이 안된다.)
    }
}
/*
    [출력결과]
    [Kim Coding, Lee Java, Park Hacker]
    Kim Coding
    Park Hacker
    Lee Java
    [Kim Coding, Lee Java]
 */