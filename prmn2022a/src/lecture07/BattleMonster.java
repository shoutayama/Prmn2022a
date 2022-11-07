package lecture07;

public abstract class BattleMonster extends Monster implements IBattleMonster,IMonster {
    protected BattleMonster(IMonster monster) {
        super(monster);
    }

    public void attack(int skillindex,IMonster oppenent){
        System.out.println("アタック");
    }
    protected void receiveDamage(int damage,IMonster oppenent){

    }
}
