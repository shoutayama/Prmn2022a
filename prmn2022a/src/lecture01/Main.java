package lecture01;

public class Main {
    public static void main(String[] args) {
        System.out.println("B2212540 Shouta Yamaguchi");

        int studentNumber=2212540;
        System.out.println("B"+studentNumber+"Shouta Yamaguchi");

        int age =20;
        if (age>=0&&age<20){
            System.out.println("I am "+age+" years old so I cannot drink liquor.");
        } else if (age>=20&&age<=120) {
            System.out.println("I am "+age+" years old so I can drink liquor.");
        }

    }
}
