package lecture07;

import java.util.Map;
import java.util.function.Supplier;

public enum MonsterCreator {
    MONKEY,PENGUIN,TURTLE;


    private int id;
    private Supplier<Monster> supplier;

    private Map<Integer,MonsterCreator> monsterCreatorMap;
    public void viewMonsterList(){

    };
    public int monsterMinId(){
        return 0;
    };
    public int monsterMaxId(){
        return 0;
    };
}

