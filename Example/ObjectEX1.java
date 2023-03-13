package Section1.Object.Example;

public class ObjectEX1 {
    public static void main(String[] args) {
        ob.num = 1;
        System.out.println(ob.num);
        ob.Math(); //
        // System.out.println(ob.num2); 오류 : 인스턴스 변수는 클래스명.클래스 변수명으로 선언할 수 없다.
        // 인스턴스 변수는 인스턴스를 생성하고 참조변수.인스턴스 변수로 선언해야함
    }
}
    class ob{
    static int num; // static 변수를 통한 클래스 변수
    // 클래스 변수에 static을 선언할 경우 모든 인스턴스가 특정한 값을 공유할 때 사용
    int num2; //인스턴스 변수 , 멤버 변수

    static void Math(){
        int result = 0; // 지역변수 : 스택 메모리에 저장, 지역변수는 반드시 초기화를 시켜줘야함
        System.out.println(result);
    }
}
