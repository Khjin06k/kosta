package java.day12.chap8_Exception;

public class ExceptionTest3 {
    public static void main(String[] args) throws Exception {
        //try{
            throw new Exception("예외 발생"); // 예외 생성 (생성 시 msg 작성 가능)
        // Exception 클래스를 상속받아 그냥 예외를 던저줄 수 있음 >> 이는 이를 호출하는 곳으로 던저줌
        //}catch (Exception e){
        //    System.out.println(e.getMessage());
        //}
    }
}
