package day5.chap5_array;

import java.util.Arrays;

public class ArrayTest10 {
    public static void main(String[] args) {
        // 배열의 복사
        int[] narr1 = {1,2,3,4};
        int[] narr2 = narr1; // narr2에 직접 narr1을 넣었을 때 narr2[0]을 아래처럼 바꾸면 narr1[0]도 동일한 값으로 변경하게 됨
        narr2[0] = 100;
        // 이는 값을 다 넣는다는 것이 아니라 narr1의 값이 아닌 주소를 복사한다고 생각하면 됨.
        // 즉 하나의 배열을 2개의 배열이 공유하고 있는 것이 되기 때문에 동일한 값으로 변경되는 것

        for(int i = 0; i<narr1.length; i++){
            if(i==narr1.length-1) System.out.print(narr1[i]);
            else System.out.print(narr1[i] + ", ");
        }
        System.out.println();
        for(int i = 0; i<narr2.length; i++){
            if(i==narr2.length-1) System.out.print(narr2[i]);
            else System.out.print(narr2[i] + ", ");
        }
        System.out.println();

        int[] narr3 = {1,2,3,4};
        int[] narr4 = Arrays.copyOf(narr3, narr3.length);
        narr4[0] = 100;

        for(int i = 0; i<narr3.length; i++){
            if(i==narr3.length-1) System.out.print(narr3[i]);
            else System.out.print(narr3[i] + ", ");
        }
        System.out.println();
        for(int i = 0; i<narr4.length; i++){
            if(i==narr4.length-1) System.out.print(narr4[i]);
            else System.out.print(narr4[i] + ", ");
        }


    }
}
