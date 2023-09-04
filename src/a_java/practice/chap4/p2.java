package a_java.practice.chap4;

public class p2 {
    public static void main(String[] args) {
        // 부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하시오.
        int sum = 0;
        for(int i = 1; i<21; i++){
            if(i%2==0 || i%3==0) continue;
            else sum+=i;
        }
        System.out.println(sum);
    }
}
