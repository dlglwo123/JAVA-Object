/*
    [요소 수집]
    - 스트림 중간 연산을 통한 요소들의 데이터를 가공 후 요소들을 수집하는 최종처리 메서드인 collect를 지원한다.
    1. 직접 구현하거나 미리 제공된 것들을 사용할 수 있다.
    2. 요소 및 그룹핑 및 분할등 다른 기능들을 제공한다.
 */

package Section1.Object.Effective.StreamEX;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FinalStreamEX4 {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student(100, Student.Gender.Female, "홍순동"),
                new Student(50, Student.Gender.Male, "홍길동"),
                new Student(60, Student.Gender.Female, "김이나")
        );
        Map<String, Integer> map = list.stream()
                .filter(e -> e.getGender() == Student.Gender.Female)
                .collect(Collectors.toMap(
                        student -> student.getName(), //key
                        student -> student.getScore() //Value
                ));
        System.out.println(map);
    }
}
// 출력 결과 :

class Student {

    public enum Gender {Male, Female;}; // 열거형 : 상수집합

    private int score;
    private Gender gender;
    private String name;

    public Student(int score, Gender gender, String name) {
        this.score = score;
        this.gender = gender;
        this.name = name;
    }
    public int getScore() {
        return score;
    }

    public Gender getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

}