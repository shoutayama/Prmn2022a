package lecture07;

public abstract class BattleMonster implements IBattleMonster {
    protected BattleMonster(Monster monster){

    }
    public void attack(int skillindex,IMonster oppenent){
        System.out.println("アタック");
    }
    protected void receiveDamage(int damage,IMonster oppenent){

    }
}
