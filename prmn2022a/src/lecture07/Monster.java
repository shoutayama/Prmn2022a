package lecture07;

import java.util.List;

public class Monster extends HP implements IMonster {
    protected String name;
    protected int hp;
    protected int power;
    protected int defense;
    protected int speed;
    List<Skill> skills;

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

    Monster(){

    }
}
