package Section1.Object.polymorphism;

public class polymorphism {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.buyCoffee(new Americano());
        customer.buyCoffee(new Caffelatte());

        System.out.println("현재 잔액 : " + customer.money);
    }
}

class Coffee{
    int price;
    public Coffee(int price) // Coffee 생성자
    {
        this.price = price;
    }
}

class Americano extends Coffee{
    public Americano() {
        super(4000);
    }
    public String toString() {return "아메리카노";};
}
class Caffelatte extends Coffee {
    public Caffelatte() {
        super(5000);
    }
    public String toString() {return "카페라떼";}; // Object 클래스 toString 메서드 오버라이딩
}

class Customer {
    int money = 50000;

    void buyCoffee(Coffee coffee) // Coffee형은 Americano와 Caffeteria를 상속하고 있다.
            // ==> 그래서 Coffee클래스를 상속 받기만 한다면 buyCoffee(Coffee coffee) 메서드의 매게변수로 전달할 수 있다.
    {

        if(money < coffee.price){
            System.out.println("잔액이 부족합니다.");
            return;
        }
        money = money - coffee.price;
        System.out.println(coffee + "구매 완료");
    }

   /* void buyCoffee(Americano americano)
    {
        money = money - americano.price;
    }
    void buyCoffee(Caffelatte caffelatte)
    {
        money = money - caffelatte.price;
    }
     ==> 만일 커피의 종류가 한 두개가 아닌 수백가지가 된다고 하면 매번 추가해야하는 번거로움과 유지 보수가 어렵다.
     그래서 위와 같이 해결한다.
    */
}