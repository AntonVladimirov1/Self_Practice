package Live_Sessions;

public class Prime {

    public static boolean isPrime(int n){
        for (int i = 2; i < n; i++) {
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static String primeInRange(int range){
        String prime = "";
        for (int i = 2; i <= range; i++) {
            if (isPrime(i)){
                prime += i +", ";
            }
        }
        return prime;
    }

    public static void main(String[] args) {

        System.out.println(primeInRange(30));
    }
}
