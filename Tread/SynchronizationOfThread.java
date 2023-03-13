/*[스레드의 동기화]
1. 멀티 스레드 프로세스 경우, 두스레드가 동일한 데이터를 공유하게 되어 문제가 발생할 수 있다.

 */
package Section1.Object.Tread;
public class SynchronizationOfThread {
    public static void main(String[] args) {
        Runnable thread3 = new ThreadEx3();

        Thread thread3_1 = new Thread(thread3);
        Thread thread3_2 = new Thread(thread3);

        thread3_1.setName("Java");
        thread3_2.setName("C++");

        thread3_1.start();
        thread3_2.start();
    }
}
class Account // 계좌 클래스
{

    private int balance = 1000; // 잔액을 나타내는 필드


    public int getBalance() {
        return balance;
    }

    // 인출 성공시 true, 실패시 false 반환
    public synchronized boolean CheckBalance(int money){

            //인출 가능 여부 판단
            if (balance >= money) {

                //if문의 실행부에 진입하자마자 해당 스레드를 일시 정지 시키고
                //다른 스레드에게 제어권을 강제로 넘긴다.
                // 일부러 문제 상황을 발생시키기 위해 만든 코드
                try {
                    Thread.sleep(1000);
                } catch (Exception error) {
                }

                balance -= money;
                return true;
            }

            return false;
    }
}

class ThreadEx3 implements Runnable{

    Account account = new Account();
    @Override
    public void run() {
        while(account.getBalance() > 0){

            // 100~300원씩 인출금을 랜덤 지정
            int money = (int)(Math.random()* 3 + 1) * 100;
            //CheckBalanc를 실행시키는 동시에 인출 성공 여부를 변수에 할당
            boolean Denied = !account.CheckBalance(money); //false false 값이면 denied에 값이 입력됨 앞에 !붙었기 때문에 CheckBalace가 false면

            //[인출 결과 확인]
            // 인출 실패시 Denied 출력
            System.out.println(String.format("인출금 : %d  By  %s. 계좌잔고 :  %d  %s ", money,Thread.currentThread(),account.getBalance(),Denied ? "Denied" : " "));
        }
    }
}