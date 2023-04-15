package Live_Sessions.Inheritance.Amazon;

import Live_Sessions.Inheritance.Amazon.AmazonAccount;

public class UseAmazon {
    public static void main(String[] args) {

        AmazonAccount account1 = new AmazonAccount("Java","Java123@gmail.com",false);
        System.out.println(account1.getEmail());

        account1.setEmail("python123@");
        System.out.println(account1);

    }
}
