package Section1.Object.Collection;

// 래퍼 클래스 : 산술 연산을 위해 정의된 클래스는 기본 타입 연산자이고 래퍼클래스는 값을 참조하기 위해 새로운 인스턴스를 생성하고, 생성된 인스턴스 값만을 참조할 수 있게 박싱된 상태
// 타입을 구체적으로 지정하는 것이 아니라, 추후에 지정할 수 있도록 일반화 해 두는것
// 작성한 클래스 또는 메서드의 코드가 특정 데이터 타입에 얽매이지 않게 해둔것
// 만약 다른 타입 매개변수와 같이 활용하기 위해서는 <T,F ... > 이렇게 쓰면된다.
class Basket<T>{
    private T name;

    Basket(T name) {
        this.name = name;
    }
    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }
}
public class GenericEX {
    public static void main(String[] args) {
        Basket basket = new Basket(1);
        System.out.println(basket.getName());
    }
}
