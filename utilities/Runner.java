package utilities;

public class Runner {
    public static void main(String[] args) {

        int[] list = {1,2,3,4,5,5,4,3,2,9,7,2,};

        int count =0;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < i; j++) {
                if (list[i]==list[j]){
                    count++;
                }
            }
            if (count==1){
                System.out.println();
            }
        }


    }
}

