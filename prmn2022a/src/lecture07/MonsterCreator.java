package lecture07;

import lecture07.monster.Monkey;
import lecture07.monster.Monster;
import lecture07.monster.Penguin;
import lecture07.monster.Turtle;

import java.util.Map;
import java.util.function.Supplier;

public enum MonsterCreator {
    Monkey(1,new Monkey()),
    Penguin(2,new Penguin()),
    Turtle(3,new Turtle());

    private int id;
    public Supplier<Monster> supplier;
    private static Map<Integer,MonsterCreator> monsterCreatorMap;
    private MonsterCreator(int id,Monster monster){
        this.id=id;
        supplier=()->monster;
    }
    public static void viewMonsterList(){
        for (MonsterCreator mons:MonsterCreator.values()){
            System.out.println(mons+"->"+mons.supplier.get().getName());
        }
    };
    public static int monsterMinId(){
        return 0;
    };
    public static int monsterMaxId(){
        return 0;
    };
}

