package a_java.day1.variable;

public class VariableTest {
    public static void main(String[] args) {
        // 예시1 - 본인의 정보를 입력 및 출력
        // 이름을 저장할 변수를 선언하여 본인 이름 할당
        String name = "김희진";
        // 나이를 저장할 변수를 선언하여 본인 나이 할당
        int age = 24;
        // 키를 저장할 변수를 선언하여 본인키 소숫점까지 할당
        float length = 165.0f;
        // 남여를 구분할 수 있는 변수를 선언하여 본인 성별 할당 'F or M'
        char gender = 'F';

        // 선언한 변수 출력
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("키 : " + length);
        System.out.println("성별 : " + gender);

        // format을 이용해서 출력 가능
        System.out.println(String.format("이름 : %s%n나이 : %d%n키 : %f%n성별 : %c%n", name, age, length, gender));
    }
}
