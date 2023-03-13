package Section1.Object.polymorphism;
/*
     [다향성]
[참조변수의 타입 변환]
타입변환을 위해 가져야할 세가지 조건

1. 서로 상속관계에 있는 상위 클래스 - 하위 클래스 사이에만 타입 변환이 가능하다
2. 하위 클래스 타입에서 상위 클래스 타입으로의 타입변환(업 캐스팅)은 형변환 연산자를 생략할 수 있다.
3. 반대로 상위 클래스에서 하위 클래스 타입으로 변환(다운캐스팅)은 형변환 연산자를 반드시 명시해야한다.
    - 또한 다운 캐스팅은 업 캐스팅이 되어 있는 참조 변수에 한해서만 가능하다.
 */

public class polymorphismEX1 {
    public static void main(String[] args) {
        Car car = new Car();
        Vehicle vehicle = (Vehicle) car; // 업 캐스팅 : 하위 클래스 타입에서 상위 클래스 타입변환(괄호 생략 가능)
        Car car2 = (Car) vehicle; //다운 캐스팅 : 상위클래스가 하위클래스로 타입변환(괄호 생략 불가능)
        //MoterBike moterBike = (MoterBike) car // 상속 관계가 아니기 때문에 오류
    }
}
/*
    먼저 Car 클래스의 인스턴스 객체 car을 생성하고,
    그 객체를 가리키는 참조변수 vehicl의 타입을 Vehicle로 지정하여 참조변수의 타입변환 실행
    즉 vehicle의 참조 변수는 Vehicle 이다.
    car의 참조변수는 Car
    그래서 업 캐스팅 같은 경우 참조변수 Car의 car을 Vehicle의 참조변수로 바꾸기 위해 Vehicle vehicle = car (Vehicle은 생략가능)
    다운캐스팅의 걍우 반대로 Car car = (Car) vehicle (괄호 생략 불가능)

 */

class Vehicle //상위 클래스 선언
{
    String model;
    String color;
    int wheels;

    void startEngine(){
        System.out.println("시동 걸기");
    }
    void accelerate(){
        System.out.println("속도 올라기");
    }
    void brake(){
        System.out.println("브레이크");
    }
}

class Car extends Vehicle //하위 클래스 Car에 상위클래스 Vehicle 상속
{
    void giveRide(){
        System.out.println("다른 사람 태우기");
    }
}

class MoterBike extends Vehicle //하위 클래스 MoterBike에 상위클래스 Vehicle 상속
{
    void performance(){
        System.out.println("묘기 부리기");
    }
}