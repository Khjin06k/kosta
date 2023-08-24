package practice.chap7.p17;

class Unit{
    int x,y; //현재 위치

    void move(int x, int y){
        /* 지정된 위치로 이동 */
    }
    // abstract void move(int x, int y); 로 한 뒤 나머지 클래스에 void move(int x, int y)를 해 놓은 후 정의해서 사용하도록 할 수도 있음 (움직이는 것이 다르다면)
    void stop(){
        /* 현재 위치에 정지 */
    }
}
class Marine extends Unit{ // 보병
    void stimPack(){
        /* 스팀팩을 사용한다.*/
    }
}
class Tank extends Unit{ // 탱크
    void changeMode(){
        /* 공격모드를 변환한다. */
    }
}
class Dropship extends Unit{ // 수송선
    void load(){
        /* 선택된 대상을 태운다.*/
    }
    void unload(){
        /* 선택된 대상을 내린다.*/
    }

}
public class P17 {
}
