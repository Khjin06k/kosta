package practice.chap4;

public class p12 {
    public static void main(String[] args) {
        System.out.println(sol(2, 4));
        System.out.println(sol(5, 7));
        System.out.println(sol(8, 9));
    }

    public static String sol(int a, int b){
        String str = "";
        for(int i = 1; i<=3; i++){
            for(int j = a; j<=b; j++){
                str += String.format("%d*%d=%d\t",j, i, i*j);
            }
            str += "\n";
        }

        return str;
    }
}
