package Section1.Object.inheritance;
//메서드 오버라이딩
/*
1. 메서드의 선언부(메서드 이름,메개변수,반환타입)이 상위 클래스의 그것과 완전히 일치해야한다.
2. 접근 제어자의 범위가 상위 클래스의 메서드보다 같거나 넓어야 한다.
3. 예외는 상위 클래스의 메서드보다 많이 선언할 수 없다.
 */
public class inheritanceEX3 {
    public static void main(String[] args) {
        tiger t = new tiger();
        eagle e = new eagle();
        monkey m = new monkey();

        t.hunt();
        e.hunt();
        m.hunt();
    }
}
/*
[출력 결과]
호랑이가 동물을 사냥합니다.
독수리가 비행동물을 사냥합니다.
원숭이가 바나나를 찾고 있습니다.
 */
// 여기서 왜 상속을 했음에도 불구하고 animal hunt()의 값이 나오지 않았을까? 상위 클래스에 정의된 메서드를 하위 클래스에서 메서드의 동작을
// ==> 즉 상위 클래스로부터 상속받은 메서드의 내용을 변경하고자 할때 사용
class animal{
    void hunt(){
        System.out.println("동물이 사냥을 합니다.");
    }
}
class tiger extends animal{
    void hunt(){
        System.out.println("호랑이가 동물을 사냥합니다.");
    }
}
class eagle extends animal{
    void hunt(){
        System.out.println("독수리가 비행동물을 사냥합니다.");
    }
}
class monkey extends animal{
    void hunt(){
        System.out.println("원숭이가 바나나를 찾고 있습니다.");
    }
}