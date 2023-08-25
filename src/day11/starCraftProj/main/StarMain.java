package day11.starCraftProj.main;

import day11.starCraftProj.global.Marine;
import day11.starCraftProj.global.SCV;
import day11.starCraftProj.global.Tank;
import day11.starCraftProj.global.Zerg;

public class StarMain {
    public static void main(String[] args) {
        Tank tank = new Tank();
        SCV scv = new SCV();
        Zerg zerg = new Zerg();
        Marine marine = new Marine();

        // repair를 하기 위해 tank, scv, serg의 공통을 만들기 위해 Repairable 인터페이스를 만들어 추상 메서드를 생성
        scv.repair(tank); // 90% 회복
        scv.repair(scv); // 80% 회복
        scv.repair(zerg); // 100% 회복
        //scv.repair(marine); // error
    }
}
