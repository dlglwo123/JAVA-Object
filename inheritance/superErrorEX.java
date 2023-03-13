package Section1.Object.inheritance;
//- super(), this()는 생성자 안에서만 사용가능하고 반드시 첫줄에 와야한다.
//- 만약 super()가 없는 경우에는 컴파일러가 생성자의 첫 줄에 자동으로 super()를 삽입한다.
//
//이때 상위 클래스에 기본생성자가 없다면 에러를 발생하게 된다. ⇒ 기본 생성자를 생성하는것을 습관화
public class superErrorEX {
    public static void main(String[] args) {
        SuperEx1 s = new SuperEx1();
    }
}

class SuperEx{
     SuperEx(){
        System.out.println("[컴파일러] 자동 생성자 생성");
        }
}
class SuperEx1 extends SuperEx{
    SuperEx1(){
        //super(); 상속 관계에 있을때 컴파일러가 자동으로 super()을 삽입한다.
        System.out.println("SuperEX1 생성자!!");
    }
}
//[출력결과]
//[컴파일러] 자동 생성자 생성
//SuperEX1 생성자!!