package Section1.Object.Effective.Lambda;

public class Lambda_IsReturn {
    public static void main(String[] args) {
        Example e;

        e = (x, y) -> x + y;
        System.out.println(e.example(3, 5));

        e = (x, y) -> x - y;
        System.out.println(e.example(3, 5));

        //"---------[함수형 인터페이스 풀이(return 및 중괄호 생략 X]---------");
        // [풀이]
        e = (x, y) -> {
            int result = x * y;
            return result;
        };
        int result1 = e.example(2, 5);
        System.out.println(e.example(2, 5));

    }

}
interface Example{
    int example(int x, int y);
}

