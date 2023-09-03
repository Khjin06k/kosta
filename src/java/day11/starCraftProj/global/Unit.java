package java.day11.starCraftProj.global;

public class Unit {
    int healthPoint;
    final int MAX_HP; // 종족당 MAX_HP가 다르기 때문에 초기화 하는 것이 아니라 생성과 함께 초기화 진행
    //Unit(){} MAX_HP를 반드시 가져와야 하기 때문에 기본 생성자를 만들지 않음
    Unit(int hp){ // 자식에게서 hp를 받아서 해당 값으로 초기화 진면
        MAX_HP = hp;
        healthPoint = MAX_HP;
    }
}
