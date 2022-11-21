package lecture04;

public class Exercise4_2 {
    public static void main(String[] args) {
        ATM atm=new ATM();
        String messsage =atm.exitsAccount("aaa","123456")?"account exits":"account doesnt exit";
        System.out.println(messsage);
        atm.registerAccount("aaa","123456");
        messsage =atm.exitsAccount("aaa","123456")?"account exits":"account doesnt exit";
        System.out.println(messsage);
        atm.deposit("123456",1000);
        atm.withdraw("123456",2000);
        atm.withdraw("123456",500);
    }
}
