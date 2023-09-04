package a_java.day15.chap12_inputOutput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest1 {
    public static void main(String[] args) {
        FileReader fis = null;
        BufferedReader br = null; // 문자기반 보조 스트림
        try{
            fis = new FileReader("news2.txt");
            br = new BufferedReader(fis);
            int data;
            while((data=br.read()) != -1){
                System.out.print((char)data); // 파일이 깨져서 나옴 >> 문자기반 스트림 이용해야 함 >> FileInputStream >> FileReader로 변경
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try{
                if(br != null){
                    br.close(); // 보조 스트림을 닫으면 본 스트림도 닫힘
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
