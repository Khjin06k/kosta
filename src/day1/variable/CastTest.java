package day1.variable;

public class CastTest {
    public static void main(String[] args) {
        byte bt = 10;
        int i = bt; // 자동 형변환 (작은것을 큰 것에 넣어줄 때에는 데이터 손실이 일어나지 않아 자동으로 형변환 진행)

        // byte bt2 = i; 에러 발생 >> 자동 형변환이 되지 않음 (데이터 타입만 보고 판단하기 때문에 데이터 손실이 일어날 수 있기 때문)
        byte bt2 = (byte) i; // 강제 형변환 진행

        float f = i; // float과 int는 동일한 바이트이지만 float은 이진수로 변경하는 방식이 다르기 때문에 int보다 더 큰 값이 들어갈 수 있으므로 자동 형변환이 가능함
        //int i2 = f; // 소수점을 자르는 것은 자동형변환이 불가능하기 때문에 강제 형변환 진행을 해야 함
        int i2 = (int)f; // 소수점이 잘려서 나옴

        double d = f;
        float f2 = (float)d;

        // (주의) long과 float : 크기는 long이 더 크지만 자동 형변환은 float이 가능함.
        long l = (long)f;
        float  f3 = l;
    }
}
