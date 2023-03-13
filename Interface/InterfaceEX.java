package Section1.Object.Interface;

/*
    [인터페이스]
    - 인터페이스도 추상 클래스처럼 자바에서 추상화를 구현하는 데 활용된다는 점에서 동일하지만 인터페이스는 더 높은 추상성을 가지고 있다.
    - 추상 클래스 : 추상 메서드(메서드 바디가 없는)를 하나 이상 포함한다는 점외에는 일반 클래스와 동일하다.
    - 인터페이스 : 기본적으로 추상메서드와 상수만을 멤버로 가질 수 있다.
    [인터페이스 구현]
    1. 특정 인터페이스를 구현한 클래스는 해당 인터페이스에 정의된 모든 추상메서드를 구현해야한다.
    2. 어떤 클래스가 특정 인터페이스를 구현한다는 것 ⇒ 클래스에게 인터페이스의 추상메서드를 반드시 구현하도록 강제하는 것
    3. 모든 추상 메서드들을 해당 클래스내에서 오버라이딩하여 바디를 완성한다는 의미
    [인터페이스 다중구현]
    class SuperCar implements Color, price 부분을 보면 확인 가능
 */
public class InterfaceEX {
    public static void main(String[] args) {
        SuperCar superCar = new SuperCar();
        // Car car = new Car(); //다운 캐스팅을 하기위해서는 업캐스팅이 되어야함
        Car car = new nomalCar(); // 업캐스팅
        nomalCar kiaCar = (nomalCar) car; //다운캐스팅

        superCar.color();
        superCar.price();
        System.out.println("==================");
        car.sound();
        ((nomalCar) car).color();
        ((nomalCar) car).price();
    }
}

interface Color{
    public abstract void color();
}
interface price{
    void price(); //public abstract 자동 생성
}


class Car{
    public void sound(){
        System.out.println("부릉부릉");
    }
}
class SuperCar implements Color, price //인터페이스 다중구현
{
    @Override
    public void color() // 반드시 인터페이스에 구현된 추상 메서드는 구현해야함
    {
        System.out.println("Black");
    }

    @Override
    public void price() {
        System.out.println("가격 : 3억");
    }
}

class nomalCar extends Car implements Color,price // 상속하면서 동시에 인터페이스 구현 가능
{
    @Override
    public void color() {
        System.out.println("화이트");
    }
    @Override
    public void price() {
        System.out.println("가격 : 5000만원");
    }
}
