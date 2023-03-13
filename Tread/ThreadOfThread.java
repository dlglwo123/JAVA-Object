package Section1.Object.Tread;

public class ThreadOfThread {
    public static void main(String[] args) {
        ThreadEx treadEx = new ThreadEx(); //Runnable과 차이점 : Thread를 인스턴스화 하지 않아도 된다.

        treadEx.start();

        for(int i = 0; i < 100; i++){
            System.out.print("@");
        }
    }
}
class ThreadEx extends Thread{
    public void run() // Thread의 run() 메서드 오버라이딩
    {
        for(int i = 0; i < 100; i++){
            System.out.print("#");
        }
    }
}
