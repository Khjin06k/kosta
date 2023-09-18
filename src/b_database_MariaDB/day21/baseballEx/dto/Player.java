package b_database_MariaDB.day21.baseballEx;

public class Player {
    private int num;
    private String name;
    private int backnum;
    private int team_num;

    Player(){}

    public Player(int num, String name, int backnum, int team_num) {
        this.num = num;
        this.name = name;
        this.backnum = backnum;
        this.team_num = team_num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBacknum() {
        return backnum;
    }

    public void setBacknum(int backnum) {
        this.backnum = backnum;
    }

    public int getTeam_num() {
        return team_num;
    }

    public void setTeam_num(int team_num) {
        this.team_num = team_num;
    }

    @Override
    public String toString() {
        return "Player{" +
                "num=" + num +
                ", name='" + name + '\'' +
                ", backnum=" + backnum +
                ", team_num=" + team_num +
                '}';
    }
}
