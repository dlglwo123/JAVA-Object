//username과 password를 이용해 회원이 맞는지 여부

package Section1.Object.problemSolving.src.Collection;
import java.util.HashMap;

public class CollectionEX22 {
    public static void main(String[] args) {
        HashMap<String, String> member = new HashMap<String, String>(){{
            put("kimcoding", "1234");
            put("parkhacker", "qwer");
        }};
        boolean output = isMember(member, "parkhacker", "qwer");
        System.out.println(output); // --> true
    }
    public static boolean isMember(HashMap<String, String> member, String username, String password) {

        if(member.containsKey(username)){
            if(member.containsValue(password)) return true;
        }
        return false;
    }
}
