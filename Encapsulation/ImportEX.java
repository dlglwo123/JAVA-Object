package Section1.Object.Encapsulation;
//[참고]지금은 같은 패키지에 있다. 만약 ImportEX가 다른 패키지에 가도 실행되도록 만든 파일이다.
/*
[import]
다른 패키지 내의 클래스를 사용하기 위해 사용한다.
(Import 문 없이 다른 패키지 클래스를 사용하기 위해서는 아래와 같이 매번 패키지명을 붙여주어야 하는데,
 import 문을 사용하면 사전에 컴파일러에게 소스파일에 사용된 클래스에 대한 정보를 제공한다.)
 */
import Section1.Object.Encapsulation.pakageEX; // pakageEX 패키지를 임포트
public class ImportEX {
    public static void main(String[] args) {
        pakageEX ex = new pakageEX(); //다른 패키지를 인스턴스 생성
        ex.show(); // 출력 문구
    }
}
//[출력결과] : 패키지를 import 합니다.
