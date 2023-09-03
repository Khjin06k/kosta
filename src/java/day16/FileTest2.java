package java.day16;

import java.io.File;

public class FileTest2 {
    public static void main(String[] args) {
        File f = new File("/Users/gmlwls/Desktop/kosta");
        if(!f.exists() || !f.isDirectory()){
            return;
        }
        /*String[] files = f.list();
        for(String file : files){
            System.out.println(file);
        }*/

        File[] files1 = f.listFiles();
        int totLength = 0;
        for(File file : files1){
            totLength += file.length();
            // System.out.println(file.isDirectory()?"[" + file.getName()+"]":file.getName());
            if(file.isDirectory()){
                System.out.println("[" + file.getName()+"]");
            }else{
                System.out.println(file.getName());
            }
        }
        System.out.println(totLength);
    }
}
