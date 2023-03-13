package Section1.Object.ModifierExPakage1;
import Section1.Object.ModifierExPakage.ModifierEx;
public class otherModifierEx extends ModifierEx{
    public void show(){
        // System.out.println(str); 오류 : 다른 패키지 하위 클래스
        //System.out.println(str1);
        System.out.println(str2); // 다른 패키지의 하위 클래스는 가능 protected
        System.out.println(str3);
    }
}
class Test{
    public static void main(String[] args) {
        ModifierEx ex = new ModifierEx();
        otherModifierEx ex1 = new otherModifierEx();
        ex1.show();
        System.out.println("=======================");
        //System.out.println(ex.str); 오류 : 같은 패키지 X 같은 클래스 X 다른 패키지 하위 클래스 X
        //System.out.println(ex.str1);
        //System.out.println(ex.str2);
        System.out.println(ex.str3);
    }
}
