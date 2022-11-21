package lecture03;
import java.util.*;

public class Exercise3_4 {
    public static void main(String[] args) {
        List<Vegetable> ArrayList=new ArrayList<>();
        ArrayList.add(new Vegetable("にんじん",117));
        ArrayList.add(new Vegetable("たまねぎ",120));
        ArrayList.add(new Vegetable("じゃがいも",154));
        for (Vegetable a:ArrayList){
            a.print();
        }
    }
}
