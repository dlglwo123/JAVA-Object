package Section1.Object.Example;
//내부 클래스

class OuterClass{
    private String str = "This를 이용해서 외부 클래스를 내부클래스에 참조합니다.;"; //필드 멤버변수
    private String str1;
    class InnerClass //내부 클래스
    {
        public void show() // 내부클래스의 메서드
        {
            //System.out.println(OuterClass.str); 오류 : this를 사용해서 외부클래스에 접근해야함
            System.out.println(OuterClass.this.str); // this를 이용해서 외부 클래스 접근
            System.out.println("InnerClass 내부 호출");
        }
    }

    private class privateInnerClass //privateInner class
    {
        public void show(){
            System.out.println("privateInnerClass 내부 호출");
        }
    }

}
//내부 클래스 호출하는 방법
//1. 먼저 외부 클래스를 인스턴스화 한다.
//2. 외부 클래스명.내부클래스명 참조변수형 = 외부 참조변수형.new 내부클래스명
//3. 출력하고자 하는 참조 변수형.메서드
public class ObjectEX4 {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass Inner = outer.new InnerClass();//2. 외부 클래스명.내부클래스명
        // OuterClass.PrivateInnerClass PInner = outer.new PrivateInnerClass(); 오류
        Inner.show();
    }
    // ========================== 오류 내용 =================================
    // privateInnerClass가 private으로 정의 되었으므로 Outer클래스 외부에서 접근 X
    // 따라서 PrivateInnerClass는 Outer클래스 외부에서 인스턴스화 할 수 없다.
}
