package Section1.Object.Tread;

public class ThreadOfRunnable {
    public static void main(String[] args) {
        Runnable test1 = new ThreadTest(); //Runnable 인터페이스를 구현한 객체 생성

        Thread thread = new Thread(test1); //Runnable 구현 객체를 Thread 클래스를 인스턴스화하여 스레드를 생성

        thread.start();

        for(int i = 0; i < 100; i++){
            System.out.print("@");
        }

        // Thread tread = new Thread(new Thread(new ThreadTest())); //위의 두 줄을 아래와 같이 한 줄로 축약할 수도 있다.
    }
}

class ThreadTest implements Runnable //Runnable 인터페이스에 구현된 메서드 run()
{
    @Override
    public void run() // 수행할 코드 작성
    {
        for(int i = 0; i < 100; i++){
            System.out.print("#");
        }
    }
}
