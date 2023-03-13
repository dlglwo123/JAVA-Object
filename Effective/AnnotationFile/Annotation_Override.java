/* [표준 에너테이션]
    1. @Override : 메서드 앞에만 붙일 수 있는 애너테이션(선언한 메서드가 상위 클래스의 메서드를 오버라이딩하거나 추상 메서드를 구현하는 메서드라는 것을 컴파일러에게 알려주는 역할)

 */

package Section1.Object.Effective.AnnotationFile;

class SuperClass{
    public void example(){
        System.out.println("상위클래스 @Override!!");
    }
}
class Class extends SuperClass{
    @Override
    public void example() {
        super.example();
    }
    /* => @Override를 붙이지 않으면 새로운 매서드를 정의하는 것으로 간주하고 에러를 발생시키지 않는다.
       => @Override를 사용하면 example()이 오버라이딩 메서드라는 것을 컴파일러가 인지하고, 상위 클래스에 example()이 존재하는지 확인하기 때문에, 이러한 상황을 방지
    public void exmaple(){
        super.example();
    }
     */
}

public class Annotation_Override {

}
