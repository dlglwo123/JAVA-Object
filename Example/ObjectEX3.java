package Section1.Object.Example;
// 메서드 오버라이딩
public class ObjectEX3 {
    public static void main(String[] args) {
        Shape s = new Shape();

        s.area(); // 넓이 구하기 출력
        s.area(5); // 원 넓이
        s.area(10,10); // 직사각형 넓이
        s.area(6.0,12.0); // 삼각형 넓이
    }
}

class Shape{
    public void area()
    {
        System.out.println("넓이 구하기");
    }
    public void area(int r){
        System.out.println("원의 넓이 : " + r*r*3.14);
    }
    public void area(int w,int l){
        System.out.println("삼각형의 넓이 : " + w*l);
    }
    public void area(double b,double h){
        System.out.println("삼각형의 넓이 : "  + 0.5*b*h);
    }

}
