package Section1.Object.Example;
//중첩 클래스 : 정적 중첩 클래스

class OuterClass1{
    String str = "외부 클래스 참조";

    static class StaticNestedClass{
        void show(){
            String InnerStr = "정적 중첩 클래스입니다.";
            System.out.println(InnerStr);
            //System.out.println(OuterClass.this.str); 오류 : 정적 중첩 클래스에서 외부 클래스 멤버 접근 X
        }
    }
}

// 정적 중첩 클래스
// 1.외부클래스명.정적 중첩 클래스명 참조변수형 객체 = new 외부클래스명.내부클래스명()

public class ObjectEX5 {
    public static void main(String[] args) {
        OuterClass1.StaticNestedClass staticNestedObj = new OuterClass1.StaticNestedClass();
        staticNestedObj.show();
    }
}
