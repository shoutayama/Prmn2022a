package lecture03;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise3_2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<String> ArrayList = new ArrayList<>();
        System.out.println("何行分入力しますか？");
        int n=scanner.nextInt();
        scanner.nextLine();
        for (int i=0;i<n;i++){
            System.out.println(i+1+"行目:");
            String s=scanner.nextLine();
            ArrayList.add(s);
        }
        for (String s:ArrayList){
            System.out.println(ArrayList.indexOf(s)+s);
        }
    }
}
