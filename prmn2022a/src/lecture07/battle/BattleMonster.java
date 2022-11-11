package lecture07.battle;

import lecture07.monster.IMonster;
import lecture07.monster.Monster;

public abstract class BattleMonster extends Monster implements IBattleMonster, IMonster {
    protected BattleMonster(IMonster monster) {
        super(monster);
    }
    public void attack(){
    }
    public void attack(int skillindex,IMonster oppenent){
        int damage = (this.getPower()+skillindex-oppenent.getDefense())<0?0:this.getPower()+skillindex-oppenent.getDefense();
        System.out.println(oppenent.getName()+"に"+damage+"のダメージ");
        oppenent.setHP(oppenent.getHP()-damage);
    }
    protected void receiveDamage(int damage,IMonster oppenent){
        this.setHP(this.getHp()-damage);
        System.out.println(oppenent.getName());

    }
}
