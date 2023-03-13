package Section1.Object.Tread;

public class ThreadOfCooperation {
    public static void main(String[] args) {
        WorkObject sharedObject = new WorkObject();

        Thread threadA = new ThreadA(sharedObject);
        Thread threadB = new ThreadB(sharedObject);

        threadA.start();
        threadB.start();

    }
}

class WorkObject{
    public synchronized void methodA() // 임계 영역 : A코드가 실행중일 때 다른스레드 임계영역내의 코드를 실행 X
    {
        System.out.println("ThreadA의 methodA Working");
        notify(); // 자신의 작업을 완료 후 스레드 B와 교대하기 위해서 호출
        try{ wait();} catch (Exception e){} // 호출을 했으면 자신을 일시 정지 상태로 전환
    }
    public synchronized void methodB(){
        System.out.println("ThreadB의 methodB Working");
        notify();
        try{ wait();} catch (Exception e){}
    }
}

class ThreadA extends Thread{
    private WorkObject workObject;

    public ThreadA(WorkObject workObject) {
        this.workObject = workObject;
    }

    public void run(){
        for(int i = 0; i < 10; i++){
            workObject.methodA();
        }
    }
}

class ThreadB extends Thread{
    private WorkObject workObject;

    public ThreadB(WorkObject workObject) {
        this.workObject = workObject;
    }

    public void run(){
        for(int i = 0; i < 10; i++){
            workObject.methodB();
        }
    }
}

