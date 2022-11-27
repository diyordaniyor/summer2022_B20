package Day40_CustomClassPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class CapitalOne {
    public static void main(String[] args) {
        BankAccount Beslan = new BankAccount();
        BankAccount Diyor = new BankAccount();
        BankAccount Rasul = new BankAccount();
        BankAccount Abbos = new BankAccount();
        BankAccount Ali = new BankAccount();

        Beslan.setAccountInfo("Checking","Beslan", "435435435354");
        Diyor.setAccountInfo("Checking","Diyor", "435435432321");
        Rasul.setAccountInfo("Checking","Rasul", "435435435674");
        Abbos.setAccountInfo("Checking","Abbos", "435435433467");
        Ali.setAccountInfo("Checking","Ali", "435435412569");

        ArrayList<BankAccount> accounts = new ArrayList<>();
        accounts.addAll(Arrays.asList(Beslan,Diyor,Rasul,Abbos,Ali));


        for (BankAccount each: accounts){
            each.deposit(500);
            each.getAccountInfo();
        }

        accounts.get(3).deposit(10000);
        accounts.get(3).checkBalance();
        accounts.get(3).withDraw(9000);
        accounts.get(3).checkBalance();

        System.out.println("==================");

        accounts.removeIf(each->each.balance<1000);
        System.out.println(accounts.size());


    }
}
