//[스레드 이름 조회하기]

package Section1.Object.Tread;
public class ThreadOfName {
    public static void main(String[] args) {
        Thread thread = new Thread(){
            public void run(){
                System.out.println("Thread GetName");
            }
        };
        Thread thread1 = new Thread(){
            public void run(){
                System.out.println("Thread GetName1");
            }
        };


        System.out.println("Thread Name : " + thread.getName());
        System.out.println("Thread Name : " + thread1.getName());
    }
}
