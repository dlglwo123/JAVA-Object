/*
    [함수형 인터페이스]
    1. 익명 객체는 익명 클래스를 통해 만둘수 있는데
       익명클래스란 객체의 선언과 생성을 동시에 하여 오직 하나의 객체를 생성하고,단 한번만 사용되는 일회용 클래스이다.
    2. 기존의 인터페이스 문법을 활용하여 람다식을 다루는 것이라 할 수 있다.
    3. 함수형 인터페이스에는 단 하나의 추상 매서드만 선언될수 있는데 이는 람다식과 인터페이스의 메서드가 1 : 1로 매칭되어야 하기 때문에
 */


package Section1.Object.Effective.Lambda;
public class Lambda_MethodInterface {
    public static void main(String[] args) {
        Lambda_Method method = (num1,num2) ->num1 + num2;
        System.out.println(method.sum(2,5));
    }
}

interface Lambda_Method // 함수형 인터페이스 선언
{
    int sum(int num1,int num2);
}
