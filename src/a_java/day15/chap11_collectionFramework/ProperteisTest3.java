package a_java.day15.chap11_collectionFramework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ProperteisTest3 {
    public static void main(String[] args) {
        Properties prop1 = new Properties();
        try{
            prop1.load(new FileInputStream("setting.txt"));
            System.out.println(prop1.getProperty("title"));
            System.out.println(prop1.getProperty("content"));
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
