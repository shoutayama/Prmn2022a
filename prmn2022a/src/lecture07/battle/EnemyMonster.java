package lecture07.battle;

import lecture07.monster.IMonster;

public class EnemyMonster extends BattleMonster {

    public EnemyMonster(IMonster monster){
        super(monster);
    }

    @Override
    public int skillSelect(){
        return 1;
    }
    public void attackOutput(){

    }

    @Override
    public void remainHpOutput() {

    }

    @Override
    public void skillListOutput() {

    }

    @Override
    public void winOutput() {

    }

    @Override
    public void loseOutput() {

    }
}
