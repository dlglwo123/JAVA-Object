//[매개변수와 리턴값이 없는 람다식]

package Section1.Object.Effective.Lambda;
public class Lambda_NotReturnMethod {
    public static void main(String[] args) {
        EX1 ex = () -> System.out.println("Exam 호출!");
        ex.exam();
    }
}

interface EX1 {
    void exam();
}