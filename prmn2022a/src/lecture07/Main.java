package lecture07;

import lecture07.battle.BattleMonster;
import lecture07.battle.PlayerMonster;
import lecture07.monster.Monster;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {
        MonsterCreator.viewMonsterList();
        System.out.println(randomMonsterId());
       // System.out.println(stdinMonsterId());
        PlayerMonster a=new PlayerMonster(MonsterCreator.Monkey.supplier.get());
        a.attack(5,MonsterCreator.Turtle.supplier.get());

    }
    private static int stdinMonsterId(){
        int id=scanner.nextInt();
        if (id<1||id>3) id=stdinMonsterId();
        return id;
    }
    private static int randomMonsterId(){
        Random rand=new Random();
        return rand.nextInt(1,4);
    }
}
