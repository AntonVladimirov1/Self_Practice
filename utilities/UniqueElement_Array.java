package utilities;

public class UniqueElement_Array {
    public static void main(String[] args) {

        int[] array ={1,2,3,4,1,2,3,5,7};

        for (int each : array) {
            int count = 0;
            for (int element : array) {
                if (element == each){
                    count++;
                }
            }
            if (count ==1){
                System.out.println("Unique = "+each);
            }
        }

    }
}
