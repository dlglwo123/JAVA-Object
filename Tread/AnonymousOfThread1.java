//[Thread 익명 하위 객체를 활용한 스레드 생성 및 실행]

package Section1.Object.Tread;
public class AnonymousOfThread1 {
    public static void main(String[] args) {
        Thread thread = new Thread() {
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.print("#");
                }
            }
        };
        thread.start();

        for (int i = 0; i < 100; i++) {
            System.out.print("@");

        }
    }
}
