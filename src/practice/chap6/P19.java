package practice.chap6;
// 다음 코드의 실행 결과를 예측하여 적으시오.

// 실행 결과 예측 : ABC123 \n After change : ABC123
public class P19 {
    public static void change(String str) {
        str += "456";
    }

    public static void main(String[] args) {
        String str = "ABC123";
        System.out.println(str);
        change(str);
        System.out.println("After change:"+str);
    }
}
