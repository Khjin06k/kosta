package day12.chap9_java_lang;

// 복소수
class Complex{
    int real;
    int imaginary;
    public Complex(int real, int imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    @Override // 주소값이 아닌 안의 값(real, imaginary)를 비교하여 동일하다면 true, 다르다면 false를 반환하도록 오버라이딩을 진행
    public boolean equals(Object obj) {
        if(obj instanceof Complex == false) return false; // 일단 Complex가 될 수 없는 경우 false를 반환
        // 다운 캐스팅이 가능하다면 다운 캐스팅 진행
        Complex c = (Complex) obj;
        return real==c.real && imaginary==c.imaginary;
    }

    @Override
    public String toString() {
        return real + " + " + imaginary + 'i';
    }
}
public class EqualsTest2 {
    public static void main(String[] args) {
        Complex c1 = new Complex(3, 5);
        Complex c2 = new Complex(3, 5);
        Complex c3 = new Complex(5, 3);

        System.out.println(c1.equals(c2)); // true
        System.out.println(c1.equals(c3)); // false
        System.out.println(c1);
        System.out.println(c3);
    }
}
