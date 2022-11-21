package lecture03;
import java.util.*;
public class Exercise3_3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("1つ目の整数を入力してください:");
        String n = scanner.nextLine();
        System.out.println("2つ目の整数を入力してください:");
        String m=scanner.nextLine();
        try {
            System.out.println(Integer.parseInt(n)+Integer.parseInt(m));
        }catch (NumberFormatException e){
            System.out.println("Error");
        }
    }
}
