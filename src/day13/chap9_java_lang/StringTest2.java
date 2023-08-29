package day13.chap9_java_lang;

public class StringTest2 {
    public static void main(String[] args) {
        String str = "Good Lock";
        int index = str.indexOf('L'); // L이 몇번째 인덱스에 위치하는지, 없으면 -1 출력
        System.out.println(index);
        int index2 = str.indexOf("Luck");
        System.out.println(index2); // 문자열이 모두 포함되면 해당 문자열이 존재하는 첫번째 위치가 출력

        String str2 = "apple place";
        int index3 = str2.indexOf('p'); // 앞에서부터 찾음
        int index4 = str2.lastIndexOf('p'); // 뒤에서부터 찾음
        System.out.println(index3);
        System.out.println(index4);

        String str3 = str2.replace('p', 't'); // p를 t로 변경
        System.out.println(str2);
        System.out.println(str3);

        String str4 = str2.replace("place", "banana"); // place를 banana로 변경
        System.out.println(str2);
        System.out.println(str4);

        String fruitStr = "apple, banana, pineapple, melon, strawberry";
        String[] fruitArr = fruitStr.split(", ");
        for(int i = 0; i<fruitArr.length; i++){
            System.out.println(fruitArr[i]);
        }
    }
}
