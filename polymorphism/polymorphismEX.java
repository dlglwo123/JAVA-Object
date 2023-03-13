package Section1.Object.polymorphism;
/*
    [다향성]
- 하나의 객체가 여러 가지 형태를 가질 수 있는 성질
- 한 타입의 참조변수를 통해 여러 타입의 객체를 팜조할 수 있도록 만든 것
(구체적으로, 상위클래스 타입의 참조변수를 통해서 하위 클래스의 객체를 참조할 수 있도록 허용한 것이다.)
 */

class Eat{
    public void eating(){
        System.out.println("사람이 밥을 먹습니다.");
    }
}

class koreaFood extends Eat{
    public void eating(){
        System.out.println("한식을 먹습니다.");
    }
}

class japanFood extends Eat{
    public void eating(){
        System.out.println("일식을 먹습니다.");
    }
}
public class polymorphismEX {
    public static void main(String[] args) {
        Eat eat = new Eat(); // 객체 타입(new 00)과 참조변수 타입(앞)이 일치하는 경우
        japanFood jFood = new japanFood();
        Eat kFood = new koreaFood(); // 객체 타입과 참조변수 타입의 불일치
        // 중요 ==> 상위클래스를 참조변수의 타입으로 지정했기 때문에 참조변수가 사용할 수 있는 멤버의 개수는 상위클래스의 멤버의 수가 된다.
        // 중요 ==> 이것이 앞에서 말했던 '상위클래스 타입의 참조변수로 하위 클래스의 객체를 참조하는것'

        //GirlFriend friend1 = new Friend(); -> 하위클래스 타입으로 상위클래스 객체 참조 -> 불가능
        // koreaFood kfood = new japanFood(); 상속 관계가 아니기 때문에 오류
        //Eat eat = (Eat) jFood; // 업캐스팅
        //koreaFood kFood = (koreaFood) eat; //다운캐스팅

        eat.eating(); // 사람이 밥을 먹습니다 => 객체 타입과 참조변수가 일치
        jFood.eating(); //

        kFood.eating(); // 한식을 먹습니다
    }
}
