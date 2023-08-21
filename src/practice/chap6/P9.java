package practice.chap6;
// 다음은 컴퓨터 게임의 병사(marine)를 클래스로 정의한 것이다.
// 이 클래스의 멤버 중에 static을 붙여야 하는 것은 어떤 것들이고 그 이유는 무엇인가?
//(단, 모든 병사의 공격력과 방어력은 같아야 한다.)

// 답 : 인스턴스 변수는 호출 시 생성되었다가 삭제되기 때문에 계속 새로 만들어지는데 공격력과 방어력은 계속 동일해야 한다.
// 모든 병사의 공격력과 방어력이 동일해야 하기 때문에 하나의 변수를 공유해야 한다.
// 따라서 공격력인 weapon과 방어력인 armor인 방어력에 static이 붙어야 한다.
public class P9 {
    int x=0, y=0; // Marine의 위치좌표(x,y)
    int hp=60; //현재 체력
    int weapon = 6; // 공격력
    int armor = 0; // 방어력
    void weaponUp() {
        weapon++;
    }
    void armorUp() {
        armor++;
    }
    void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
