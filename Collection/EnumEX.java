/*
    [Enum]
    1. 상수명 중복을 피하기위해서 -> 인터페이스로 상수명을 구분(일차적 해결)
    2. 인터페이스로 상수명을 구분하면 타입의 안전성에 문제가 발생한다. 다른 인터페이스에 상수명이 중복되지만 오류가 나지 않는다.
    3. 이차적 해결 : 새로운 객체를 만들어준다. but 스위치 문 사용 불가,문장의 길이가 길어짐
 */
package Section1.Object.Collection;
/* // 오류 발생 지점
class Seasons {
    public static final Seasons SPRING = new Seasons();
    public static final Seasons SUMMER = new Seasons();
    public static final Seasons FALL = new Seasons();
    public static final Seasons WINTER = new Seasons();
}
 */
// enum 열거형 이름 { 상수명 1, 상수명 2, 상수명 3,...}
enum Seasons{
    SPRING,SUMMER,FALL,WINTER;
    double PI = 3.14; //이렇게 열거 가능
}

public class EnumEX {
    public static void main(String[] args) {
        Seasons favoriteSeason = Seasons.SUMMER;
        Seasons seasons = Seasons.SPRING;
        switch (seasons){
            case SPRING:
                System.out.println("봄");
                break;
            case SUMMER :
                System.out.println("여름");
                break;
            case FALL:
                System.out.println("가을");
                break;
            case WINTER:
                System.out.println("겨울");
                break;
        }
        System.out.println(favoriteSeason); // SUMMER
    }
}
