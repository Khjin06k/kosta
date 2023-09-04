package a_java.day16;

import java.io.File;

public class FileTest1 {
    public static void main(String[] args) {
        File file = new File("파일 경로");
        System.out.println(file.getName()); // 파일 이름 출력
        System.out.println(file.getPath()); // 파일 이름과 경로 모두 출력
        System.out.println(file.getAbsolutePath()); // 파일 경로만 출력
        System.out.println(File.pathSeparator); // OS에서 사용하는 경로 구분자
        System.out.println(File.pathSeparatorChar);
        System.out.println(File.separator); // OS에서 사용하는 이름 구분자
        System.out.println(File.separatorChar);
    }
}
