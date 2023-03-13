package Section1.Object.Effective.Lambda;

import java.util.function.IntBinaryOperator;

public class NewFile {
    public static void main(String[] args) {
        IntBinaryOperator operator;

        operator = Calc :: method;
        System.out.println(operator.applyAsInt(2,4));
    }
}

class Calc{
    public static int method(int x, int y){
        return x + y;
    }
    public static int instance(int x, int y){
        return x + y;
    }
}