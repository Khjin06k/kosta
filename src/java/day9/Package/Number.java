package java.day9.Package;

public class Number{
    private int pnum;
    private void pmethod(){
        pnum = 10; //private 변수는 동일한 클래스 내 메서드에서만 사용 가능
    }
    int dnum; // 다른 패키지에서 사용하고 있기 때문에 에러가 발생 >> 게터나 세터 사용 필요
    public int getDnum(){
        return dnum;
    }
    public void setDnum(int data){
        dnum = data;
    }
    public void dmethod(){
        pnum = 20;
    }
    public int punum;
    public void pumethod(){
        pnum = 30;
    }

    protected int prnum;
    public void prmethod(){}
}

