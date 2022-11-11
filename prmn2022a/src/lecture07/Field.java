package lecture07;

import lecture07.battle.EnemyMonster;
import lecture07.battle.IBattleMonster;
import lecture07.battle.PlayerMonster;

public class Field implements IBattleMonster {
    private IBattleMonster playerMonster;
    private IBattleMonster enemyMonster;

    @Override
    public void attack() {

    }

    @Override
    public void attackOutput() {

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

    @Override
    public int skillSelect() {
        return 0;
    }

    public Field(PlayerMonster playerMonster, EnemyMonster enemyMonster){
        this.playerMonster=playerMonster;
        this.enemyMonster=enemyMonster;
    }
    private void battle(){

    }
    private boolean Turn(IBattleMonster first,IBattleMonster second){
        return true;
    }

    private int commandSelectPhase(IBattleMonster command){
        return 1;
    }
}
