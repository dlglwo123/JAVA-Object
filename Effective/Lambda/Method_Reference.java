/*
    [메서드 래퍼런스]
    1. 불필요한 매개변수를 제거할 때 사용
    2. 더욱더 간단하게 사용하기 위해
    3. (Double)BinaryOperator 사용 : (자료형)BinaryOperator -> 값을 적용할때 apply...
 */
package Section1.Object.Effective.Lambda;

import java.util.function.DoubleBinaryOperator;

public class Method_Reference {
    public static void main(String[] args) throws Exception {
        DoubleBinaryOperator operator;
        operator = Calculator :: staticMethod;
        System.out.println("정적 메서드 결과" + operator.applyAsDouble(4,5)); // 9.0

        Calculator calculator = new Calculator();
        operator = Calculator :: instanceMethod;
        System.out.println("인스턴스 메서드 결과 " + operator.applyAsDouble(5,6)); // 30.0
    }
}

class Calculator{
    public static double staticMethod(double x, double y) {
        return x + y;
    }
    public static double instanceMethod(double x, double y) {
        return x * y;
    }
}