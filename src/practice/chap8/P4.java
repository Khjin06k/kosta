package practice.chap8;

public class P4 {
    // [8-4] 다음과 같은 메서드가 있을 때, 예외를 잘못 처리한 것은? (모두 고르시오) c
    //void method() throws InvalidNumberException, NotANumberException {}

    //class NumberException extends RuntimeException {}
    //class InvalidNumberException extends NumberException {}
    //class NotANumberException extends NumberException {}

    //a. try {method( );} catch(Exception e) { }
    //b. try {method( );} catch(NumberException e) { } catch(Exception e) { }
    //c. try {method( );} catch(Exception e) { } catch(NumberException e) { } >> Exception은 최상위 부모이기 때문에 catch문이 마지막에 와야함
    //d. try {method( );} catch(InvalidNumberException e){} catch(NotANumberException e) { }
    //e. try {method( );} catch(NumberException e) { }
    //f. try {method( );} catch(RuntimeException e) { }
}
