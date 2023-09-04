package a_java.practice.chap6;
// 다음 코드의 실행 결과를 예측하여 적으시오.

// 실행 결과 예측 : ABC123 \n After change : ABC123
public class P19 {
    public static void change(String str) {
        str += "456";
    }

    public static void main(String[] args) {
        /*int n = 10;
        String str = "ABC123"; // new를 사용하지 않으면 상수 영역에 저장하고 그 주소를 str에 적음
        String str1 = "ABC123"; // 바로 밑에 쓰면 상수 영역에 "ABC123"이 있는지 확인하고 있으면 주소를 저장, 없으면 새로 생성해서 그 주소를 저장
        System.out.println(str == str1); // true (연달아써서 상수 영역에 "ABC123"이 있는 것을 확인해 동일한 주소를 가짐)
        String str2 = new String("ABC123"); // new를 사용
        String str3 = new String ("ABC123");
        System.out.println(str2 == str3); // false*/
        String str = "ABC123";
        System.out.println(str);
        change(str); // str에 "456"을 더해 새로운 영역에 저장하지만 str은 "456"이 더해진 영역의 주소값을 받도록 되어있지 않기 때문에 "ABC123"의 주소를 str는 그대로 가지고 있음
        System.out.println("After change:"+str);

        // str의 변수와 change가 참조하는 str은 이름은 동일하지만 다른 영역에 존재하는 다른 변수
        // change 메서드를 종료하면 지역변수인 str은 메모리에서 제거되고 다시 main으로 돌아와 str 문자열을 보면 처음과 동일함
    }
}
