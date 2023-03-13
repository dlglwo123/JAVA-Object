//이번엔 Member 클래스를 이용해 회원의 이름, 성별, 나이까지 관리하려고 합니다. Member 타입을 요소로 가지는 List를 입력받아, 남성 회원들의 평균 나이를 리턴
package Section1.Object.problemSolving.src.Stream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEX5 {
    public static void main(String[] args) {
        Member coding = new Member("coding", "Female", 25);
        Member hacker = new Member("hacker", "Male", 30);
        Member ingi = new Member("ingi", "Male", 32);
        List<Member> members = Arrays.asList(coding, hacker, ingi);
        double output = computeAverageOfMaleMember(members);
        System.out.println(output); // --> 31.0 //남성의 평균 나이
    }

    public static double computeAverageOfMaleMember(List<Member> members) {
        //구현된 Member 클래스의 getName(), getGender(), getAge() 메소드로 해당 Member 클래스의 name, gender, age를 확인할 수 있습니다.
        return members.stream().filter(s -> s.gender.startsWith("Male")).mapToDouble(e -> e.getAge()).average().getAsDouble();
        // 설명 : filter : 조건에 맞는 데이터들만을 정제하는 역할
        // 1. 먼저 필터를 통해서 gender가 male인 데이터를 받고 mapToDouble을 이용해서 나이 members 리스트 형을 double형태로 변환 후 평균 getAsDouble로 결과값 출력


    }

    static class Member {
        String name;
        String gender;
        int age;

        public Member(String name, String gender, int age) {
            this.name = name;
            this.gender = gender;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public String getGender() {
            return gender;
        }

        public int getAge() {
            return age;
        }
    }
}
