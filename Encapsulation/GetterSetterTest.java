package Section1.Object.Encapsulation;
/*
    [getter, setter]
    접근제어자가 선언되어있는 객체의 변수의 데이터값을 추가하거나 수정하고 싶을때 사용한다.
    private 같은 경우 같은 클래스가 아니면 오류가 발생하는데 get set 메서드를 통해 오류룰 해결하고 객체변수에 접근이 가능하다.
    - Setter : 외부에서 메서드에 접근하여 조건이 맞을 경우 데이터 값을 변경 가능하게 해준다.
    - Getter : 설정한 변수 값을 읽어 오는데 사용한다.

    경우에 따라 객체 외부에서 필드값을 사용하기에 부적절한 경우가 발생할 수 있는데 이런 경우 그 값을 가공한 이후에 외부에 전달하는 역할을 하게 된다.
    [데이터를 효과적으로 보호하면서도 의도하는 값으로 값을 변경하여 캡슐화보다 효과적으로 달성이 가능하다.]
 */
public class GetterSetterTest {
    public static void main(String[] args) {
        Worker employee = new Worker();
        employee.setAge(19); // set ()안의 조건이 맞으면 값을 변경
        employee.setname("홍길동");
        employee.setjob("프로그래머");

        System.out.println(employee.getage()); //get 변경된 값을 출력
        System.out.println(employee.getname());
        System.out.println(employee.getjob());
    }
}
class Worker{
    private int age = 11; //private으로 선언
    private String name = "이름 없음";
    private String job = "직업 없음";

    public int getage() //get 메서드 : 설정한 변수값을 읽어온다. 읽고 값을 반환해야하기 때문에 타입은 반환가능한 타입이어야 한다.
    {
        return age;
    }
    public void setAge(int age) //set 메서드 : 외부에서 메서드에 접근해 조건이 맞을 경우 데이터 값 변경을 가능하게 함.
    {
        if(age < 1) return;
        this.age = age;
    }
    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name = name;
    }
    public String getjob(){
        return job;
    }
    public void setjob(String job){
        this.job = job;
    }
}
/*[실행결과]
    19
    홍길동
    프로그래머
 */
