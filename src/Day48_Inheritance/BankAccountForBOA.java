package Day48_Inheritance;

public class BankAccountForBOA {

    public static String bankName;

    static {
        bankName="BOA";
    }
    public String firstName;
    public String lastName;

    private String accountHolder;
    private int accountNumber;
    private double balance;

    public BankAccountForBOA(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }

    public void setAccountHolder(String accountHolder){
        this.accountHolder=accountHolder;
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber=accountNumber;
    }

    public void setBalance(double balance){
        this.balance=balance;
    }

    public String getAccountHolder(){
        return accountHolder;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public double getBalance(){
        return balance;
    }

    public void checkBalance(){
        System.out.println("Available Balance: "+getBalance());
    }

    public void deposit(int amount){
        System.out.println("Depositing $ "+amount+" to "+accountNumber);
        balance+=amount;
    }

    public void withDraw(int amount){
        if (amount<=0){
            System.out.println("Invalid amount");
            return;
        }
        if(amount>balance){
            System.out.println("not enough balance");
            return;
        }
        System.out.println("Withdrawing $ "+amount+" from "+accountNumber);
        balance-=amount;
    }

    public String toString(){
        return bankName+
                "\n================================"+
                "\n"+firstName+" "+lastName+
                "\nAccount Number: "+getAccountNumber()+
                "\n================================"+
                "\nBalance: "+getBalance();


    }




}
