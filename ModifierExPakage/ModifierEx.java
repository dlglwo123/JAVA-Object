package Section1.Object.ModifierExPakage;
/*
  [제어자]
  클래스,필드,메서드,생성자 등 부가적인 의미를 부여하는 키워드
  제어자는 접근 제어자, 기타제어자로 구분할 수 있다.
 */
public class ModifierEx {
    private String str = "private 접근 제어자 입니다"; //동일 패키지의 동일한 클래스에 있기 때문에 접근가능
    String str1 = "default 접근 제어자 입니다.";
    protected String str2 = "protected 접근 제어자입니다";
    public String str3 = "public 접근 제어자 입니다.";

    void show(){
        System.out.println(str);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}
class Test{
    public static void main(String[] args) {
        ModifierEx ex = new ModifierEx();
        ex.show(); //show는 동일 클래스이기 때문에 에러 발생 X
        System.out.println("========================");
        // System.out.println(ex.str); //에러 발생 : 동일 클래스가 아니기 때문에
        System.out.println(ex.str1);
        System.out.println(ex.str2);
        System.out.println(ex.str3);
    }
}
/*
    [출력결과]
    private 접근 제어자 입니다
    default 접근 제어자 입니다.
    protected 접근 제어자입니다
    public 접근 제어자 입니다.
    ========================
    default 접근 제어자 입니다.
    protected 접근 제어자입니다
    public 접근 제어자 입니다.
 */