package day2.forWhile;

public class WhileTest2 {
    public static void main(String[] args) {
        // sum이 100보다 크거나 같아지는 값과 그 때의 i값
        int sum = 0, i=1;
        while(sum<100){
            sum += i;
            i++;
        }
        System.out.println(sum);
        System.out.println(i-1);
    }
}
