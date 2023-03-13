package Section1.Object.Example;
// 지역 클래스 : 외부클래스 -> 메소드 -> 내부클래스 이렇게 존재하게 됨

class OuterClass2{
    void show(){
        class LocalInner //지역 클래스 선언
        {
            int a = 5;
        }
        LocalInner local = new LocalInner(); //말 그대로 지역변수이기 때문에 지역에서만 선언 가능
        System.out.println(local.a);
    }
}
public class ObjectEX6 {
    public static void main(String[] args) {
        OuterClass2 outer = new OuterClass2();
        outer.show();
        // OuterClass2.LocalInner ... 오류
    }
}




