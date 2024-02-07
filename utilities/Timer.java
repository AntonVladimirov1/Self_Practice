package utilities;

public class Timer {
    public static void main(String[] args) throws InterruptedException {

//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter time (minutes):");
//        int minutes = scan.nextInt();
//        scan.close();

        int minutes = 1 ;

        for (int i = minutes; i >0 ; i--) {
            for (int z = 59; z >=0; z--) {

                System.out.print("\r"+(i-1)+" min : "+z+" sec  left");
                Thread.sleep(1000);
            }
        }
        System.out.println("\t");
        System.err.println("   ====================");
        System.err.println("  ==>   Time is UP   <==");
        System.err.println("   ====================");

    }


}
