package lecture07;

public class HP {
    protected int hp;
    protected final int dead=0;

    public boolean isAlive() {
        return hp>dead;
    }
    public int getHp(){
        return hp;
    }
}
