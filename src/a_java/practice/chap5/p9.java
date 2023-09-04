package a_java.practice.chap5;

public class p9 {
    public static void main(String[] args) {
        // 주어진 배열을 시계방향으로 90도 회전시켜서 출력하는 프로그램을 완성하시오.
        char[][] star = {
                {'*', '*', ' ', ' ', ' '}, {'*', '*', ' ', ' ', ' '}, {'*', '*', '*', '*', '*'}, {'*', '*', '*', '*', '*'}
        };

        char[][] result = new char[star[0].length][star.length];

        // 기존 배열 출력
        for (int i = 0; i < star.length; i++) {
            for (int j = 0; j < star[i].length; j++) {
                System.out.print(star[i][j]);
            }
            System.out.println();
        }

        System.out.println();

        // 배열 돌리기
        /* 공통점
        * >> j에 해당하는 인덱스가 모두 i로 이동
        * >> j는 인덱스 마지막에서 자신의 i의 인덱스 크기만큼 뺀 것의 크기
        (0,0) >> (0,3)
        (0,1) >> (1,3)
        (0,2) >> (2,3)
        (0,3) >> (3,3)
        (0,4) >> (4,3)
        *
        (1,0) >> (0,2)
        (1,1) >> (1,2)
        (1,2) >> (2,2)
        (1,3) >> (3,2)
        *
        (2,0) >> (0,1)
        (2,1) >> (1,1)
        (2,2) >> (2,1)
        (2,3) >> (3,1)
        *
        (3,0) >> (0,0)
        (3,1) >> (1,0)
        (3,2) >> (2,0)
        (3,3) >> (3,0)
        */
        for (int i = 0; i < star.length; i++) {
            for (int j = 0; j < star[i].length; j++) {
                result[j][star.length-i-1] = star[i][j];
            }
        }

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
    }
}
