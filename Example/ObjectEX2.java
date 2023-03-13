package Section1.Object.Example;

public class ObjectEX2 {
    public static void main(String[] args) {
        StaticExample ex = new StaticExample();
        StaticExample ex1 = new StaticExample();
        System.out.println(ex.num1); //인스턴스 변수
        System.out.println(StaticExample.num2); // 정적 변수
        // ============== 객체 간 공유 변수 성질 알아보기 =================
        System.out.println("============== 객체 간 공유 변수 성질 알아보기 =================");
        ex.num1 = 20; //정적 변수가 아닌 인스턴스 변수에 값을 넣어봤을때
        ex1.num1 = 150;
        System.out.println(ex.num1); // 20
        System.out.println(ex1.num1); // 150
        ex.num2 = 20; //정적 변수에 값을 넣어봤을때
        ex1.num2 = 150;
        System.out.println(ex.num2); // 150 마지막 값을 공유하고 있는것을 확인할 수 있음
        System.out.println(ex1.num2); // 150
        System.out.println("============== 정적 메서드 안에 인스턴스 변수를 참조할 수 없음 =================");
        ex.staticMethod();
        ex.Method();

    }
}

class StaticExample {
    int num1 = 1;
    static int num2 = 2; //정적 변수는 num2의 한 공간에 대한 값들을 모두 공유한다.

    static void staticMethod(){
        // System.out.println(num1);  오류 : static 메서드에는 인스턴스 변수를 선언할 수 없다(static은 모든 값들을 공유하지만 인스턴스 변수는 독립적인 공간이기 때문에
        System.out.println(num2);
    }
    void Method(){
        System.out.println(num1);
        System.out.println(num2);
    }


}
