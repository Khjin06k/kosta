package java.practice.chap4;

public class p12 {
    // 삼중 for문 만들기
    public static void main(String[] args) {
        for(int i = 1, dan = 2; i < 3; i++, dan +=3){
            for(int j = 1; j<= 3; j++){
                for(int k = dan; k<= ((dan+2<10)?dan+2:9); k++){
                    System.out.print(String.format("%d*%d=%2d\t", k, j, k*j));
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    // 내가 푼 풀이
//    public static void main(String[] args) {
//        System.out.println(sol(2, 4));
//        System.out.println(sol(5, 7));
//        System.out.println(sol(8, 9));
//    }
//
//    public static String sol(int a, int b){
//        String str = "";
//        for(int i = 1; i<=3; i++){
//            for(int j = a; j<=b; j++){
//                str += String.format("%d*%d=%d\t",j, i, i*j);
//            }
//            str += "\n";
//        }
//
//        return str;
//    }
}
