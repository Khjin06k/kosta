package java.day12.chap8_Exception;

public class ExceptionTest4 {
    public static void method() throws Exception{ // 메서드에서 Exception을 던저줄 수 있음
        String str = null;
        try{
            System.out.println(str.toString());

        }catch (NullPointerException e){
            System.out.println("method에서 처리");
            throw new Exception("예외 다시 생성"); // 예외를 생성해서 던저줌 >> 메서드에서 throws Exception 처리를 해줘야 함
        }
    }
    public static void main(String[] args) {
        try{
            method();
        }catch (NullPointerException e){
            System.out.println("main에서 처리");
        } catch (Exception e) {
            System.out.println("main에서 처리");
        }
        System.out.println("main 나머지 처리");
    }
}
