package a_java.day15.chap12_inputOutput;

import java.io.*;

public class FileStreamTest1 {
    public static void main(String[] args) {
        // 파일의 복사
        FileInputStream fis = null;
        FileOutputStream fos = null;
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        try{
            fis = new FileInputStream("cat.jpeg"); // 읽어올 데이터 (파일의 형식은 txt도 이미지도 다 가능)
            fos = new FileOutputStream("cat2.jpeg"); // 출력할 데이터 (파일을 새로 생성하여 동일한 내용의 파일을 출력)

           /* int data;
            while((data = fis.read()) != -1){ // 파일의 마지막은 -1 (읽어올 것이 없음을 의미)
                fos.write(data); // 읽어올 것이 있다면 fos의 data를 작성하여라
            } //아래와 같이 배열을 이용해서 더 많이 씀*/

            bis = new BufferedInputStream(fis); // 보조 스트림을 생성
            bos = new BufferedOutputStream(fos); // 아래서 기본 스트림이 아닌 보조 스트림을 사용하면 됨

            byte[] buff = new byte[1024];
            int len;
            // read()는 buff를 꽉 채워서 가져오라는 것인데, 950 크기의 파일을 100 바이트씩 가져온다면 마지막은 50만 남음.
            // 따라서, 꽉 채워서 가져 오더라도 len에 실제 해당되는 buff의 크기(마지막에는 100이 아닌 50)를 가져오라는 것
            while((len=bis.read(buff)) > 0){
                //fos.write(buff, 0, len); // 0부터 읽어온 크기만큼만 write 진행
                bos.write(buff, 0, len);
            }

        }catch(IOException e){
            e.printStackTrace();
        }finally {
            try{
                if(bis!=null) fis.close(); // 보조 스트림을 닫으면 기본 스트림도 알아서 닫힘
                if(bos!=null) fis.close(); // 입출력이 진행되었다면 닫아라
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
