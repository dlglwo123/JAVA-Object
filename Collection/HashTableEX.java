package Section1.Object.Collection;

import java.util.Hashtable;
import java.util.Scanner;

public class HashTableEX {
    public static void main(String[] args) {

        Hashtable<String,String> hashTable = new Hashtable<>();

        hashTable.put("String","345");
        hashTable.put("Summer", "678");
        hashTable.put("Fall", "91011");
        hashTable.put("Winter", "1212");

        System.out.println(hashTable);

        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("아이디와 비밀번호를 입력하세요.");
            System.out.println("[아이디]");
            String id = sc.nextLine();

            System.out.println("[비밀번호]");
            String passWard = sc.nextLine();

            if(hashTable.containsKey(id)) // containsKey() : 주어진 키가 있으면 true 없으면 false 를 반환
            {
                if(hashTable.containsKey(passWard)){
                    System.out.println("로그인 되었습니다.");
                    break;
                }
                else System.out.println("비밀번호가 일치하지 않습니다.");
            }
            else System.out.println("입력하신 아이디가 존재하지 않습니다.");
        }
    }
}
