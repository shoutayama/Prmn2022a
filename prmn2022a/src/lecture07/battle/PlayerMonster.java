package lecture07.battle;
import java.util.Scanner;
import lecture07.monster.IMonster;

public class PlayerMonster extends BattleMonster {
    public PlayerMonster(IMonster monster){
        super(monster);
    }
    @Override
    public int skillSelect(){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
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
