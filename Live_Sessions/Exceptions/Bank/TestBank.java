package Live_Sessions.Exceptions.Bank;

public class TestBank {
    public static void main(String[] args) {

        Bank bank = new Bank(1000,65464546);

        bank.withdraw(400);
        System.out.println(bank.getBalance());

        Bank bank1 = new Bank(2000,64654654);
        try {
            bank1.setBalance(-500);
        } catch (CannotBeNegativeException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        System.out.println("END");

    }
}
