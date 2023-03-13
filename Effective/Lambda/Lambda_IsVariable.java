package Section1.Object.Effective.Lambda;

public class Lambda_IsVariable {
    public static void main(String[] args) {
        Ex e;
        e = (x) -> {
            int result = x * 5;
            System.out.println(result);
        };
        e.example(5);

        e = (x) -> System.out.println(x * 5);

        e.example(5);
    }
}


interface Ex{
    void example(int x);
}