package a_java.day15.chap12_inputOutput;

import java.io.*;
import java.util.Vector;

public class SequenceStreamTest1 {
    public static void main(String[] args) {
        FileInputStream fis1 = null;
        FileInputStream fis2 = null;
        FileOutputStream fos = null;

        SequenceInputStream sis = null;

        Vector<InputStream> v = new Vector<>();

        try{

            /*fis1 = new FileInputStream("news.txt");
            fis2 = new FileInputStream("news2.txt");
            sis = new SequenceInputStream(fis1, fis2); // 여러개의 파일은 Vector에 넣어서 Enumeration을 이용해 넣어주면 됨*/

            // vector 이용 >> 2개 이상의 여러개의 파일을 합칠 수 있음
            v.add(new FileInputStream("news.txt"));
            v.add(new FileInputStream("news2.txt"));
            sis = new SequenceInputStream(v.elements());

            fos = new FileOutputStream("total.txt");

            byte[] buff = new byte[1024];
            int len;
            while((len = sis.read(buff))>0){
                fos.write(buff, 0, len);
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try{
                if(sis != null) sis.close(); // 보조스트림을 닫으면 기본 스트림도 닫
                if(fos != null) fos.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
