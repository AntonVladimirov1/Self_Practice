package day17_CustomClass;

public class BankAccount {

    public String accountHolder;
    public long accountNumber;
    public double balance;


    public void setInfo(String accountHolder, long accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
    }

    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }

    public void checkBalance(){
        System.out.println("Your available balance is: "+balance);

    }

    public void deposit(double amount){
        if (amount < 1){
            System.out.println("Insufficient deposit amount: "+amount);
            return;
        }
        System.out.println("Depositing "+amount+" to "+accountHolder);
        balance += amount;
    }

    public void withdraw(double amount){
        if (amount > balance){
            System.out.println("Insufficient withdrawal amount: "+amount);
            return;
        }else if (amount>=5000){
            System.out.println("Maximum withdrawal amount per day = 5000$");
            return;
        }

        System.out.println("Withdrawing "+amount+" from "+accountHolder);
        balance -= amount;
    }

}
