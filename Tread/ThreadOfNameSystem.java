//[스레드 이름 설정하기]
package Section1.Object.Tread;
public class ThreadOfNameSystem {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() //익명 객체를 이용한 Thread
        {
            @Override
            public void run() {
                System.out.println("Thread SetName");
            }
        });

        thread.start();

        System.out.println("Thread SetName : " + thread.getName()); // Thread 이름 조회하기 GetName

        thread.setName("Myname Is JAVA"); // Thread 이름 설정 SetName

        System.out.println("Thread SetName : " + thread.getName());
    }
}
