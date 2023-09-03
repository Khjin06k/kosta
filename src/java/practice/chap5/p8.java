package java.practice.chap5;

public class p8 {
    public static void main(String[] args) {
        // 다음은 배열 answer에 담긴 데이터를 읽고 각 숫자의 개수를 세어서 개수만큼 ‘*’ 을 찍어서 그래프를 그리는 프로그램이다.

        int[] answer = { 1,4,4,3,1,4,4,2,1,3,2 };
        int[] counter = new int[4];
        for(int i=0; i < answer.length;i++) {
            // 인덱스는 0부터 시작하기 때문에 1을 뺀 자리에 할당 필요
            int idx = answer[i]-1;
            counter[idx] = counter[idx]+1;
        }

        for(int i=0; i < counter.length;i++) {
            // counter 배열에 저장된 숫자만큼 *을 찍으면 됨
            System.out.print(counter[i]);
            for(int j = 0; j<counter[i]; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
