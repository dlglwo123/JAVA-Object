package Section1.Object.Example;
// 1. 영화에 대한 클래스 (속성 : 영화관, 자리, 예약번호, 금액)
public class ObjectEX {
    public static void main(String[] args) {
        movie titanic = new movie("노원 CGV",12000,"N24532K4954","G24");
        System.out.println(titanic.Cinema + " 가격 : " + titanic.price + " 예약번호 : " + titanic.reserNum + " 좌석 : " + titanic.SeatNum);
        titanic.Start();
        titanic.whatch();
        titanic.End();
    }
}
class movie{
    String Cinema; //영화에 대한 속성 : 멤버 선언
    String SeatNum;
    String reserNum;
    int price;

    public movie(String cinema, int price,String reserNum,String SeatNum) //인스턴스 초기화를 위한 생성자 함수
    {
        this.Cinema = cinema;
        this.price = price;
        this.reserNum = reserNum;
        this.SeatNum = SeatNum;
    }

    void Start(){ //메서드 선언
        System.out.println("영화가 시작됩니다.");
    }
    void whatch(){
        System.out.println("영화를 봅니다.");
    }
    void End(){
        System.out.println("영화가 끝났습니다.");
    }

}
