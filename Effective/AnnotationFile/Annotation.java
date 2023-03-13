/* [애노테이션]
    1. 소스코드가 컴파일되거나 실행될 때에 컴파일러 및 다른 프로그램에게 필요한 정보를 전달해주는 문법 요소이다.
    - 표쥰 에너테이션 : JDK에 내장되어있는 일반적인 애너테이션
    - 메타 에너테이션 : 다른 에너테이션을 정의할 때 사용하는 애너테이션
    - 사용자 정의 에너테이션 : 사용자가 직접 정의해서 사용가능
 */
package Section1.Object.Effective.AnnotationFile;

interface ExampleInterface{
    void example();
}

public class Annotation implements ExampleInterface{
    @Override // 에노테이션 : example()이 추상메서드를 구현하거나 상위 클래스의 메서드를 오버라이딩한 메서드라는 것을 컴파일러에게 알려주는 역할
    public void example() {

    }
}
