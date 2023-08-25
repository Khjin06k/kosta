package day11.starCraftProj.global;

// 기계
public class Zerg extends AirUnit implements Repairable{
    public Zerg(){
        super(200);
    }

    @Override
    public  void fix(){
        healthPoint = MAX_HP;
    }
}
