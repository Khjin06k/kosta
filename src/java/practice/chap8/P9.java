package java.practice.chap8;
// [8-9] 다음과 같은 조건의 예외클래스를 작성하고 테스트하시오.
//([참고] 생성자는 실행결과를 보고 알맞게 작성해야한다.)
/*
* 클래스명 : UnsupportedFuctionException
* 조상클래스명  : RuntimeException
* 멤버변수  :
이름    : ERR_CODE
저장값 : 에러코드
타입    : int
기본값 : 100
제어자 : final private
* 메서드          :
1. 메서드명 : getErrorCode
   기능 : 에러코드(ERR_CODE)를 반환한다.
   반환타입 : int
   매개변수 : 없음
   제어자 : public
2. 메서드명 : getMessage
   기능  : 메세지의 내용을 반환한다. (Exception클래스의 getMessage( )를 오버라이딩)
   반환타입 : String
   매개변수 : 없음
   제어자    : public
 */
class UnsupportedFuctionException extends RuntimeException{
    private final int ERROR_CODE;

    UnsupportedFuctionException(String msg){
        super(msg);
        ERROR_CODE = 100; // 기본값이 100이기 때문에 기본 생성 시 100으로 설정하기 위함. final이므로 위의 변수에서 100으로 초기화 할 수 없음
    }
    UnsupportedFuctionException(String msg, int code){
        super(msg);
        ERROR_CODE = code;
    }
    public int getErrorCode(){
        return ERROR_CODE;
    }

    @Override
    public String getMessage(){
        return "["+getErrorCode()+"]" + super.getMessage();
    }

}
public class P9 {

    public static void main(String[] args) throws Exception {
        //try{
            throw new UnsupportedFuctionException("지원하지 않는 기능입니다.", 100);
        //}catch (UnsupportedFuctionException e){
        //   System.out.println(e.getMessage());
        //}
    }
}
