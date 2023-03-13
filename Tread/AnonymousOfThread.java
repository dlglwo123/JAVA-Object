//[Runnable 익명 구현 객체를 활용한 스레드 생성 및 실행]

package Section1.Object.Tread;
public class AnonymousOfThread {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.print("@");
                }
            }
        });

        thread.start();

        for(int i = 0; i < 100; i++){
            System.out.print("#");
        }
    }
}
