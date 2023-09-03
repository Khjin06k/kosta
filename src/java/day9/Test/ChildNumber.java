package java.day9.Test;

import java.day9.Package.Number;

public class ChildNumber extends Number {
    Number n1 = new Number();
    void cmethod(){
        // private는 자식도 접근할 수 없음
        // System.out.println(pnum);

        // 자식이라 하더라도 부모와 같은 패키지가 나아니라면 default는 접근 불가능
        //System.out.println(dnum);

        // public
        // public은 어디서나 접근 가능
        System.out.println(punum);

        // protect
        // 패키지가 다르더라도 부모의 protected wjqrms rksmd
        System.out.println(prnum);
    }
}
