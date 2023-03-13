// Member 클래스를 이용해 회원의 이름과 성별을 관리하려고 합니다. Member타입의 List를 입력받아, 여성 회원의 수를 리턴

package Section1.Object.problemSolving.src.Stream;
import java.lang.reflect.Member;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class StreamEX4 {
    public static void main(String[] args) {
        Member coding = new Member("coding", "Female");
        Member hacker = new Member("hacker", "Male");
        List<Member> members = Arrays.asList(coding, hacker);
        long output = computeCountOfFemaleMember(members);
        System.out.println(output); // --> 1
    }
    public static long computeCountOfFemaleMember(List<Member> members) {
        //구현된 Member 클래스의 getName(), getGender() 메소드로 해당 Member 클래스의 name, gender를 확인할 수 있습니다.
        return  members.stream().filter(s -> s.gender.startsWith("Female")).count(); // 객체형을 참조할 때에는 참조형.멤버
    }
    static class Member {
        String name;
        String gender;

        public Member(String name, String gender) {
            this.name = name;
            this.gender = gender;
        }

        public String getName() {
            return name;
        }

        public String getGender() {
            return gender;
        }
    }
}
