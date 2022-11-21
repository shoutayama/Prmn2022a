package lecture04;

public class Exercise4_1 {
    public static void main(String[] args) {
        Fighter fighter1=new Fighter(210,100,"fighter1");
        Fighter fighter2=new Fighter(180,150,"fighter2");

        while (true){
            fighter1.attack(fighter2);
            if (!fighter2.isAlive()) break;
            fighter2.attack(fighter1);
            if (!fighter1.isAlive()) break;
        }
        String name= fighter1.isAlive()? fighter1.getName() : fighter2.getName();
        System.out.println(name+" WIN!");
    }
}
