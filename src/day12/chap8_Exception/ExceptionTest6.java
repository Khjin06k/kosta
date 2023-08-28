package day12.chap8_Exception;

import java.io.IOException;

public class ExceptionTest6 {
    static void method() throws IOException, Exception{
        boolean flag = false;
        if(flag){
            throw new IOException("입출력 예외");
        }else{
            throw new Exception("모든 예외");
        }

    }
    public static void main(String[] args) {
        try{
            method();
        }catch (IOException e){
            System.out.println(e.getMessage());
            //e.printStackTrace();
            //e.getMessage();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            //e.getMessage();
            //e.printStackTrace();
        }
    }
}
