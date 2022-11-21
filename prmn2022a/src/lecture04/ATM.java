package lecture04;

import java.util.ArrayList;
import java.util.List;

public class ATM {
    private static List<Account> accountList;
    public ATM(){
        accountList=new ArrayList<>();
    }

    public void registerAccount(String name,String number){
        accountList.add(new Account(name,number));
        System.out.println("account is created");
    }
    public boolean exitsAccount(String name,String number){
        int flag=0;
        for (Account a:accountList){
            if (a.getNumber().equals(number)&&a.getName().equals(name)) flag=1;
        }
        return flag==1;
    }
    public void deposit(String number,long money){
        for (Account a:accountList){
            if (a.getNumber()==number){
                a.setBalance(a.getBalance()+money);
                System.out.println("口座番号: "+number+" から "+money+" 円入金しました。");
                System.out.println("残高"+a.getBalance());
            }
        }
    }
    public long withdraw(String number,long money){
        for (Account a:accountList){
            if (a.getNumber()==number){
                if (a.getBalance()>=money){
                a.setBalance(a.getBalance()-money);
                System.out.println("口座番号: "+number+" から "+money+" 円引き出しました。");
                System.out.println("残高"+a.getBalance());
                return money;
            }
            else {
                System.out.println("引き出せませんでした");
                System.out.println("残高"+a.getBalance());
            }
        }
        }
        return 0;
    }
}
