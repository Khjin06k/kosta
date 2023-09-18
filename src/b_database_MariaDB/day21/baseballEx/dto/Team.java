package b_database_MariaDB.day21.baseballEx;

public class Team {
    private int num;
    private String name;
    private String local;

    Team(){}

    public Team(int num, String name, String local) {
        this.num = num;
        this.name = name;
        this.local = local;
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

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    @Override
    public String toString() {
        return "Team{" +
                "num=" + num +
                ", name='" + name + '\'' +
                ", local='" + local + '\'' +
                '}';
    }
}
