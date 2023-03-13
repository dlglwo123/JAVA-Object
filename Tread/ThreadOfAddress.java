//[스레드 인스턴스의 주소값 얻기]

package Section1.Object.Tread;
public class ThreadOfAddress {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()); // 작업 Thread : 메인 Thread와 메인 먼저 실행후 병렬적으로 실행
            }
        });

        thread.start();

        System.out.println(Thread.currentThread().getName()); // main Thread : 가장 먼저 출력
    }
}
/*  [출력 결과]
    main
    JAVA
 */
