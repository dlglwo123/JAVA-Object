package Section1.Object.Effective.Lambda;

import java.util.function.BiFunction;
import java.util.function.Function;

class Memeber{
    private String name;
    private String Id;

    public Memeber(){
        System.out.println("Member() 실행");
    }
    public Memeber(String name) {
        System.out.printf("Member(%s) 실행 ",name);
        this.name = name;
    }
    public Memeber(String name, String id) {
        System.out.printf("Member(%s,%s) 실행 ",name,id);
        this.name = name;
        Id = id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return Id;
    }
}

public class Method_Reference1 {
    public static void main(String[] args) throws Exception{
        Function<String,Memeber> function = Memeber::new;
        Memeber memeber1 = function.apply("홍길동");

        System.out.println("");

        BiFunction<String,String,Memeber> function1 = Memeber::new;
        Memeber memeber2 = function1.apply("이름출력","아이디 출력");

    }
}
