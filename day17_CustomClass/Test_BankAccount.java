package day17_CustomClass;

public class Test_BankAccount {
    public static void main(String[] args) {

        BankAccount account1= new BankAccount();
        account1.setInfo("Anton",123456789);

        System.out.println(account1);
        account1.deposit(100_000);
        account1.checkBalance();

        account1.withdraw(50_000);
        account1.checkBalance();

        account1.deposit(-10_000);
        account1.checkBalance();

        account1.withdraw(51_000);
        account1.checkBalance();

        System.out.println("====================================");

        BankAccount account2=new BankAccount();
        account2.setInfo("Dzinda",987654321);

        BankAccount account3=new BankAccount();
        account3.setInfo("Maximus",888888888);

        account2.deposit(150_000);
        System.out.println(account2);

        account3.deposit(70_000);
        System.out.println(account3);

        account3.withdraw(5100);
        account3.checkBalance();

    }
}
