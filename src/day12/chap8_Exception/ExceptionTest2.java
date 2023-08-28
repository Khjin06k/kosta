package day12.chap8_Exception;

public class ExceptionTest2 {
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30, 40, 50};
        int[] arr2 = {2, 4, 6, 0, 10};
        int total = 0;
        double avg = 0;
        int count = arr1.length;
        /*for(int i = 0; i<arr1.length; i++){
            System.out.println(arr1[i]/arr2[i]); // ArithmeticException 발생
        }*/
        for(int i = 0; i<arr1.length; i++){

            try{
                //System.out.print(arr1[i]/arr2[i] + "  "); // 계속 이어서 출력하고 싶은 경우 try를 반복문 안에 넣어주면 됨
                total += arr1[i]/arr2[i];
            }catch (ArithmeticException e){
                //e.getMessage();
                //e.printStackTrace();
                // 아무 처리를 하고 싶지 않다면 비어둔 채로 두거나 total에 0을 더하는 연산을 해주면 됨
                count--;
            }catch (ArrayIndexOutOfBoundsException e){
                //e.getMessage();
                //e.printStackTrace();
                count--;
            }catch (Exception e){} // 최상위 예외 클래스 Exception은 맨 마지막에 와야 함
        }
        avg = total/count;
        System.out.println(total);
        System.out.println(avg);
        System.out.println("종료");
    }
}
