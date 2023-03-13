package Section1.Object.inheritance;
//상속 관계
class Person //상위 클래스 선언
{
    int age;
    String name;

    void learn(){
        System.out.println("사람이 배운다.");
    }
    void walk(){
        System.out.println("사람이 걷는다.");
    }
    void eat(){
        System.out.println("사람이 먹는다.");
    }
}

class programer extends Person //Person 클래스로 부터 programer 클래스가 확장되었다.
{
    String companyName;

    public programer(int age, String name,String companyName) // 상속 받았기 떄문에 생성자 초기화가 가능
    {
        this.age = age; //상위클래스 상속
        this.name = name; //상위 클래스 상속
        this.companyName = companyName; //하위 클래스
    }
    void coding(){
        System.out.println("코딩을 합니다.");
    }
}
class Dancer extends Person{
    String groupName;

    void dancing(){
        System.out.println("춤을 춥니다.");
    }
}

class Singer extends Person{
    String bandName;

    void singing(){
        System.out.println("노래를 부릅니다.");
    }
}

public class inheritanceEX1 {
    public static void main(String[] args) {
        Person p = new Person();
        programer pro = new programer(25,"kim mill","Kakao");
        System.out.println(pro.age); //상위클래스로 부터 상속
        System.out.println(pro.name);//상위클래스로 부터 상속
        System.out.println(pro.companyName);//하위 클래스
        pro.eat(); //상위클래스로 부터 상속
        pro.coding();//하위 클래스
    }
}
