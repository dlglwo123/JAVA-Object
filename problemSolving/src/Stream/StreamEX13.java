//남성 회원 이름의 List와 여성 회원 이름의 List가 있습니다. 남성 회원과 여성 회원 중 특정 성씨를 갖고 있는 사람의 명단이 필요합니다. 중복된 이름은 제거하고 특정 성씨를 갖고 있는 회원들의 이름을 정렬한 후 List로 리턴
package Section1.Object.problemSolving.src.Stream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEX13 {
    public static void main(String[] args) {
        List<String> male = Arrays.asList("김코딩", "최자바", "김코츠");
        List<String> female = Arrays.asList("박해커", "김유클", "김코딩");
        List<String> output = findPeople(male, female, "정");
        System.out.println(output); // ["김유클", "김코딩", "김코츠"]
    }
    public static List<String> findPeople(List<String> male, List<String> female, String lastName) {
        /*List<String>list = Stream.of(male,female)
                .flatMap(x -> x.stream())
                .distinct()
                .sorted()
                .filter(e -> e.contains(lastName))
                .collect(Collectors.toList());

                return list;

         */
        Stream<String>maleStream = male.stream();
        Stream<String>FemaleStream = female.stream();
        Stream<String>stream = Stream.concat(maleStream,FemaleStream);

        return stream.sorted().distinct().filter(e -> e.startsWith(lastName)).collect(Collectors.toList());

    }
}
