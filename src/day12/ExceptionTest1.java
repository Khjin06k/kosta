package day12;

public class ExceptionTest1 {
    public static void main(String[] args) {
        String str1 = null;
        String str2 = "hong";
        //System.out.println(str1.toString()); // NullPointerException 발생 >> null은 toString 즉, 문자열로 바꿀 문자 자체가 없음 (주소값을 가지고 있지 않음(
        System.out.println(str2.toString());
        int[] arr = new int[5];

        try{
            System.out.println(str1.toString()); // 에러 발생 >> catch문으로 이동 >> NullPoint 에러이므로 맞는 catch문으로 이동
            for(int i = 0; i<=arr.length; i++){ // 에러 발생 >> ArrayIndexOutOfBoundsException catch문으로 이동해야 함
                arr[i] = i*10;
            }
        }catch (NullPointerException e1){
            System.out.println(e1.getMessage()); // 어떤 에러인지 에러 메시지 출력
            //e.printStackTrace(); // 어디서 에러가 발새했는지 출력
        }catch(ArrayIndexOutOfBoundsException e2){
            System.out.println(e2.getMessage());
            //e.printStackTrace();
        }
        System.out.println("종료");

    }
}
