package a_java.day11.starCraftProj.global;

// 기계를 고쳐주는 아이
public class SCV extends GroundUnit implements Repairable{
    public SCV(){
        super(60);
    }

    public void repair(Repairable r){
        r.fix();
    }

    @Override
    public void fix(){
        healthPoint = (int)Math.round(MAX_HP*0.8);
    }
}
