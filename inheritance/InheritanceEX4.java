package Section1.Object.inheritance;
// Super과 Super()
public class InheritanceEX4 {
    public static void main(String[] args) {
        grademiddle student1 = new grademiddle(); //하위클래스 인스턴스 생성
        student1.show();
    }
}

class human{
    int age = 10;
    human(){
        System.out.println("주인공은 10살 입니다.");
    }

}

class grademiddle extends human{
    int age = 14;
    grademiddle(){
        super(); //상위 클래스 생성자 호출
        System.out.println("중학생은 14살이어야 합니다.");
    }
    // [출력결과]
    //주인공은 10살 입니다.
    //중학생은 14살이어야 합니다.


    void show(){
        System.out.println("grademidde 객체 : " + age); // grademiddle 객체
        System.out.println("this : " + this.age); // this => grademidde 자신의 객체
        System.out.println("super : " + super.age); // super => 상위 클래스 human의 객체
    }
    // [출력결과]
    //grademidde 객체 : 14
    //this : 14
    //super : 10
}