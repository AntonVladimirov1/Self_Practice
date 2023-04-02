package Live_Sessions;

public class CommonElements_2dArray {
    public static void main(String[] args) {

        int[][] arr = {{4,1,24,5},{24,1,5,2},{4,1,5,1}};

        for (int i = 0; i < arr[0].length; i++) { // first inner array
            //System.out.println(arr[0][i]);

            int isCommon = 1;

            for (int j = 1; j < arr.length; j++) { // going through the rest of the 2d array
                //System.out.println(Arrays.toString(arr[j]));
                for (int each : arr[j]) {
                    if (each == arr[0][i]){
                        isCommon++;
                        break;
                    }
                }
            }
            if (isCommon ==arr.length){
                System.out.println(arr[0][i]);
            }
        }

    }
}