package lecture07.monster;

public class HP {
    private int hp;
    private final int dead=0;

    public boolean isAlive() {
        return hp>dead;
    }
    public int getHp(){
        return hp;
    }
}
