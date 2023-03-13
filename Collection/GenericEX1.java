package Section1.Object.Collection;

class Vehicle{
    void ride(){
        System.out.println("자동차가 달립니다");
    }
};
class Car extends Vehicle{
    void car(){
        System.out.println("자동차입니다.");
    }
}
class Truck{
    void truck(){
        System.out.println("트럭입니다.");
    }
}

class Driver<T>{

    private T drivername;

    void driver(){
        System.out.println("저는 운전자 : " + drivername);
    }
    public T getDrivername() {
        return drivername;
    }
    public void setDrivername(T drivername) {
        this.drivername = drivername;
    }
}

public class GenericEX1 {
    public static void main(String[] args) {
        Driver<Vehicle> driver1 = new Driver<>();

        driver1.setDrivername(new Car());
        driver1.setDrivername(new Vehicle());
        //driver1.setDrivername(new Truck()); 오류
    }
}
