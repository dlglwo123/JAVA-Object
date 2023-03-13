/*
    [람다식의 기본문법]
    함수[메서드[를 좀 더 간단하고 편리하게 표현하기 위해 고안된 문법요소이다.
    1. 기본적으로 반환타입과 이름을 생략할 수 있다.
    2. 이름없는 함수 즉 익명함수이다.
    3. 람다식은 객체이다. 익명 객체
 */

package Section1.Object.Effective.Lambda;
public class LambdaEX {
    public static void main(String[] args) {
        //() -> {System.out.println("Hello");} 람다식

    }
    void sayHello(){
        System.out.println("HELLO"); // 기존 방식
    }

    int sum(int num1, int num2){
        return num1 + num2;
    }
    // (int num1, int num2) -> num1 + num2 // 람다식
    //메서드 바디에 문장이 실행문 하나만 존재할 떄 중괄호와 return 문을 생략 가능하다. 끝에 세미콜론은 생략해야함
}
