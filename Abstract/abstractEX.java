package Section1.Object.Abstract;

/*
    [추상화]
1. 상속 관계에 있어 샐로운 클래스를 작성하는데 매우 유용
    - 메서드의 내용이 상속을 받는 클래스에 따라서 종종 달라지기 때문에
    상위클래스에서는 선언부만 작성하고 실제 구체적인 내용은 하위클래스에서 구현하도록 비워둔다 => 상황이 변함에 따라 유연하게 대응 가능
    상속 계층도의 상층부에 위치할수록 추상화 정도가 높고 그 아래로 내려갈수록 구체화 된다.
    상측부에 가까울수록 더 공통적인 속성과 기능들이 정의된다.
 */
public class abstractEX {
    public static void main(String[] args) {
        Animal dog = new Dog(); //업 캐스팅
        dog.sound();
        Animal cat = new Cat();
        cat.sound();
    }
}

abstract class Animal{
    public String kind;
    public abstract void sound(); // 추상 메서드 선언
}

class Dog extends Animal {
    public Dog(){
        this.kind = "포유류";
    }
    public void sound() // => 메서드 오버라이딩 추상 메서드 구현
    {
        System.out.println("멍멍");
    }
}
class Cat extends Animal{
    public Cat(){
        this.kind = "포유류";
    }
    public void sound() // => 메서드 오버라이딩 추상 메서드 구현
    {
        System.out.println("냐옹");
    }
}
