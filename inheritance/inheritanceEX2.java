package Section1.Object.inheritance;
//포함 관계
/*
      [포함관계]
    1. 객체지향프로그래밍에서는 상속보다는 포함관계를 사용하는 경우가 대다수다.
    2. 포함관게와 상속관계중 어느 것을 맺어줄지 선택하는 방법은 클래스간의 관계가 ~은 이다. ~은 을 가지고 있다. 를 대입해서 비교해보면 된다.
    3. ~은 이다. 는 [상속관계]
    4. ~은 을 가지고 있다 [포함관계]
    5. 지금 Student와 School은 학생은 학교다 라는 말은 어울리지 않기 때문에 포함관계를 맺어주는것이 옳다고 생각한다.(학생은 학교를 다니고 있다.)
    6. 상속관계의 경우 동물과 동물 종류로 나눌수 있는데 독수리는 동물이다. 호랑이는 동물이다. 이런것이 상속관계라고 말할 수 있다.
*/
class Student //school클래스로 해당 변수들을 묶어준다음 Student 클래스안에 참조변수를 선언하는 방법으로 코드의 중복을 없애고 포함관계로 재사용 하고 있다.
{
    int studentId;
    String studentName;
    School mySchool; //포함 관계로 써 School 형의 변수 선언
    public Student(int studentId, String studentName,School mySchool)
    {
        this.studentId = studentId;
        this.studentName = studentName;
        this.mySchool = mySchool;
    }
    void show(){
        System.out.println(studentId + "" + studentName);
        System.out.println(mySchool.SchoolName + "" + mySchool.location); // 참조
    }
}
class School //School 의 정보 기입
{
    String SchoolName;
    String location;

    public School(String SchoolName, String location){
        this.SchoolName = SchoolName;
        this.location = location;
    }
}
public class inheritanceEX2 {
    public static void main(String[] args) {
        School school = new School("도곡초등학교","서울시 도곡동"); // 먼저 School형의 인스턴스를 생성하고 student 생성자에 할당
        School school1 = new School("방학초등학교","서울시 방학동");

        Student student = new Student(202312332,"홍길동",school);
        Student student1 = new Student(202312452,"이성훈",school1);

        student.show();
        student1.show();
    }
}
