package Section1.Object.Interface;
public class InterfaceEX1 {
    public static void main(String[] args) {
        Person p = new Person(new Teacher());
    }
}

interface Job{
    void jobname(); //추상 메서드
}

class Person //인터페이스를 구현함에 따라서 Person의 코드수정이 이루어 지지않고 실행이가능하다.
{
    public Person(Job job){
        job.jobname();
    }
}

class Student implements Job{
    @Override
    public void jobname() {
        System.out.println("저는 학생입니다.");
    }
}
class Teacher implements Job{
    @Override
    public void jobname() {
        System.out.println("저는 선생님입니다.");
    }
}

// 밑의 예제는 Person에 student가 의존상태이기 때문에 Person에 코드 수정이 불가피하다
// => 인터페이스를 구현해서 Person 클래스 코드수정이 이루어지지 않게 구현


/*public class InterfaceEX1 {
    public static void main(String[] args) {
        Person p = new Person(new Teacher());
    }
}
class Person{
    public Person(Student student){
        student.show();
    }
}
class Student{
    public void show(){
        System.out.println("저는 학생입니다.");
    }
}

class Teacher{
    public void show(){
        System.out.println("저는 선생입니다.");
    }
}

 */