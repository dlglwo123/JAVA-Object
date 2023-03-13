package Section1.Object.Collection;


enum Level{
    LOW,MEDIUM,HIGH;
}
public class EnumEX1 {
    public static void main(String[] args) {
        Level[] arrayLevel = Level.values(); // level의 값들을 참조변수 arratLevel에 담는다.
        for(Level arr : arrayLevel){
            System.out.printf("%s = %d\n",arr.name(),arr.ordinal()); // name() 상수이름 original() 각 상수에 부여된 번호
        }
    }
}
