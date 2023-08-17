package day5.chap5_array;

public class ArrayTest6 {
    public static void main(String[] args) {
       String hex = "13A0C";
        String[] binary = {
                "0000", "0001", "0010", "0011",
                "0100", "0101", "0110", "0111",
                "1000", "1001", "1010", "1011",
                "1100", "1101", "1110", "1111"};

        String answer = "";

        for(int i = 0; i<hex.length(); i++){
            // hex값이 숫자일 경우 숫자 그대로의 인덱스에 해당하는 bonary 값을 입력
            if('0' <= hex.charAt(i) && hex.charAt(i) <= '9'){
                answer += binary[(hex.charAt(i) - '0')];
            }else{
                // hex값이 숫자가 아닌 A~F값인 경우 A가 10이기 때문에 일의 자리 숫자를 구한 후 10을 더해 해당 인덱스에 해당하는 bonary값을 입력
                answer += binary[(hex.charAt(i) - 'A')+10];
            }
        }
        System.out.println("hex : " + hex);
        System.out.println("answer : " + answer);
    }
}
