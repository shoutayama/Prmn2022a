package lecture07.monster;

import lecture07.skill.Skill;

import java.util.List;

public class Monster extends HP implements IMonster {
    private String name;
    private int hp;
    private int power;
    private int defense;
    private int speed;
    private List<Skill> skills;

    protected Monster(String name,int hp,int power,int defense,int speed,List<Skill> skills){
        this.name=name;
        this.hp=hp;
        this.power=power;
        this.defense=defense;
        this.speed=speed;
        this.skills=skills;
    }

    protected Monster(IMonster monster){
        this.name = monster.getName();
        this.hp=monster.getHP();
        this.power= monster.getPower();
        this.defense= monster.getDefense();
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
