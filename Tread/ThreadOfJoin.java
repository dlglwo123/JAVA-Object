package Section1.Object.Tread;

public class ThreadOfJoin {
    public static void main(String[] args) {
        SumThread sumThread = new SumThread();

        sumThread.setTo(10);

        sumThread.start();

        try{sumThread.join();} catch (Exception e){} //메인스레드가 sumThread 작업이 끝날때 까지 기다린다.

        System.out.println(String.format("1부터 %d까지의 합 : %d",sumThread.getTo(),sumThread.getSum()));
    }
}


class SumThread extends Thread{
    private long sum;
    private int to;

    public long getSum() {
        return sum;
    }

    public int getTo() {
        return to;
    }

    public void setTo(int to) {
        this.to = to;
    }
    public void run(){
        for(int i = 0; i <= to; i++){
            sum += i;
        }
    }
}