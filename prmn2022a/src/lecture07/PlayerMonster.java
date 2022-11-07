package lecture07;

public class PlayerMonster extends BattleMonster{
    public PlayerMonster(IMonster monster){
        super(monster);
    }

    @Override
    public void attack() {

    }

    @Override
    public int skillSelect(){
        return 0;
    }
    @Override
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
