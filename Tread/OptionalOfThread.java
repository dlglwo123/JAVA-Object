package Section1.Object.Tread;

public class OptionalOfThread {
    public static void main(String[] args) {
            Thread thread = new Thread(){
            public void run(){
                try{ Thread.sleep(1000);}
                catch (Exception e){}
                System.out.println("Woke UP!!");
            }
        };

        System.out.println("Thread 상태 확인 : " + thread.getState()); // new

        thread.start();

        System.out.println("Thread 상태 확인 : " + thread.getState()); // Runnable : start에 의해 실행 대기 상태

        while(true){
            if(thread.getState() == Thread.State.TIMED_WAITING)
            {
                System.out.println("Thread 상태확인 : " + thread.getState()); // sleep에 의해서 실행 대기 상태(실행)
                break;
            }
        }

        thread.interrupt(); // sleep 중인 스레드에 예외를 발생 시킨다.

        while(true){
            if(thread.getState() == Thread.State.RUNNABLE) // interrupt에 의해서 상태 변화 : 실행
            {
                System.out.println("Thread 상태확인 : " + thread.getState());
                break;
            }
        }

        while(true){
            if(thread.getState() == Thread.State.TERMINATED) // run의 마지막 코드 println을 출력하면서 종료되어 TERMINATE 상태
            {
                System.out.println("Thread 상태확인 : " + thread.getState());
                break;
            }
        }
    }
}
/* [ 실행결과]
Thread 상태 확인 : NEW
Thread 상태 확인 : RUNNABLE
Thread 상태확인 : TIMED_WAITING
Woke UP!!
Thread 상태확인 : RUNNABLE
Thread 상태확인 : TERMINATED
 */
