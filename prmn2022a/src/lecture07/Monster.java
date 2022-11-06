package lecture07;

import java.util.List;

public class Monster extends HP implements IMonster {
    private String name;
    private int hp;
    private int power;
    private int defense;
    private int speed;
    private List<Skill> skills;

    protected Monster(String name,int hp,int power,int defense,int speed,List<Skill> skills){

    }

    protected Monster(IMonster monster){

    }

    @Override
    public String getName() {
        return name;
    }
    @Override
    public int getHP() {
        return hp;
    }
    @Override
    public void setHP(int hp) {
        this.hp=hp;
    }
    @Override
    public int getPower() {
        return power;
    }
    @Override
    public int getDefense() {
        return defense;
    }
    @Override
    public boolean isAlive() {
        return super.isAlive();
    }
}
