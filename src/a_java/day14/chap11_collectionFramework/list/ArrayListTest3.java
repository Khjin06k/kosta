package a_java.day14.chap11_collectionFramework.list;

import java.util.*;

class Account{
    String id;
    int balance;
    Account(){}
    Account(String id, int balance){
        this.id = id;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "계좌번호 : " + id + ", " +
                "잔액 : " + balance;
    }
}
class IdCompare implements Comparator<Account>{
    @Override
    public int compare(Account o1, Account o2) {
        return o1.id.compareTo(o2.id); // 오름차순
        // return o2.id.compareTo(o1.id); // 내림차순
        // return o1.balance-o2.balance; // int 형태는 빼기로 0, 양수, 음수를 나타내주면 됨
    }
}
public class ArrayListTest3 {
    public static void main(String[] args) {
        // List<Account> accs = new List<>(); // new List로 리스트 생성이 불가
        List<Account> accs = new ArrayList<>();
        accs.add(new Account("10004", 100));
        accs.add(new Account("10002", 300));
        accs.add(new Account("10003", 200));

        // Collections.sort(accs); // 에러 발생 >> ArrayListTest2에서와 동일한 에러
        Collections.sort(accs, new IdCompare()); // Comparator를 이용

        for (Account acc : accs) {
            System.out.println(acc);
        }
        for (int i = 0; i < accs.size(); i++) { // 크기는 length가 아닌 size
            System.out.println(accs.get(i)); // 인덱스가 아닌 get()을 사용
        }

        Iterator<Account> it = accs.iterator(); // 데이터를 하나씩 가져다 사용할 때 사용, Vector는 Enumeration을 사용
        while (it.hasNext()) { // 다음 데이터가 존재하는지 확인 (있으면 true, 없으면 false) >> 중간에 데이터를 추가/삭제하여 데이터의 크기가 바뀔 경우 사용을 권장
            Account acc = it.next(); // 다음 요소를 가져옴
            System.out.println(acc);
            // System.out.println(it.next()); // 한 번에 작성 가능
        }
    }
}
