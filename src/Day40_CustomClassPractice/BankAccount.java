package Day40_CustomClassPractice;

public class BankAccount {
    String accountType;
    String accountHolder;
    String accountNumber;
    double balance;

    public void setAccountInfo(String clientAccountType, String name,String acctNum){
        accountType=clientAccountType;
        accountHolder=name;
        accountNumber=acctNum;
    }

    public void getAccountInfo(){
        System.out.println("Account Holder: "+accountHolder);
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Available Balance: "+balance);
    }

    public void checkBalance(){
        System.out.println("Available Balance: "+balance);
    }

    public void deposit(double amount){
        System.out.println("Depositing $ "+amount+" to "+accountNumber);
        balance+=amount;
    }

    public void withDraw(double amount){
        if(amount>balance){
            System.out.println("not enough balance");
            return;
        }
        System.out.println("Withdrawing $ "+amount+" from "+accountNumber);
        balance-=amount;
    }


}
