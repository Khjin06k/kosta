package a_java.day11.starCraftProj.global;

// 기계
public class Tank extends GroundUnit implements Repairable{
    public Tank(){
        super(150);
    }

    @Override
    public void fix(){
        healthPoint = (int)Math.round(MAX_HP*0.9);
    }
}
